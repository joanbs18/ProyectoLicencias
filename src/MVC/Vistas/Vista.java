/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MVC.Vistas;

import MVC.Controlador.Controlador;


/**
 *
 * @author Francisco
 */
public interface Vista<Modelo> {
    public static int messageTypeSuccess=1;
    public static int messageTypeError=2;
    public static int messageTypeConfirm=3;
    
    public void setControlador(Controlador controlador);
    public void mostarDato();
    public void mostarMensaje(String msg,int messageType);
}
