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
public interface Crud<Model> {
    public boolean crear(Model model);
    public Model leer(Model model);
    public ArrayList<Model> leer();
    public ArrayList<Model> leer(String filter);
    public boolean actualizar(Model model);
    public boolean borrar(Model model);
    
//    Model leerPorId(int id);
//    void registrar (Model model);
//    void actualizar(Model model);
//    void eliminar(int id);
}
