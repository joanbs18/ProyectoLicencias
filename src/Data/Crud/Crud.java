/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Data.Crud;

import java.util.ArrayList;

/** 
 *
 * @author joans
 */
public interface Crud<Modelo> {
    public boolean crear(Modelo model);
    public Modelo leer(Modelo modelo);
    public ArrayList<Modelo> leer();
    public ArrayList<Modelo> leer(String filter);
    public boolean actualizar(Modelo model);
    public boolean borrar(Modelo model);
    
//    Model leerPorId(int id);
//    void registrar (Model model);
//    void actualizar(Model model);
//    void eliminar(int id);
}
