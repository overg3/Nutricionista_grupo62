package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nutricionistaapp.categorias.ComidaTipo;
import nutricionistaapp.entidades.Comida;

public class ComidaData {

    public static void agregarComida(Comida comida) {

        String sql = "INSERT INTO comidas (nombre, tipo, calorias, estadoComida) "
                + "VALUES (?,?,?,?);";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql);) {

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipo().toString().toUpperCase());
            ps.setDouble(3, comida.getCalorias());
            ps.setBoolean(4, comida.isEstadoComida());

            ps.executeUpdate();
            System.out.println(comida.getNombre() + " agregado.");

        } catch (SQLException ex) {
            System.err.println("Error al agregar comida: " + ex.getMessage());
        }
      
    }

    public static void bajaComida(int idComida) {

        String sql = "UPDATE comidas SET estadoComida = false WHERE idComida = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idComida);
            ps.executeUpdate();
            System.out.println("Alimento borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar alimento: " + ex.getMessage());
        }

    }

    public static void eliminarComida(int idComida) {

        String sql = "DELETE FROM comidas WHERE idComida = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idComida);
            ps.executeUpdate();
            System.out.println("Alimento borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar alimento: " + ex.getMessage());
        }

    }

    public static void modificarComida(Comida comida) {

        String sql = "UPDATE comidas SET nombre = ?, tipo = ?, calorias = ?, "
                + "estadoComida = ? WHERE idComida = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getTipo().toString().toUpperCase());
            ps.setDouble(3, comida.getCalorias());
            ps.setBoolean(4, comida.isEstadoComida());
            ps.setInt(5, comida.getIdComida());

            ps.executeUpdate();
            System.out.println("Alimento modificado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar datos del alimento: " + ex.getMessage());
        }

    }

    public static Comida buscarComidaNombre(String nombre) {

        Comida comida = null;

        String sql = "SELECT * FROM comidas WHERE nombre = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, nombre);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setTipo(ComidaTipo.valueOf(rs.getString("tipo").toUpperCase()));
                comida.setCalorias(rs.getDouble("calorias"));
                comida.setEstadoComida(rs.getBoolean("estadoComida"));
            } else {
                System.out.println("El alimento no existe");
            }
            rs.close();

        } catch (SQLException ex) {
            System.err.println("Error al buscar el alimento: " + ex.getMessage());
        }
        return comida;

    }

    public static Comida buscarComidaID(int idComida) {

        Comida comida = null;

        String sql = "SELECT * FROM comidas WHERE idComida = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idComida);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setTipo(ComidaTipo.valueOf(rs.getString("tipo").toUpperCase()));
                comida.setCalorias(rs.getDouble("calorias"));
                comida.setEstadoComida(rs.getBoolean("estadoComida"));

                System.out.println("Alimento encontrado");
            } else {
                System.out.println("El alimento no existe");
            }
            rs.close();

        } catch (SQLException ex) {
            System.err.println("Error al buscar el alimento: " + ex.getMessage());
        }

        return comida;

    }

    public static List<Comida> listarAlimentos() {

        List<Comida> listaAlimentos = new ArrayList<>();

        String sql = "SELECT * FROM comidas WHERE estadoComida = 1";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Comida comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setTipo(ComidaTipo.valueOf(rs.getString("tipo").toUpperCase()));
                comida.setCalorias(rs.getDouble("calorias"));
                comida.setEstadoComida(rs.getBoolean("estadoComida"));

                listaAlimentos.add(comida);
            }

        } catch (SQLException ex) {
            System.err.println("Error al obtener la lista de alimentos: " + ex.getMessage());
        }

        return listaAlimentos;

    }

}
