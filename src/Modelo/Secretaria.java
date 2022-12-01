/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joans
 */
public class Secretaria extends Usuario implements Model{

    public Secretaria(Integer Carnet, Integer IdPersona, String Contraseña) {
        super(Carnet, IdPersona, Contraseña);
    }

    @Override
    public boolean verificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
