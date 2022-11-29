/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRUD;

/**
 *
 * @author joans
 */
public interface Crud<Model> {
    Model leerPorId(int id);
    void registrar (Model model);
    void actualizar(Model model);
    void eliminar(int id);
}
