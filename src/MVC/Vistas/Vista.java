/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MVC.Vistas;

import MVC.Controlador.Controller;

import java.util.ArrayList;
import MVC.Modelos.Modelo;

/**
 *
 * @author Francisco
 */
public interface Vista<Modelo> {
    public static int messageTypeSuccess=1;
    public static int messageTypeError=2;
    public static int messageTypeConfirm=3;
    
    public void setController(Controller controller);
    public void showData();
    public void showMessage(String msg,int messageType);
}
