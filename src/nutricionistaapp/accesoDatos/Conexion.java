package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection connection;

    public static Connection getConnection() {

        connection = null;
        String url = "jdbc:mariadb://localhost/nutricionista";

        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(url, "root", "");
                System.out.println("** Conexión establecida **");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse: " + e.getMessage(),
                    " Error", JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage(),
                    " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
