/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;
import Data.Conexiones.Conector;
import Data.Crud.Crud;
import java.util.ArrayList;


/**
 *
 * @author Francisco
 */
public abstract class Dao<modelo> implements Crud<modelo>{
    protected Conector conector;
    protected String error;
    public abstract String getError();
}
