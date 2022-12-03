/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import Data.Conexiones.Conexion;
import Data.Daos.DaoPersona;
import MVC.Modelos.Persona;
import MVC.Vistas.Vista;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class ControladorPersona implements Controlador<Persona>{
    protected Vista vista;
    protected ArrayList<Persona> list;// un conjunto de datos 
    protected Persona persona;
    protected DaoPersona dao;

    @Override
    public ArrayList<Persona> getLista() {
        return this.list;
    }
    
    @Override
    public void setModelo(Persona persona){
        this.persona=persona;
    }
    
    @Override
    public Persona getModelo() {
        return this.persona;
    }

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    public ControladorPersona(Vista vista){
        this.vista = vista;
        this.list=new ArrayList<Persona>();
        this.persona=new Persona();
        this.dao=new DaoPersona(new Conexion());
        
    }

    @Override
    public void crear(Persona persona) {
        if (this.validar(persona)){
            if (this.dao.crear(persona)){
                this.vista.mostarMensaje("Registro agregado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al agregar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void leer(Persona persona) {
        this.persona=dao.leer(persona);
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
    public void actualizar(Persona persona) {
        if (this.validar(persona)){
            if (this.dao.actualizar(persona)){
                this.vista.mostarMensaje("Registro actualizado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al actualizar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void borrar(Persona persona) {
        if (this.validar(persona)){
            if (this.dao.borrar(persona)){
                this.vista.mostarMensaje("Registro borrado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al borrar el registro", Vista.messageTypeError);
            }
        }
    }

    private boolean validar(Persona persona) {
        return persona.isComplete();
    }
    
    
}
