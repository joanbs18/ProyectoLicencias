/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author Francisco
 */
public class Cliente extends Persona implements Modelo{
    private Integer idCliente;
    private Integer idPersona;
    private Integer edadCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(Integer edadCliente) {
        this.edadCliente = edadCliente;
    }
    
    

    public Cliente(Integer idCliente, Integer idPersona, Integer id, Integer cedula, String nombreCompleto, String fechaNacimiento, String email, String telefono) {
        super(id, cedula, nombreCompleto, fechaNacimiento, email, telefono);
        this.idCliente = idCliente;
        this.idPersona = idPersona;
        
    }

    public Cliente(Integer idCliente, Integer idPersona) {
        this.idCliente = idCliente;
        this.idPersona = idPersona;
        
    }

    public Cliente(Integer idCliente, Integer idPersona, Integer id) {
        super(id);
        this.idCliente = idCliente;
        this.idPersona = idPersona;
        
    }
    public Cliente(){
        this(null,null,null);
    }

    
    @Override
    public boolean isComplete() {
         return this.idPersona!=null && this.edadCliente!=null;
    }
    
    
}
