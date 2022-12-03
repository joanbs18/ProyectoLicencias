/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Modelos.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoUsuario extends Dao<Usuario> implements Crud<Usuario> {

    public DaoUsuario(Conector conector) {
        this.conector = conector;
    }

    @Override
    public boolean crear(Usuario modelo) {
        this.error="";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call insertarUsuario(?,?)");
            this.conector.addParameter(1, modelo.getIdPersona());
            this.conector.addParameter(2, modelo.getTipoUsuario());
            
            return this.conector.executeUpdate();
         
        } catch (Exception ex) {
            this.error=ex.toString();
        }finally{
            this.conector.desconectar();
        }
        return false;
    }

    

    @Override
    public Usuario leer(Usuario modelo) {
        this.error="";
        try {
            Object[][] datos;
             this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("call verUsuarios(?)");
            this.conector.addParameter(1,modelo.getId());
            datos=this.conector.executeQuery();
            return null==datos?null:new Usuario(Integer.valueOf(String.valueOf(datos[0][0])),Integer.valueOf(String.valueOf(datos[0][1])),String.valueOf(datos[0][2]));
        } catch (Exception ex) {
            this.error=ex.toString();    
        }finally{
            this.conector.desconectar();
        }
        return null;
    }

    @Override
    public ArrayList<Usuario> leer() {
        this.error = "";
        try {
            ArrayList<Usuario> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select * from Usuarios");//se hace la consulta
            data = this.conector.executeQuery();
            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Usuario((int) (dt[0]), (int) (dt[1]),
                        String.valueOf(dt[2])));
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
    public ArrayList<Usuario> leer(String filter) {
        this.error = "";
        try {
            ArrayList<Usuario> list = new ArrayList<Usuario>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select Id, IdPersona, TipoUsuario from personas where Nombre like ?");//se hace la consulta y se filtra solo con el nombre
            this.conector.addParameter(1, filter);//manda parametro al statemet
            data = this.conector.executeQuery();

            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Usuario((int) (dt[0]), (int) (dt[1]),
                        String.valueOf(dt[2])));
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
    public boolean actualizar(Usuario modelo) {
         this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call actualizarPersona(?,?,?)");
            this.conector.addParameter(1, modelo.getId());
            this.conector.addParameter(1, modelo.getIdPersona());
            this.conector.addParameter(2, modelo.getTipoUsuario());

            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }

    @Override
    public boolean borrar(Usuario modelo) {
        this.error = "";
        try {
            this.conector.conectar();
            this.conector.prepareQuery("call borrarUsuario(?)");
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
