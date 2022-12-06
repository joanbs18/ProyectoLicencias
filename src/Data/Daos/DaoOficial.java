/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.Oficial;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoOficial extends Dao<Oficial> implements Crud<Oficial>{

    public DaoOficial(Conector conector) {
        this.conector=conector;
    }

    @Override
    public boolean crear(Oficial modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarOficial(?,?,?,?)");
            this.conector.addParameter(1, modelo.getIdPersona());
            this.conector.addParameter(2, modelo.getNombreUsuario());
            this.conector.addParameter(3, modelo.getContrasenia());
            this.conector.addParameter(4, modelo.getSalario());

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public Oficial leer(Oficial modelo) {
        this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("call verOficial(?)");
            this.conector.addParameter(1, modelo.getId());
            datos = this.conector.executeQuery();
            return null == datos ? null : new Oficial(Integer.valueOf(String.valueOf(datos[0][0])), 
                        Integer.valueOf(String.valueOf(datos[0][1])), String.valueOf(datos[0][2]), 
                        String.valueOf(datos[0][3]), Double.valueOf(String.valueOf(datos[0][4])));
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public ArrayList<Oficial> leer() {
        this.error = "";
        try {
            ArrayList<Oficial> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("SELECT o.Carnet,o.IdUsuario,o.NombreUsuario,o.Contrasenia,o.Salario from oficial o");//se hace la consulta
            data = this.conector.executeQuery();
            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Oficial(Integer.parseInt(String.valueOf(dt[0])),Integer.parseInt(String.valueOf(dt[1])),
                        String.valueOf(dt[2]), String.valueOf(dt[3]),
                        Double.parseDouble(String.valueOf(dt[4]))));
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
    public ArrayList<Oficial> leer(String filter) {
        this.error = "";
        try {
            ArrayList<Oficial> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select Id, idPersona, Usuario,Contrasenia from Oficial where Nombre like ?");//se hace la consulta y se filtra solo con el nombre
            this.conector.addParameter(1, filter);//manda parametro al statemet
            data = this.conector.executeQuery();

            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Oficial((int) (dt[0]), (int) (dt[1]),
                        String.valueOf(dt[2]), String.valueOf(dt[3]),
                        (double)(dt[4])));
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
    public boolean actualizar(Oficial modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call actualizarOficial(?,?,?,?,?)");
            this.conector.addParameter(1, modelo.getCarnet());
            this.conector.addParameter(2, modelo.getIdPersona());
            this.conector.addParameter(3, modelo.getNombreUsuario());
            this.conector.addParameter(4, modelo.getContrasenia());
            this.conector.addParameter(5, modelo.getSalario());
            

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public boolean borrar(Oficial modelo) {
         this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call borrarOficial(?)");
            this.conector.addParameter(1, modelo.getCarnet());
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
