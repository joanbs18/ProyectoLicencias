/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author Francisco
 */
public class Prueba implements Modelo{
    private Integer id;
    private String fecha;
    private Integer carnetOficial;
    private Integer idCliente;
    private Integer idCita;
    private Double nota;
    private Boolean estado;
    private String obsevacion;
    

    public Prueba(Integer id, String fecha, Integer carnetOficial, Integer idCliente, Integer idCita, Double nota,Boolean estado, String observacion) {
        this.id = id;
        this.fecha = fecha;
        this.carnetOficial = carnetOficial;
        this.idCliente = idCliente;
        this.idCita = idCita;
        this.setNota(nota);
        this.setEstado(estado);
        this.setObsevacion(obsevacion);
        
    }
    public Prueba(){
        this(null,null,null,null,null,null,null,null);
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

    public void setFecha(String date) {
        this.fecha = fecha;
    }

    public Integer getCarnetOficial() {
        return carnetOficial;
    }

    public void setCarnetOficial(Integer carnetOficial) {
        this.carnetOficial = carnetOficial;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
     if(nota<0){
         this.nota=0.;
         
     }else{
        this.nota=nota;
     }
        
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = this.nota >= 80;
        
    }

    public String getObsevacion() {
        return obsevacion;
    }

    public void setObsevacion(String obsevacion) {
        if(this.nota<80 && obsevacion==null){
         this.obsevacion="Reprobado";
     }else{
         this.obsevacion="Aprobado";
     }
        
    }
    
    

    @Override
    public boolean isComplete() {
        return !this.fecha.isEmpty() && this.carnetOficial!=null && 
                this.idCliente!=null && this.idCita!=null && this.nota!=null && 
                this.nota!=null && this.estado!=null && this.obsevacion!=null;
    }

    @Override
    public String toString() {
        return "ModeloPrueba{" + "id=" + id + ", date=" + fecha + ", carnetOficial=" + carnetOficial + ", idCliente=" + idCliente + ", idCita=" + idCita + ", nota=" + nota + ", estado=" + estado + ", obsevacion=" + obsevacion + '}';
    }
    
}
