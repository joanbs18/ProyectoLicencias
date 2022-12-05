/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.Prueba;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoPrueba extends Dao<Prueba> implements Crud<Prueba>{
     public DaoPrueba(Conector conector) {
        this.conector = conector;
    }

    @Override
    public boolean crear(Prueba modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarPrueba(?,?,?,?,?)");
            this.conector.addParameter(1, modelo.getFecha());
            this.conector.addParameter(2, modelo.getCarnetOficial());
            this.conector.addParameter(3, modelo.getIdCliente());
            this.conector.addParameter(4, modelo.getIdCita());
            this.conector.addParameter(5, modelo.getNota());
            this.conector.addParameter(6, modelo.getEstado());
            this.conector.addParameter(7, modelo.getObsevacion());

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public Prueba leer(Prueba modelo) {
        this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("call verPrueba(?)");
            this.conector.addParameter(1, modelo.getId());
            datos = this.conector.executeQuery();
            return null == datos ? null : new Prueba(Integer.valueOf(String.valueOf(datos[0][0])),
                    String.valueOf(datos[0][1]), Integer.valueOf(String.valueOf(datos[0][2])), 
                    Integer.valueOf(String.valueOf(datos[0][3])), Integer.valueOf(String.valueOf(datos[0][4])), 
                    Double.valueOf(String.valueOf(datos[0][5])), Boolean.valueOf(String.valueOf(datos[0][6])), String.valueOf(datos[0][7]));
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public ArrayList<Prueba> leer() {
        this.error = "";
        try {
            ArrayList<Prueba> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select * from prueba");//se hace la consulta
            data = this.conector.executeQuery();
            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Prueba((int)(dt[0]), String.valueOf(dt[1]), (int)(dt[2]), 
                        (int)(dt[3]), (int)(dt[4]), (Double)(dt[5]), (Boolean)(dt[6]), 
                        String.valueOf(dt[1])));
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
    public ArrayList<Prueba> leer(String filter) {
        String consulta="Select Id, fecha, Carnet oficial, idCliente, idCita,nota,estado,observacion "
                + "from prueba where Nombre like ?";//se hace la consulta y se filtra solo con el nombre
        this.error = "";
        try {
            ArrayList<Prueba> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery(consulta);
            this.conector.addParameter(1, filter);//manda parametro al statemet
            data = this.conector.executeQuery();

            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Prueba((int)(dt[0]), String.valueOf(dt[1]), (int)(dt[2]), 
                        (int)(dt[3]), (int)(dt[4]), (Double)(dt[5]), (Boolean)(dt[6]), 
                        String.valueOf(dt[1])));
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
    public boolean actualizar(Prueba modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call actualizarPrueba(?,?,?,?,?,?)");
            this.conector.addParameter(1, modelo.getId());
            this.conector.addParameter(2, modelo.getFecha());
            this.conector.addParameter(3, modelo.getCarnetOficial());
            this.conector.addParameter(4, modelo.getIdCliente());
            this.conector.addParameter(5, modelo.getIdCita());
            this.conector.addParameter(6, modelo.getNota());
            this.conector.addParameter(7, modelo.getEstado());
            this.conector.addParameter(8, modelo.getObsevacion());

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public boolean borrar(Prueba modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call borrarPrueba(?)");
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
