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
    private final double EM=5.5;
    private final double IM=3.84;
    private final double AT=1;
    private final double ASS=3.3;
    
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
        this.setSalario(Salario);
       
    }

    public Oficial(Integer carnet, Integer idPersona, String nombreUsuario, String contrasenia, Double salario) {
        this.carnet = carnet;
        this.idPersona = idPersona;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.setSalario(salario);
      
    }
    public Oficial(){
        this(null,null,null,null,0.0);
        
    }

   
    public Double salarioNetoCalcular(Double salario){
        double deducciones=(this.EM+this.ASS+this.AT+this.IM)/100;
        double salarioNeto;
        if(salario<=817001){
           salarioNeto=salario-(salario*deducciones);
            System.out.println(salarioNeto+" sin impuesto renta");
        }else if(salario>817001 && salario<=1226000){
            salarioNeto=salario-(salario*(deducciones+(10/100)));
            System.out.println(salarioNeto+" con impuesto renta");
        }else{
           salarioNeto=salario-(salario*(deducciones+(15/100))); 
           System.out.println(salarioNeto+" con impuesto renta");
        }
        
         return salarioNeto;
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

    public void setSalario(Double salario) {
        if(salario<0){
            this.salario=0.0;
        }else{
            this.salario = salario;
        }
        
    }
    
    @Override
    public boolean isComplete() {
         return this.idPersona!=null && this.nombreUsuario!=null 
                 && this.contrasenia!=null && this.salario!=null;
    }
    
}
