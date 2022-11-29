/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joans
 */
public class ConectorPhpMyAdmin extends Conector {

    protected Connection connection;
    protected PreparedStatement transact;
    protected ResultSet data;

    public Connection getConnection() {
        return connection;
    }

    public PreparedStatement getTransact() {
        return transact;
    }

    public ResultSet getData() {
        return data;
    }

    public ConectorPhpMyAdmin() {

        this.url = "jdbc:mysql://LocalHost:3306/Licencia";
        this.user = "root";
        this.pass = "";

    }

    @Override
    public void conectar() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(url, user, pass);
    }

    @Override
    public void desconectar() {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConectorPhpMyAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void prepararConsulta(String consulta) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarParametros(int index, Object param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[][] ejecutarConsulta() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean ejecutarActualizacion() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
