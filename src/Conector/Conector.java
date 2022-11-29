/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conector;

/**
 *
 * @author joans
 */
public abstract class Conector {
    protected String url;
    protected String user;
    protected String pass;
    protected String error;
    
    public abstract void conectar()throws Exception;
    
    public abstract void desconectar();
    
    public abstract void prepararConsulta(String consulta) throws Exception;
    
    public abstract void agregarParametros(int index, Object param) throws Exception;
    
    public abstract Object[][] ejecutarConsulta() throws Exception;
    
    public abstract boolean ejecutarActualizacion() throws Exception;
}
