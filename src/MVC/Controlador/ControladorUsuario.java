/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import Data.Conexiones.Conexion;
import Data.Daos.DaoUsuario;
import MVC.Modelos.Usuario;
import MVC.Vistas.Vista;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class ControladorUsuario implements Controlador<Usuario>{
    protected Vista vista;
    protected ArrayList<Usuario> list;// un conjunto de datos 
    protected Usuario usuario;
    protected DaoUsuario dao;

     @Override
    public ArrayList<Usuario> getLista() {
        return this.list;
    }
    
    @Override
    public void setModelo(Usuario usuario){
        this.usuario=usuario;
    }
    
    @Override
    public Usuario getModelo() {
        return this.usuario;
    }

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    public ControladorUsuario(Vista vista){
        this.vista = vista;
        this.list=new ArrayList<Usuario>();
        this.usuario=new Usuario();
        this.dao=new DaoUsuario(new Conexion());
        
    }

    @Override
    public void crear(Usuario usuario) {
        if (this.validar(usuario)){
            if (this.dao.crear(usuario)){
                this.vista.mostarMensaje("Registro agregado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al agregar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void leer(Usuario usuario) {
        this.usuario=dao.leer(usuario);
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
    public void actualizar(Usuario usuario) {
        if (this.validar(usuario)){
            if (this.dao.actualizar(usuario)){
                this.vista.mostarMensaje("Registro actualizado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al actualizar el registro", Vista.messageTypeError);
            }
        }
    }

    @Override
    public void borrar(Usuario usuario) {
        if (this.validar(usuario)){
            if (this.dao.borrar(usuario)){
                this.vista.mostarMensaje("Registro borrado correctamente", Vista.messageTypeSuccess);
            }else{
                this.vista.mostarMensaje("Error al borrar el registro", Vista.messageTypeError);
            }
        }
    }

    private boolean validar(Usuario usuario) {
        return  usuario.isComplete();
    }
    
}
