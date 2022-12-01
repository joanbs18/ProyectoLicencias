/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author joans
 */
public class Persona implements Model{

    private Integer Id;
    private Integer Cedula;
    private String NombreCompleto;
    private String FechaNacimiento;
    private String Email;
    private String Telefono;

    public Persona(Integer Id, Integer Cedula, String NombreCompleto, String FechaNacimiento, String Email, String Telefono) {
        this.Id = Id;
        this.Cedula = Cedula;
        this.NombreCompleto = NombreCompleto;
        this.FechaNacimiento = FechaNacimiento;
        this.Email = Email;
        this.Telefono = Telefono;
    }

    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getCedula() {
        return Cedula;
    }

    public void setCedula(Integer Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public boolean verificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
