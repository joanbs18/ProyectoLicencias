/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import Conector.Conexion;


/**
 *
 * @author joans
 */
public class NewMain {

    static Conexion c = new Conexion();
//
//    public static void comprobar() {
//        if (Conexion.connection != null) {
//            System.out.println("Conectado");
//        }
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            c.conectar();
//            comprobar();
        } catch (Exception ex) {
            System.out.println("Fallo al conectar");
        }
    }

}
