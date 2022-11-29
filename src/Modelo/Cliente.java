/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joans
 */
public class Cliente implements Model{
    private Integer id;
    private Integer cedula;
    private String nombreCompleto;
    private String fechaNacimiento;
    private String email;

    public Cliente(Integer id, Integer cedula, String nombreCompleto, String fechaNacimiento, String email) {
        this.id = id;
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    public Cliente(Integer cedula, String nombreCompleto, String fechaNacimiento, String email) {
        this(null,cedula,nombreCompleto,fechaNacimiento,email);
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean verificador() {
return !nombreCompleto.isEmpty();
        }
    
    
    
    
}
