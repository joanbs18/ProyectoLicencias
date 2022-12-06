/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.FechasDisponibles;
import java.util.ArrayList;

/**
 *
 * @author joans
 */
public class DaoFechasDisponibles extends Dao<FechasDisponibles> implements Crud<FechasDisponibles>{
  public DaoFechasDisponibles(Conector conector) {
        this.conector = conector;
    }
    @Override
    public String getError() {
return this.error;    }

    @Override
    public boolean crear(FechasDisponibles model) {
 this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("Insert into FechaDisponible(Fecha,Hora) Values (?,?)");
            this.conector.addParameter(1, model.getFecha());
            this.conector.addParameter(2, model.getHora());
 
            
            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;    }

    @Override
    public FechasDisponibles leer(FechasDisponibles modelo) {
this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select id,Fecha,Hora from FechasDisponibles where id=?");
            this.conector.addParameter(1, modelo.getId());
            datos = this.conector.executeQuery();
            return null == datos ? null : new FechasDisponibles(Integer.valueOf(String.valueOf(datos[0][0])), 
                  String.valueOf(datos[0][1]), String.valueOf(datos[0][2]));
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;    }

    @Override
    public ArrayList<FechasDisponibles> leer() {
this.error = "";
        try {
            ArrayList<FechasDisponibles> list = new ArrayList<>();
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select id,Fecha,Hora from FechasDisponibles");//se hace la consulta
            datos = this.conector.executeQuery();
            if (datos == null) {
                return null;
            }
            for (Object[] dt : datos) {
                list.add(new FechasDisponibles(Integer.valueOf(String.valueOf(datos[0])), 
                  String.valueOf(datos[1]), String.valueOf(datos[2])));
            }
            return list;
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;    }

    @Override
    public ArrayList<FechasDisponibles> leer(String filter) {
this.error = "";
        try {
            ArrayList<FechasDisponibles> list = new ArrayList<>();
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select id,Fecha,Hora from FechasDisponibles where id="+filter);//se hace la consulta
           
            datos = this.conector.executeQuery();
            if (datos == null) {
                return null;
            }
            for (Object[] dt : datos) {
                list.add(new FechasDisponibles(Integer.valueOf(String.valueOf(datos[0])), 
                  String.valueOf(datos[1]), String.valueOf(datos[2])));
            }
            return list;
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;    }

    @Override
    public boolean actualizar(FechasDisponibles model) {
        return false;
    }

    @Override
    public boolean borrar(FechasDisponibles model) {
     this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("Delete FROM FechasDisponibles WHERE Id=?");
            this.conector.addParameter(1, model.getId());
            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }
    
}
