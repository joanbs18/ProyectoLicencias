/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoUsuario extends Dao<Usuario> implements Crud<Usuario> {

    public DaoUsuario(Conector conector) {
        this.conector = conector;
    }

    @Override
    public boolean crear(Usuario modelo) {
        this.error="";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarUsuario(?,?)");
            this.conector.addParameter(1, modelo.getIdPersona());
            this.conector.addParameter(2, modelo.getTipoUsuario());
            
            return this.conector.executeUpdate();
         
        } catch (Exception ex) {
            this.error=ex.toString();
        }finally{
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public String getError() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario leer(Usuario modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Usuario> leer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Usuario> leer(String filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Usuario model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean borrar(Usuario model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
