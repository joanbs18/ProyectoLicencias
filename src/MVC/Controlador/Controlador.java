/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MVC.Controlador;



import MVC.Vistas.Vista;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public interface Controlador<Modelo> {//parametro para la interfaz para que trabaje con diferentes objetos
    public ArrayList<Modelo> getLista();
    public void setModelo(Modelo modelo);
    public Modelo getModelo();
    public void setVista(Vista vista);
    public void crear(Modelo modelo);
    public void leer(Modelo modelo);
    public void leer();
    public void leer(String filter);
    public void actualizar(Modelo modelo);
    public void borrar(Modelo modelo);
}
