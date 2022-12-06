/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import Data.Conexiones.Conexion;
import Data.Daos.DaoCita;
import MVC.Modelos.Cita;
import MVC.Modelos.Persona;
import MVC.Vistas.Vista;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class ControladorCita implements Controlador<Cita>{
    protected Vista vista;
    protected ArrayList<Cita> list;// un conjunto de datos 
    protected Cita cita;
    protected DaoCita dao;

    @Override
    public ArrayList<Cita> getLista() {
        return this.list;
    }
    
    @Override
    public void setModelo(Cita cita){
        this.cita=cita;
    }
    
    @Override
    public Cita getModelo() {
        return this.cita;
    }

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    public ControladorCita(Vista vista){
        this.vista = vista;
        this.list=new ArrayList<Cita>();
        this.cita=new Cita();
        this.dao=new DaoCita(new Conexion());
        
    }

    @Override
    public void crear(Cita cita) {
        if (this.validar(cita)){
            if (this.dao.crear(cita)){
                this.vista.mostarMensaje("Registro agregado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al agregar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void leer(Cita cita) {
        this.cita=dao.leer(cita);
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
    public void actualizar(Cita cita) {
        if (this.validar(cita)){
            if (this.dao.actualizar(cita)){
                this.vista.mostarMensaje("Registro actualizado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al actualizar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void borrar(Cita cita) {
        if (this.validar(cita)){
            if (this.dao.borrar(cita)){
                this.vista.mostarMensaje("Registro borrado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al borrar el registro", Vista.messageTypeError);
            }
        }
    }

    private boolean validar(Cita cita) {
        return cita.isComplete();
    }
    
    

    
}
