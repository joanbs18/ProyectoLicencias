/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.Persona;
import MVC.Modelos.Secretaria;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoSecretaria extends Dao<Secretaria> implements Crud<Secretaria> {

    public DaoSecretaria(Conector conector) {
        this.conector = conector;
    }

    @Override
    public boolean crear(Secretaria modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarSecretaria(?,?,?)");
            this.conector.addParameter(1, modelo.getIdUsuario());
            this.conector.addParameter(2, modelo.getNombreUsuario());
            this.conector.addParameter(3, modelo.getPassword());

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public Secretaria leer(Secretaria modelo) {
        this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("call verSecretaria(?)");
            this.conector.addParameter(1, modelo.getId());
            datos = this.conector.executeQuery();
            return null == datos ? null : new Secretaria(Integer.valueOf(String.valueOf(datos[0][0])),
                    Integer.valueOf(String.valueOf(datos[0][1])), String.valueOf(datos[0][2]), String.valueOf(datos[0][3]));
        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public ArrayList<Secretaria> leer() {
        this.error = "";
        try {
            ArrayList<Secretaria> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select S.Id,S.IdUsuario,S.NombreUsuario,S.Contrasenia from secretaria S");//se hace la consulta
            data = this.conector.executeQuery();
            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Secretaria(Integer.parseInt(String.valueOf(dt[0])),Integer.parseInt(String.valueOf(dt[1])),
                        String.valueOf(dt[2]), String.valueOf(dt[3])));
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
    public ArrayList<Secretaria> leer(String filter) {
        this.error = "";
        try {
            ArrayList<Secretaria> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select Id, idUsuario, Usuario,Contrasenia from secretaria where Nombre like ?");//se hace la consulta y se filtra solo con el nombre
            this.conector.addParameter(1, filter);//manda parametro al statemet
            data = this.conector.executeQuery();

            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Secretaria((int) (dt[0]), (int) (dt[1]),
                        String.valueOf(dt[2]), String.valueOf(dt[3])));
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
    public boolean actualizar(Secretaria modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call actualizarSecretaria(?,?,?,?)");
            this.conector.addParameter(1, modelo.getId());
            this.conector.addParameter(2, modelo.getIdUsuario());
            this.conector.addParameter(3, modelo.getNombreUsuario());
            this.conector.addParameter(4, modelo.getPassword());
            
            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public boolean borrar(Secretaria modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("delete from secretaria where id=?");
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
