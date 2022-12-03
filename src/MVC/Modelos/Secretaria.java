/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author joans
 */
public class Secretaria extends Usuario implements Modelo{
    private Integer id;
    private Integer idUsuario;
    private String nombreUsuario;
    private String password;


    

    public Secretaria(Integer id, Integer idUsuario, String nombreUsuario, String password) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    public Secretaria(){
        this(null,null,null,null);
    }
    public Secretaria(Integer id){
        this(id,null,null,null);
    }
    public Secretaria(Integer idUsuario, String nombreUsuario, String password){
        this(null,idUsuario,nombreUsuario,password);
    }
    

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idPersona) {
        this.idUsuario = idPersona;
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
         return this.idUsuario!=null && this.nombreUsuario!=null && this.password!=null;
    }
    
}
