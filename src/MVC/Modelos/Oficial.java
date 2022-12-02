/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author joans
 */
public class Oficial extends Usuario {
    private double Salario;

    public Oficial(Integer Carnet, Integer IdPersona, String Contraseña,double Salario) {
        super(Carnet, IdPersona, Contraseña);
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }

   
    
    
    
}
