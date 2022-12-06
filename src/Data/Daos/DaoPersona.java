/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.Persona;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoPersona extends Dao<Persona> implements Crud<Persona> {

    public DaoPersona(Conector conector) {
        this.conector = conector;
    }

    @Override
    public boolean crear(Persona modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarPersona(?,?,?,?,?)");
            this.conector.addParameter(1, modelo.getCedula());
            this.conector.addParameter(2, modelo.getNombreCompleto());
            this.conector.addParameter(3, modelo.getFechaNacimiento());
            this.conector.addParameter(4, modelo.getEmail());
            this.conector.addParameter(5, modelo.getTelefono());

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public Persona leer(Persona modelo) {
        this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select cedula,NombreCompleto,FechaNacimiento,Email,Telefono from persona where id = ?");
            this.conector.addParameter(1, 1);
            datos = this.conector.executeQuery();
            System.out.println(datos[0][0]);
            return null == datos ? null : new Persona(null,Integer.valueOf(String.valueOf(datos[0][0])), String.valueOf(datos[0][1]), String.valueOf(datos[0][2]), String.valueOf(datos[0][3]), String.valueOf(datos[0][4]));
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public ArrayList<Persona> leer() {
        this.error = "";
        try {
            ArrayList<Persona> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select * from personas");//se hace la consulta
            data = this.conector.executeQuery();
            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Persona((int) (dt[0]), (int) (dt[1]),
                        String.valueOf(dt[2]), String.valueOf(dt[3]),
                        String.valueOf(dt[4]), String.valueOf(dt[5])));
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
    public ArrayList<Persona> leer(String filter) {
        this.error = "";
        try {
            ArrayList<Persona> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select Id, NombreCompleto, Telefono from personas where Nombre like ?");//se hace la consulta y se filtra solo con el nombre
            this.conector.addParameter(1, filter);//manda parametro al statemet
            data = this.conector.executeQuery();

            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Persona((int) (dt[0]), (int) (dt[1]),
                        String.valueOf(dt[2]), String.valueOf(dt[3]),
                        String.valueOf(dt[4]), String.valueOf(dt[5])));
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
    public boolean actualizar(Persona modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call actualizarPersona(?,?,?,?,?,?)");
            this.conector.addParameter(1, modelo.getId());
            this.conector.addParameter(2, modelo.getCedula());
            this.conector.addParameter(3, modelo.getNombreCompleto());
            this.conector.addParameter(4, modelo.getFechaNacimiento());
            this.conector.addParameter(5, modelo.getEmail());
            this.conector.addParameter(6, modelo.getTelefono());

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public boolean borrar(Persona modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call borrarPersona(?)");
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
