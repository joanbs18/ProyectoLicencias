/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoCliente extends Dao<Cliente> implements Crud<Cliente>{
    public DaoCliente(Conector conector) {
        this.conector=conector;
    }

    @Override
    public boolean crear(Cliente modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarCliente(?)");
            this.conector.addParameter(1, modelo.getIdPersona());
            
            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public Cliente leer(Cliente modelo) {
        this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("call verCliente(?)");
            this.conector.addParameter(2, modelo.getIdCliente());
            this.conector.addParameter(3, modelo.getIdPersona());
            this.conector.addParameter(1, modelo.getId());
            this.conector.addParameter(4, modelo.getCedula());
            this.conector.addParameter(5, modelo.getNombreCompleto());
            this.conector.addParameter(6, modelo.getFechaNacimiento());
            this.conector.addParameter(7, modelo.getEmail());
            this.conector.addParameter(8, modelo.getTelefono());
            
            
            datos = this.conector.executeQuery();
            return null == datos ? null : new Cliente(Integer.valueOf(String.valueOf(datos[0][0])),Integer.valueOf(String.valueOf(datos[0][1])),
                    Integer.valueOf(String.valueOf(datos[0][2])),Integer.valueOf(String.valueOf(datos[0][3])),
                    String.valueOf(datos[0][4]),String.valueOf(datos[0][5]),
                    String.valueOf(datos[0][6]),String.valueOf(datos[0][7]));
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> leer() {
        this.error = "";
        try {
            ArrayList<Cliente> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select * from oficial");//se hace la consulta
            data = this.conector.executeQuery();
            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Cliente((int) (dt[0]), (int) (dt[1]),(int)(dt[2]),(int)(dt[3]),
                        String.valueOf(dt[4]), String.valueOf(dt[5]),
                         String.valueOf(dt[6]), String.valueOf(dt[7])));
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
    public ArrayList<Cliente> leer(String filter) {
        this.error = "";
        try {
            ArrayList<Cliente> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select Id, idPersona, Usuario,Contrasenia from Oficial where Nombre like ?");//se hace la consulta y se filtra solo con el nombre
            this.conector.addParameter(1, filter);//manda parametro al statemet
            data = this.conector.executeQuery();

            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Cliente((int) (dt[0]), (int) (dt[1]),(int)(dt[2]),(int)(dt[3]),
                        String.valueOf(dt[4]), String.valueOf(dt[5]),
                         String.valueOf(dt[6]), String.valueOf(dt[7])));
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
    public boolean actualizar(Cliente modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call actualizarOficial(?)");
            this.conector.addParameter(1, modelo.getIdPersona());
            
            

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public boolean borrar(Cliente modelo) {
         this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call borrarOficial(?)");
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
