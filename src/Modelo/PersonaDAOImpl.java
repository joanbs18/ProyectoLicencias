/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Conector.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author joans
 */
public class PersonaDAOImpl implements PersonaDAO{
Connection conexion;
Conexion conex;
PreparedStatement ps;
    @Override
    public Persona leerPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrar(Persona model) {
    this.conexion=null;
   
   
    try {
        this.conexion= this.conex.Conectar();
        this.ps=conexion.prepareStatement("CALL Insertar_Persona(?,?,?,?,?)");
        this.ps.setInt(1, model.getCedula());
        ps.setString(2, model.getNombreCompleto());
        ps.setString(3,model.getFechaNacimiento());
        ps.setString(4, model.getEmail());
        ps.setString(5,model.getTelefono());
        ps.executeUpdate();
        JOptionPane.showConfirmDialog(null, "REGISTRADO");
    } catch (SQLException ex) {
        Logger.getLogger(PersonaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void actualizar(Persona model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
