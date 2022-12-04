/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author joans
 */
public class Persona implements Modelo{

    private Integer id;
    private Integer cedula;
    private String nombreCompleto;
    private String fechaNacimiento;
    private String email;
    private String telefono;

    public Persona(Integer id, Integer cedula, String nombreCompleto, String fechaNacimiento, String email, String telefono) {
        this.id = id;
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }
   
    
    public Persona() {
        this(null,null,null,null,null,null);
    }
    public Persona(Integer cedula, String nombreCompleto, String fechaNacimiento, String email, String telefono) {
        this(null,cedula,nombreCompleto,fechaNacimiento,email,telefono);
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
   

    @Override
    public boolean isComplete() {
        return this.cedula!=null && !this.nombreCompleto.isEmpty() 
                && !this.fechaNacimiento.isEmpty() && !this.telefono.isEmpty()
                && !this.email.isEmpty();
    }

   
    
}
