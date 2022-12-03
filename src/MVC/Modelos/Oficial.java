/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author joans
 */
public class Oficial extends Persona implements Modelo{
    private Integer carnet;
    private Integer idPersona;
    private String nombreUsuario;
    private String contrasenia;
    private Double salario;

    public Oficial(Integer carnet, Integer idPersona, String nombreUsuario, String Contrasenia, Double Salario, Integer id, Integer cedula, String nombreCompleto, String fechaNacimiento, String email, String telefono) {
        super(id, cedula, nombreCompleto, fechaNacimiento, email, telefono);
        this.carnet = carnet;
        this.idPersona = idPersona;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = Contrasenia;
        this.salario = Salario;
    }

    public Oficial(Integer carnet, Integer idPersona, String nombreUsuario, String contrasenia, Double salario) {
        this.carnet = carnet;
        this.idPersona = idPersona;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.salario = salario;
    }
    public Oficial(){
        this(null,null,null,null,null);
    }
    
    

    public Integer getCarnet() {
        return carnet;
    }

    public void setCarnet(Integer carnet) {
        this.carnet = carnet;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.contrasenia = Contrasenia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario) {
        this.salario = Salario;
    }

    
    
    @Override
    public boolean isComplete() {
         return this.idPersona!=null && this.nombreUsuario!=null 
                 && this.contrasenia!=null && this.salario!=null;
    }
    
}
