/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.Cita;
import MVC.Modelos.Prueba;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoCita extends Dao<Cita> implements Crud<Cita>{
     public DaoCita(Conector conector) {
        this.conector = conector;
    }

    @Override
    public boolean crear(Cita modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarCita(?,?,?,?)");
            this.conector.addParameter(1, modelo.getIdCliente());
            this.conector.addParameter(2, modelo.getFecha());
            this.conector.addParameter(3, modelo.getHora());
            this.conector.addParameter(4, modelo.getEstado());
            
            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public Cita leer(Cita modelo) {
        this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("call verCita(?)");
            this.conector.addParameter(1, modelo.getId());
            datos = this.conector.executeQuery();
            return null == datos ? null : new Cita(Integer.valueOf(String.valueOf(datos[0][0])), 
                    Integer.valueOf(String.valueOf(datos[0][1])), String.valueOf(datos[0][2]), 
                    String.valueOf(datos[0][3]),Boolean.valueOf(String.valueOf(datos[0][4])));
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public ArrayList<Cita> leer() {
        this.error = "";
        try {
            ArrayList<Cita> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select * from Cita");//se hace la consulta
            data = this.conector.executeQuery();
            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Cita((int)(dt[0]), (int)(dt[1]), String.valueOf(dt[2]), String.valueOf(dt[3]), (Boolean)(dt[4])));
            }
            return list;
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public ArrayList<Cita> leer(String filter) {
        String consulta="Select Id,cedula,fecha,hora,estado "
                + "from cita where Nombre like ?";//se hace la consulta y se filtra solo con el nombre
        this.error = "";
        try {
            ArrayList<Cita> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery(consulta);
            this.conector.addParameter(1, filter);//manda parametro al statemet
            data = this.conector.executeQuery();

            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Cita((int)(dt[0]), (int)(dt[1]), String.valueOf(dt[2]), String.valueOf(dt[3]), (Boolean)(dt[4])));
            }
            return list;
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public boolean actualizar(Cita modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarCita(?,?,?,?,?)");
            this.conector.addParameter(1, modelo.getId());
            this.conector.addParameter(2, modelo.getIdCliente());
            this.conector.addParameter(3, modelo.getFecha());
            this.conector.addParameter(4, modelo.getHora());
            this.conector.addParameter(5, modelo.getEstado());

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public boolean borrar(Cita modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call borrarCita(?)");
            this.conector.addParameter(1, modelo.getId());
            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public String getError() {
        return this.error;
    }
}
