/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import Data.Conexiones.Conexion;
import Data.Daos.DaoSecretaria;
import MVC.Modelos.Secretaria;


/**
 *
 * @author joans
 */
public class NewMain {

//    static Conexion c = new Conexion();
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

        Secretaria secre = new Secretaria(5,1,"fran","ff3");
        DaoSecretaria dao = new DaoSecretaria (new Conexion());
        
        System.out.println(dao.actualizar(secre));
        System.out.println(dao.getError());
    }

}
