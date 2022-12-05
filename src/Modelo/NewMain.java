/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import Data.Conexiones.Conexion;
import Data.Daos.DaoCita;
import Data.Daos.DaoCliente;
import Data.Daos.DaoPersona;
import Data.Daos.DaoSecretaria;
import MVC.Modelos.Cita;
import MVC.Modelos.Cliente;
import MVC.Modelos.Oficial;
import MVC.Modelos.Persona;
import MVC.Modelos.Prueba;
import MVC.Modelos.Secretaria;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
        Cliente cli = new Cliente(1,16);
        DaoCliente dao = new DaoCliente (new Conexion());
        
        System.out.println(dao.borrar(cli));
        System.out.println(dao.getError());
        //prueba persona
//        Persona neutro = new Persona(0,344547, "Juan", "2022-12-01", "fr@gmail.com","7465362553");
////        Persona neutro = new Persona(4);
//
//        DaoPersona dao = new DaoPersona(new Conexion());
//
//        System.out.println(dao.crear(neutro));
//        System.out.println(dao.getError());
            
            //citas
//            Cita c=new Cita(null, 1, "2022-12-23", "12:00:00", true);
//            DaoCita dao=new DaoCita(new Conexion());
//            System.out.println(dao.crear(c));
//        System.out.println(dao.getError());

        //prueba salario deducciones
//        Oficial of= new Oficial(1, 2, "fran", "123", 900000.);
//        of.salarioNetoCalcular(of.getSalario());

        //prueba de la prueba jaja
//        LocalDateTime hoy = LocalDateTime.now(); 
//        String fecha1= String.valueOf(hoy.getYear()+"-"+hoy.getMonthValue()+"-"+hoy.getDayOfMonth());
//        Prueba pru=new Prueba(1, fecha1, 847, 34, 2, 100.,null,null);
//        System.out.println(pru.toString());
        
    }

}
