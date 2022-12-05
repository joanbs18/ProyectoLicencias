/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;



/**
 *
 * @author Francisco
 */
public class Cita implements Modelo{
    private Integer id;
    private Integer idCliente;
    private String fecha;
    private String hora;
    private Boolean estado;

    public Cita(Integer id, Integer idCliente, String fecha, String hora, Boolean estado) {
        this.id = id;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Cita() {
        this(null,null,null,null,null);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    

    @Override
    public boolean isComplete() {
        return this.idCliente!=null && this.fecha!=null && this.hora!=null
                && this.estado!=null;
    }
    
}
