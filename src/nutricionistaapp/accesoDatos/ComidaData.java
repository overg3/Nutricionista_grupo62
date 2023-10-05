package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import nutricionistaapp.entidades.Comida;

public class ComidaData {

    public static void agregarComida(Comida comida) {

        Connection conexion = Conexion.getConnection();
        String sql = "INSERT INTO comidas (nombre, tipo, calorias, estadoComida) "
                + "VALUES (?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipo().toString());
            ps.setDouble(3, comida.getCalorias());
            ps.setBoolean(4, comida.isEstadoComida());

            ps.executeUpdate();
            ps.close();
            System.out.println(comida.getNombre() + " agregado.");

        } catch (SQLException ex) {
            System.err.println("Error al agregar comida: " + ex.getMessage());

        }

    }

    public static void borrarComida(int idComida) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE comidas SET estadoComida = false WHERE idComida = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idComida);
            ps.executeUpdate();
            ps.close();
            System.out.println("Alimento borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar alimento: " + ex.getMessage());
        }

    }

    public static void modificarComida(Comida comida) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE comidas SET nombre = ?, tipo = ?, calorias = ?, "
                + "estadoComida = ? WHERE idComida = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipo().toString());
            ps.setDouble(3, comida.getCalorias());
            ps.setBoolean(4, comida.isEstadoComida());
            ps.setInt(5, comida.getIdComida());

            ps.executeUpdate();
            ps.close();
            System.out.println("Alimento modificado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar datos del alimento: " + ex.getMessage());
        }

    }

}
