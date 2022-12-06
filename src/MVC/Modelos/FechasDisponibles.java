/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author joans
 */
public class FechasDisponibles implements Modelo {
    private Integer id;
    private String fecha;
    private String hora;

    public FechasDisponibles(Integer id, String fecha, String hora) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
    }

    public FechasDisponibles() {
        this(null,null,null);
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public boolean isComplete() {
return this.getId()!=null;  
    }
    
    
}
