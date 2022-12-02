/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conector;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author joans
 */
public class Conexion {
     public Connection Conectar(){
        Connection cn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://LocalHost:3306/licencias","root","");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return cn;
    }
}
