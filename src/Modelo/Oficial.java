/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joans
 */
public class Oficial extends Usuario implements Model{
    private double Salario;

    public Oficial(Integer Carnet, Integer IdPersona, String Contraseña,double Salario) {
        super(Carnet, IdPersona, Contraseña);
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }

    @Override
    public boolean verificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
