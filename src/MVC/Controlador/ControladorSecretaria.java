/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;


import Data.Conexiones.Conexion;
import Data.Daos.DaoSecretaria;
import MVC.Modelos.Persona;
import MVC.Modelos.Secretaria;
import MVC.Vistas.Vista;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class ControladorSecretaria implements Controlador<Secretaria>{
    protected Vista vista;
    protected ArrayList<Secretaria> list;// un conjunto de datos 
    protected Secretaria secretaria;
    protected DaoSecretaria dao;

    @Override
    public ArrayList<Secretaria> getLista() {
        return this.list;
    }
    
    @Override
    public void setModelo(Secretaria secretaria){
        this.secretaria=secretaria;
    }
    
    @Override
    public Secretaria getModelo() {
        return this.secretaria;
    }

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    public ControladorSecretaria(Vista vista){
        this.vista = vista;
        this.list=new ArrayList<Secretaria>();
        this.secretaria=new Secretaria();
        this.dao=new DaoSecretaria(new Conexion());
        
    }

    @Override
    public void crear(Secretaria secretaria) {
        if (this.validar(secretaria)){
            if (this.dao.crear(secretaria)){
                this.vista.mostarMensaje("Registro agregado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al agregar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void leer(Secretaria secretaria) {
        this.secretaria=dao.leer(secretaria);
        this.vista.mostarDato();
    }
    
    @Override
    public void leer() {
        this.list=dao.leer();//trabaja con dao para obtener una lista
        this.vista.mostarDato();
    }
    
    @Override
    public void leer(String filtrar) {
        this.list=dao.leer(filtrar);
        this.vista.mostarDato();
    }

     @Override
    public void actualizar(Secretaria secretaria) {
        if (this.validar(secretaria)){
            if (this.dao.actualizar(secretaria)){
                this.vista.mostarMensaje("Registro actualizado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al actualizar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void borrar(Secretaria secretaria) {
        if (this.validar(secretaria)){
            if (this.dao.borrar(secretaria)){
                this.vista.mostarMensaje("Registro borrado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al borrar el registro", Vista.messageTypeError);
            }
        }
    }

    private boolean validar(Secretaria secretaria) {
        return  secretaria.isComplete();
    }

    
    
}
