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
public interface Controller<Modelo> {//parametro para la interfaz para que trabaje con diferentes objetos
    public ArrayList<Modelo> getList();
    public void setModel(Modelo modelo);
    public Modelo getModel();
    public void setView(Vista vista);
    public void create(Modelo modelo);
    public void read(Modelo modelo);
    public void read();
    public void read(String filter);
    public void update(Modelo modelo);
    public void delete(Modelo modelo);
}
