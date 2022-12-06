/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import Data.Conexiones.Conexion;
import Data.Daos.DaoFechasDisponibles;
import MVC.Modelos.FechasDisponibles;
import MVC.Vistas.Vista;
import java.util.ArrayList;

/**
 *
 * @author joans
 */
public class ControladorFechaDisponibles implements Controlador<FechasDisponibles> {

    protected Vista vista;
    protected ArrayList<FechasDisponibles> list;// un conjunto de datos 
    protected FechasDisponibles fecha;
    protected DaoFechasDisponibles dao;

    @Override
    public ArrayList<FechasDisponibles> getLista() {
        return list;
    }

    @Override
    public void setModelo(FechasDisponibles modelo) {
        fecha = modelo;
    }

    @Override
    public FechasDisponibles getModelo() {
        return fecha;
    }

    @Override
    public void setVista(Vista vista) {
        this.vista = vista;
    }

    @Override
    public void crear(FechasDisponibles modelo) {
        if (dao.crear(modelo)) {
            this.vista.mostarMensaje("Registro agregado correctamente", Vista.messageTypeSuccess);

        }
    }


@Override
public void leer(FechasDisponibles modelo) {
fecha=dao.leer(modelo);
vista.mostarDato();
}

    @Override
public void leer() {
    this.list=dao.leer();//trabaja con dao para obtener una lista
        this.vista.mostarDato();
}

    @Override
public void leer(String filter) {
 this.list=dao.leer(filter);
        this.vista.mostarDato();    }

    public ControladorFechaDisponibles(Vista vista) {
        this.vista = vista;
        this.list =  new ArrayList<FechasDisponibles>();
        this.fecha =new FechasDisponibles();
        this.dao =new DaoFechasDisponibles(new Conexion());
    }



    @Override
public void actualizar(FechasDisponibles modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
public void borrar(FechasDisponibles modelo) {
 if (this.dao.borrar(modelo)){
                this.vista.mostarMensaje("Registro borrado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al borrar el registro", Vista.messageTypeError);
            }    }

}
