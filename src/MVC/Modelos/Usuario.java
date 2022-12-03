/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelos;

/**
 *
 * @author joans
 */
public class Usuario implements Modelo {
    protected Integer id;
    protected Integer idPersona;
    protected String tipoUsuario;

    public Usuario(Integer id, Integer idPersona, String tipoUsuario) {
        this.id = id;
        this.idPersona = idPersona;
        this.tipoUsuario = tipoUsuario;
    }
    public Usuario(){
        this(null,null,null);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public boolean isComplete() {
         return this.idPersona!=null && this.tipoUsuario!=null;
    }
    
    
}
