/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import Data.Conexiones.Conexion;
import Data.Daos.DaoCliente;
import MVC.Modelos.Cliente;
import MVC.Modelos.Persona;

import MVC.Vistas.Vista;
import java.util.ArrayList;



/**
 *
 * @author Francisco
 */
public class ControladorCliente implements Controlador<Cliente>{
    protected Vista vista;
    protected ArrayList<Cliente> list;// un conjunto de datos 
    protected Cliente cliente;
    protected DaoCliente dao;

    @Override
    public ArrayList<Cliente> getLista() {
        return this.list;
    }
    
    @Override
    public void setModelo(Cliente cliente){
        this.cliente=cliente;
    }
    
    @Override
    public Cliente getModelo() {
        return this.cliente;
    }

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    public ControladorCliente(Vista vista){
        this.vista = vista;
        this.list=new ArrayList<Cliente>();
        this.cliente=new Cliente();
        this.dao=new DaoCliente(new Conexion());
        
    }

    @Override
    public void crear(Cliente cliente) {
      // if (this.validar(cliente)){
            if (this.dao.crear(cliente)){
                this.vista.mostarMensaje("Registro agregado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al agregar el registro", Vista.messageTypeError);
            }
       // }
    }

    @Override
    public void leer(Cliente ciente) {
        this.cliente=dao.leer(ciente);
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
    public void actualizar(Cliente ciente) {
        if (this.validar(cliente)){
            if (this.dao.actualizar(cliente)){
                this.vista.mostarMensaje("Registro actualizado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al actualizar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void borrar(Cliente ciente) {
        if (this.validar(cliente)){
            if (this.dao.borrar(cliente)){
                this.vista.mostarMensaje("Registro borrado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al borrar el registro", Vista.messageTypeError);
            }
        }
    }

    private boolean validar(Cliente cliente) {
        return cliente.isComplete();
    }

    
}
