/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Daos;

import Data.Conexiones.Conector;
import Data.Crud.Crud;
import MVC.Controlador.Controlador;
import MVC.Modelos.Cliente;
import MVC.Modelos.Persona;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class DaoCliente extends Dao<Cliente> implements Crud<Cliente> {

    private Controlador<Persona> controlador;

    public DaoCliente(Conector conector) {
        this.conector = conector;
    }

    /*
     this.conector.prepareQuery("INSERT INTO persona (Cedula, NombreCompleto, FechaNacimiento, Email, Telefono) VALUES (?, ?, ?, ?, ?) ");
            this.conector.addParameter(1, modelo.getCedula());
            this.conector.addParameter(2, modelo.getNombreCompleto());
            this.conector.addParameter(3, modelo.getFechaNacimiento());
            this.conector.addParameter(4, modelo.getEmail());
            this.conector.addParameter(5, modelo.getTelefono());
     */
    @Override
    public boolean crear(Cliente modelo) {
        this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();
            this.conector.prepareQuery("INSERT INTO persona (Cedula, NombreCompleto, FechaNacimiento, Email, Telefono) VALUES (?, ?, ?, ?, ?) ");
            this.conector.addParameter(1, modelo.getCedula());
            this.conector.addParameter(2, modelo.getNombreCompleto());
            this.conector.addParameter(3, modelo.getFechaNacimiento());
            this.conector.addParameter(4, modelo.getEmail());
            this.conector.addParameter(5, modelo.getTelefono());
          this.conector.executeUpdate();

            this.conector.prepareQuery("SELECT * FROM persona ORDER BY ID DESC LIMIT 1");
          
           datos=this.conector.executeQuery();

            this.conector.prepareQuery("Insert into clientes (idPersona) values(?);");
            this.conector.addParameter(1,datos[0][0]);
            return this.conector.executeUpdate();

        } catch (Exception ex) {
            this.error = ex.toString();
        } finally {
            this.conector.desconectar();
        }
        return false;
    }
    public void crearCliente(Cliente usuario){
    
    }

    @Override
    public Cliente leer(Cliente modelo) {
        this.error = "";
        try {
            Object[][] datos;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("call verPersona(?)");
            // this.conector.addParameter(2, modelo.getIdCliente());
            this.conector.addParameter(1, modelo.getIdPersona());
            //this.conector.addParameter(2, modelo.getId());
            //this.conector.addParameter(4, modelo.getCedula());
            //this.conector.addParameter(5, modelo.getNombreCompleto());
            //this.conector.addParameter(6, modelo.getFechaNacimiento());
            //this.conector.addParameter(7, modelo.getEmail());
            //this.conector.addParameter(8, modelo.getTelefono());

            datos = this.conector.executeQuery();
            return null == datos ? null : new Cliente(Integer.valueOf(String.valueOf(datos[0][0])), Integer.valueOf(String.valueOf(datos[0][1])),
                    Integer.valueOf(String.valueOf(datos[0][2])), Integer.valueOf(String.valueOf(datos[0][3])),
                    String.valueOf(datos[0][4]), String.valueOf(datos[0][5]),
                    String.valueOf(datos[0][6]), String.valueOf(datos[0][7]));
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
            this.conector.prepareQuery("SELECT clientes.Id,clientes.IdPersona,persona.Id,persona.Cedula,persona.NombreCompleto,persona.FechaNacimiento,persona.Email,persona.Telefono from clientes INNER JOIN persona ON clientes.IdPersona=persona.Id;");//se hace la consulta
            data = this.conector.executeQuery();
            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Cliente(Integer.parseInt(String.valueOf(dt[0])), Integer.parseInt(String.valueOf(dt[1])), Integer.parseInt(String.valueOf(dt[2])), Integer.parseInt(String.valueOf(dt[3])),
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

    /*
     System.out.println("fffff");
        this.error = "";
        try {
            ArrayList<Cliente> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("Select * from cliente");//se hace la consulta
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
     */
    @Override
    public ArrayList<Cliente> leer(String filter) {
        this.error = "";
        try {
            ArrayList<Cliente> list = new ArrayList<>();
            Object[][] data;
            this.conector.conectar();//llamamos el metodo conectar
            this.conector.prepareQuery("SELECT clientes.Id,clientes.IdPersona,persona.Id,persona.Cedula,persona.NombreCompleto,persona.FechaNacimiento,persona.Email,persona.Telefono from clientes INNER JOIN persona ON clientes.IdPersona=persona.Id where cedula like ?;");//se hace la consulta y se filtra solo con el nombre
            this.conector.addParameter(1, filter);//manda parametro al statemet
            data = this.conector.executeQuery();

            if (data == null) {
                return null;
            }
            for (Object[] dt : data) {
                list.add(new Cliente(Integer.parseInt(String.valueOf(dt[0])), Integer.parseInt(String.valueOf(dt[1])), Integer.parseInt(String.valueOf(dt[2])), Integer.parseInt(String.valueOf(dt[3])),
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
            this.conector.prepareQuery("UPDATE clientes set IdPersona=idpersona where Id=idcliente");
            this.conector.addParameter(1, modelo.getIdCliente());
            this.conector.addParameter(2, modelo.getIdPersona());

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
            this.conector.prepareQuery("DELETE FROM citas WHERE IdCliente=?");
            this.conector.addParameter(1, modelo.getIdCliente());
            this.conector.executeUpdate();
            this.conector.prepareQuery("DELETE FROM clientes WHERE Id=?");
            this.conector.addParameter(1, modelo.getIdCliente());
            
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
