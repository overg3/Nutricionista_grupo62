package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nutricionistaapp.categorias.Horario;
import nutricionistaapp.entidades.Indicacion;

public class IndicacionData {

    public static void agregarIndicacion(Indicacion indicacion) {

        String sql = "INSERT INTO indicacion (idComida, idDieta, horario, porcion, estado)"
                + " VALUES (?,?,?,?,?);";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, indicacion.getComida().getIdComida());
            ps.setInt(2, indicacion.getDieta().getIdDieta());
            ps.setString(3, String.valueOf(indicacion.getHorario()).toUpperCase());
            ps.setInt(4, indicacion.getPorcion());
            ps.setBoolean(5, indicacion.isEstado());

            ps.executeUpdate();

            System.out.println("Nueva indicación registrada");

        } catch (SQLException ex) {
            System.err.println("Error al agregar indicación: " + ex.getMessage());
        }
    }

    public static void modificarIndicacion(Indicacion indicacion) {

        String sql = "UPDATE indicacion SET idComida = ?, idDieta = ?, horario = ?"
                + ", porcion = ? WHERE idIndic = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, indicacion.getComida().getIdComida());
            ps.setInt(2, indicacion.getDieta().getIdDieta());
            ps.setString(3, String.valueOf(indicacion.getHorario()).toUpperCase());
            ps.setInt(4, indicacion.getPorcion());
            ps.setInt(5, indicacion.getIdIndicacion());

            ps.executeUpdate();
            System.out.println("Indicación modificada");

        } catch (SQLException ex) {
            System.err.println("Error al modificar datos de la indicación: " + ex.getMessage());
        }
    }

    public static void bajaIndicacion(int idIndic) {

        String sql = "UPDATE indicacion SET estado = false WHERE idIndic = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idIndic);

            ps.executeUpdate();
            System.out.println("Indicación borrada");

        } catch (SQLException ex) {
            System.err.println("Error al borrar la indicación: " + ex.getMessage());
        }
    }

    public static List<Indicacion> listarIndicaciones(int idDieta) {

        List<Indicacion> listaIndicaciones = new ArrayList<>();

        String sql = "SELECT * FROM indicacion WHERE idDieta = ? AND estado = 1";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql);) {

            ps.setInt(1, idDieta);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Indicacion indicacion = new Indicacion();
                indicacion.setIdIndic(rs.getInt("idIndic"));
                indicacion.setComida(ComidaData.buscarComidaID(rs.getInt("idComida")));
                indicacion.setDieta(DietaData.buscarDietaID(rs.getInt("idDieta")));
                indicacion.setHorario(Horario.valueOf(rs.getString("horario").toUpperCase()));
                indicacion.setPorcion(rs.getInt("porcion"));
                indicacion.setEstado(rs.getBoolean("estado"));

                listaIndicaciones.add(indicacion);
            }
            rs.close();

        } catch (SQLException ex) {
            System.err.println("Error al obtener la lista de indicaciones: " + ex.getMessage());
        }
        return listaIndicaciones;
    }

    public static Indicacion buscarIndicacionID(int idIndic) {

        Indicacion indicacion = null;

        String sql = "SELECT * indicacion WHERE idIndic = ? AND estado = 1";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idIndic);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                indicacion = new Indicacion();
                indicacion.setIdIndic(rs.getInt("idIndic"));
                indicacion.setComida(ComidaData.buscarComidaID(rs.getInt("idComida")));
                indicacion.setDieta(DietaData.buscarDietaID(rs.getInt("idDieta")));
                indicacion.setHorario(Horario.valueOf(rs.getString("horario")));
                indicacion.setPorcion(rs.getInt("porcion"));
                indicacion.setEstado(rs.getBoolean("estado"));
            }
            rs.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar la indicación: " + ex.getMessage());
        }
        return indicacion;

    }

}
