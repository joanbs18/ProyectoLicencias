/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author joans
 */
public class Secretaria extends Persona implements Modelo{
    private Integer id;
    private Integer idPersona;
    private String nombreUsuario;
    private String password;


    public Secretaria(Integer id, Integer idPersona, String nombreUsuario, String password, Integer cedula, String nombreCompleto, String fechaNacimiento, String email, String telefono) {
        super(cedula, nombreCompleto, fechaNacimiento, email, telefono);
        this.id = id;
        this.idPersona = idPersona;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public Secretaria(Integer id, Integer idPersona, String nombreUsuario, String password) {
        this.id = id;
        this.idPersona = idPersona;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    public Secretaria(){
        this(null,null,null,null);
    }
    

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean isComplete() {
         return this.idPersona!=null && this.nombreUsuario!=null && this.password!=null;
    }
    
}
