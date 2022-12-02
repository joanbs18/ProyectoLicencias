/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author joans
 */
public class Usuario {
    protected Integer Carnet;
    protected Integer IdPersona;
    protected String Contraseña;

    public Usuario(Integer Carnet, Integer IdPersona, String Contraseña) {
        this.Carnet = Carnet;
        this.IdPersona = IdPersona;
        this.Contraseña = Contraseña;
    }

    public Integer getCarnet() {
        return Carnet;
    }

    public void setCarnet(Integer Carnet) {
        this.Carnet = Carnet;
    }

    public Integer getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(Integer IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
}
