package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import nutricionistaapp.entidades.Dieta;

public class DietaData {

    public static void agregarDieta(Dieta dieta) {

        Connection conexion = Conexion.getConnection();
        String sql = "INSERT INTO dieta (nombre, idPaciente, idProfesional, "
                + "fechaInicio, fechaFinal, pesoInicial, pesoFinal, estadoDieta)"
                + " VALUES (?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setInt(3, dieta.getProfesional().getIdProfesional());
            ps.setDate(4, Date.valueOf(dieta.getFechaInicio()));
            ps.setDate(5, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(6, dieta.getPesoInicial());
            ps.setDouble(7, dieta.getPesoFinal());
            ps.setBoolean(8, dieta.isEstadoDieta());

            ps.executeUpdate();
            ps.close();
            System.out.println("Dieta '" + dieta.getNombre() + "' agregada.");

        } catch (SQLException ex) {
            System.err.println("Error al agregar la dieta: " + ex.getMessage());
        }

    }

    public static void modificarDieta(Dieta dieta) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE dieta SET nombre = ?, idPaciente = ?, idProfesional = ?,"
                + " fechaInicio = ?, fechaFinal = ?, pesoInicial = ?, pesoFinal = ?,"
                + " estadoDieta = ?, WHERE idDieta = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setInt(3, dieta.getProfesional().getIdProfesional());
            ps.setDate(4, Date.valueOf(dieta.getFechaInicio()));
            ps.setDate(5, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(6, dieta.getPesoInicial());
            ps.setDouble(7, dieta.getPesoFinal());
            ps.setBoolean(8, dieta.isEstadoDieta());
            ps.setInt(9, dieta.getIdDieta());

            ps.executeUpdate();
            ps.close();
            System.out.println("Dieta modificada");

        } catch (SQLException ex) {
            System.err.println("Error al modificar la dieta: " + ex.getMessage());
        }

    }

    public static void bajaDieta(int idDieta) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE dieta SET estadoDieta = false WHERE idDieta = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idDieta);

            ps.executeUpdate();
            ps.close();
            System.out.println("Dieta borrada");

        } catch (SQLException ex) {
            System.err.println("Error al borrar la dieta: " + ex.getMessage());
        }

    }

    public static Dieta buscarDietaNombre(String nombre) {

        Dieta dieta = null;

        Connection conexion = Conexion.getConnection();
        String sql = "SELECT * FROM dieta WHERE nombre = ?";

        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                
                // Se obtiene el paciente y el profesional usando los métodos de
                // búsqueda por ID
                dieta.setPaciente(PacienteData.buscarPacienteID(rs.getInt("idPaciente")));
                dieta.setProfesional(ProfesionalData.buscarProfesionalID(rs.getInt("idProfesional")));
                
                dieta.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                dieta.setEstadoDieta(rs.getBoolean("estadoDieta"));

                System.out.println("Dieta encontrada");
            } else {
                System.out.println("La dieta no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            System.err.println("Error al buscar la dieta: " + ex.getMessage());
        }

        return dieta;

    }

}
