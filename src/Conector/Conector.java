/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conector;

/**
 *
 * @author josep
 */
public abstract class Conector {

    protected String url;
    protected String user;
    protected String pass;
    protected String error;

    public abstract void conectar() throws Exception;

    public abstract void desconectar();

    public abstract void prepareQuery(String query) throws Exception;

    public abstract void addParameter(int index, Object param) throws Exception;

    public abstract Object[][] executeQuery() throws Exception;

    public abstract boolean executeUpdate() throws Exception;
}
