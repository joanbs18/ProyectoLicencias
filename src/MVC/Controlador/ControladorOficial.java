/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import Data.Conexiones.Conexion;
import Data.Daos.DaoOficial;
import MVC.Modelos.Oficial;
import MVC.Modelos.Persona;
import MVC.Vistas.Vista;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class ControladorOficial implements Controlador<Oficial>{
    protected Vista vista;
    protected ArrayList<Oficial> list;// un conjunto de datos 
    protected Oficial oficial;
    protected DaoOficial dao;

    @Override
    public ArrayList<Oficial> getLista() {
        return this.list;
    }
    
    @Override
    public void setModelo(Oficial oficial){
        this.oficial=oficial;
    }
    
    @Override
    public Oficial getModelo() {
        return this.oficial;
    }

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    public ControladorOficial(Vista vista){
        this.vista = vista;
        this.list=new ArrayList<Oficial>();
        this.oficial=new Oficial();
        this.dao=new DaoOficial(new Conexion());
        
    }

    @Override
    public void crear(Oficial oficial) {
        if (this.validar(oficial)){
            if (this.dao.crear(oficial)){
                this.vista.mostarMensaje("Registro agregado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al agregar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void leer(Oficial oficial) {
        this.oficial=dao.leer(oficial);
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
    public void actualizar(Oficial oficial) {
        if (this.validar(oficial)){
            if (this.dao.actualizar(oficial)){
                this.vista.mostarMensaje("Registro actualizado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al actualizar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void borrar(Oficial oficial) {
            if (this.dao.borrar(oficial)){
                this.vista.mostarMensaje("Registro borrado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al borrar el registro", Vista.messageTypeError);
            }
    }

    private boolean validar(Oficial oficial) {
        return oficial.isComplete();
    }

    
}
