/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import Data.Conexiones.Conexion;
import Data.Daos.DaoPersona;
import Data.Daos.DaoPrueba;
import MVC.Modelos.Persona;
import MVC.Modelos.Prueba;
import MVC.Vistas.Vista;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class ControladorPrueba implements Controlador<Prueba>{
    protected Vista vista;
    protected ArrayList<Prueba> list;// un conjunto de datos 
    protected Prueba prueba;
    protected DaoPrueba dao;

    @Override
    public ArrayList<Prueba> getLista() {
        return this.list;
    }
    
    @Override
    public void setModelo(Prueba prueba){
        this.prueba=prueba;
    }
    
    @Override
    public Prueba getModelo() {
        return this.prueba;
    }

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    public ControladorPrueba(Vista vista){
        this.vista = vista;
        this.list=new ArrayList<Prueba>();
        this.prueba=new Prueba();
        this.dao=new DaoPrueba(new Conexion());
        
    }

    @Override
    public void crear(Prueba prueba) {
        if (this.validar(prueba)){
            if (this.dao.crear(prueba)){
                this.vista.mostarMensaje("Registro agregado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al agregar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void leer(Prueba prueba) {
        this.prueba=dao.leer(prueba);
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
    public void actualizar(Prueba prueba) {
        if (this.validar(prueba)){
            if (this.dao.actualizar(prueba)){
                this.vista.mostarMensaje("Registro actualizado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al actualizar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void borrar(Prueba prueba) {
        if (this.validar(prueba)){
            if (this.dao.borrar(prueba)){
                this.vista.mostarMensaje("Registro borrado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al borrar el registro", Vista.messageTypeError);
            }
        }
    }

    private boolean validar(Prueba prueba) {
        return prueba.isComplete();
    }
    
}
