/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joans
 */
public class Conexion extends Conector {

    public Connection connection;
    protected PreparedStatement transact;
    protected ResultSet data;

    public Connection getConnection() {
        return connection;
    }

    public PreparedStatement getTransact() {
        return transact;
    }

    public ResultSet getData() {
        return data;
    }

    public Conexion() {
        this.url = "jdbc:mysql://localhost:3306/Licencias";
        this.user = "root";
        this.pass = "";
    }

    @Override
    public void conectar() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(url, user, pass);
    }

    @Override
    public void desconectar() {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void prepareQuery(String query) throws Exception {
        this.transact = this.connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    @Override
    public void addParameter(int index, Object param) throws Exception {
        if (param instanceof Integer) {
            this.transact.setInt(index, (int) param);
        }
        /**
         * else if (param instanceof Double) { SE USA ESTO MODIFICANDO EL TIPO
         * DE DATO this.transact.setDouble(index, (double) param); }*
         */
    }

    @Override
    public Object[][] executeQuery() throws Exception {
        this.data = this.transact.executeQuery();
        return this.toArray(data);
    }

    @Override
    public boolean executeUpdate() throws Exception {
        return this.transact.executeUpdate() > 0;
    }

    private Object[][] toArray(ResultSet rs) throws SQLException {
        int columnCount;
        int rowCount;
        if (!rs.last()) {
            return null;
        }
        columnCount = rs.getMetaData().getColumnCount();
        rowCount = rs.getRow();
        rs.beforeFirst();
        Object[][] data = new Object[rowCount][columnCount];
        int row = 0;
        while (rs.next()) {
            for (int column = 0; column < columnCount; column++) {
                data[row][column] = rs.getObject(column + 1);
            }
            row++;
        }
        return data;
    }

}
