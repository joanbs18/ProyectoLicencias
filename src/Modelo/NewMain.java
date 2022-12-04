/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import Data.Conexiones.Conexion;
import Data.Daos.DaoCliente;
import Data.Daos.DaoPersona;
import Data.Daos.DaoSecretaria;
import MVC.Modelos.Cliente;
import MVC.Modelos.Persona;
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
        //prueba cliente
//        Cliente cli = new Cliente(0,4);
//        DaoCliente dao = new DaoCliente (new Conexion());
//        
//        System.out.println(dao.crear(cli));
//        System.out.println(dao.getError());
        //prueba persona
        Persona neutro = new Persona(0,344547, "Juan", "2022-12-01", "fr@gmail.com","7465362553");
//        Persona neutro = new Persona(4);

        DaoPersona dao = new DaoPersona(new Conexion());

        System.out.println(dao.crear(neutro));
        System.out.println(dao.getError());
    }

}
