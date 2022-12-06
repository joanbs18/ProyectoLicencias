/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

import java.time.LocalDate;
import java.time.Period;

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

    public Cliente(Integer idCliente) {
        this(null,null,null,null,null,null,null,null);
        
    }
    public Cliente(){
        this(null,null);
    }

    
    @Override
    public boolean isComplete() {
         return true;
    }
    
    public int calcularEdad(String fecha){
        try{
    int año= Integer.parseInt(fecha.substring(0, 4));
    
            System.out.println(año);
    int mes= Integer.parseInt(fecha.substring(5, 7));
    int dia= Integer.parseInt(fecha.substring(8, 10));
    Period edad = Period.between(LocalDate.of(año,mes,dia), LocalDate.now());
    return edad.getYears();
        }catch(Exception ex){
            System.out.println("Error con la fecha");
        }
return 0;
    }
    
}
