package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nutricionistaapp.entidades.Profesional;

public class ProfesionalData {

    public static void agregarProfesional(Profesional profesional) {

        String sql = "INSERT INTO profesional (apellido, nombre, dni, domicilio, "
                + "telefono, email, estado, matricula) VALUES (?,?,?,?,?,?,?,?);";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, profesional.getApellido());
            ps.setString(2, profesional.getNombre());
            ps.setString(3, profesional.getDni());
            ps.setString(4, profesional.getDomicilio());
            ps.setString(5, profesional.getTelefono());
            ps.setString(6, profesional.getEmail());
            ps.setBoolean(7, profesional.isEstado());
            ps.setString(8, profesional.getMatricula());

            ps.executeUpdate();
            System.out.println("Profesional: " + profesional.getMatricula() + " agregado.");

        } catch (SQLException ex) {
            System.err.println("Error al agregar profesional: " + ex.getMessage());
        }

    }

    public static void bajaProfesional(int idProfesional) {

        String sql = "UPDATE profesional SET estado = false WHERE idProfesional = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idProfesional);

            ps.executeUpdate();
            System.out.println("Profesional borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar profesional: " + ex.getMessage());
        }
    }

    public static void modificarProfesional(Profesional profesional) {

        String sql = "UPDATE profesional SET apellido = ?, nombre = ?, dni = ?, "
                + "domicilio = ?, telefono = ?, email = ?, estado = ?, matricula = ?"
                + " WHERE idProfesional = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, profesional.getApellido());
            ps.setString(2, profesional.getNombre());
            ps.setString(3, profesional.getDni());
            ps.setString(4, profesional.getDomicilio());
            ps.setString(5, profesional.getTelefono());
            ps.setString(6, profesional.getEmail());
            ps.setBoolean(7, profesional.isEstado());
            ps.setString(8, profesional.getMatricula());
            ps.setInt(9, profesional.getIdProfesional());

            ps.executeUpdate();
            System.out.println("Profesional modificado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar datos del profesional: " + ex.getMessage());
        }
    }

    public static Profesional buscarProfesionalID(int idProfesional) {

        Profesional profesional = null;

        String sql = "SELECT * FROM profesional WHERE idProfesional = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idProfesional);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                profesional = new Profesional();
                profesional.setIdProfesional(rs.getInt("idProfesional"));
                profesional.setApellido(rs.getString("apellido"));
                profesional.setNombre(rs.getString("nombre"));
                profesional.setDni(rs.getString("dni"));
                profesional.setDomicilio(rs.getString("domicilio"));
                profesional.setTelefono(rs.getString("telefono"));
                profesional.setEmail(rs.getString("email"));
                profesional.setEstado(rs.getBoolean("estado"));
                profesional.setMatricula(rs.getString("matricula"));

                System.out.println("Profesional encontrado");
            } else {
                System.out.println("El profesional no existe");
            }
            rs.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar el profesional: " + ex.getMessage());
        }
        return profesional;
    }

    public static List<Profesional> listarProfesionales() {

        List<Profesional> listaProfesionales = new ArrayList<>();

        String sql = "SELECT * FROM profesional WHERE estado = 1";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Profesional profesional = new Profesional();
                profesional.setIdProfesional(rs.getInt("idProfesional"));
                profesional.setApellido(rs.getString("apellido"));
                profesional.setNombre(rs.getString("nombre"));
                profesional.setDni(rs.getString("dni"));
                profesional.setDomicilio(rs.getString("domicilio"));
                profesional.setTelefono(rs.getString("telefono"));
                profesional.setEmail(rs.getString("email"));
                profesional.setEstado(rs.getBoolean("estado"));
                profesional.setMatricula(rs.getString("matricula"));

                listaProfesionales.add(profesional);
            }

        } catch (SQLException ex) {
            System.err.println("Error obtener la lista de profesionales: " + ex.getMessage());
        }
        return listaProfesionales;
    }

    public static Profesional buscarProfesionalMatricula(String matricula) {

        Profesional profesional = null;

        String sql = "SELECT * FROM profesional WHERE matricula = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, matricula);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                profesional = new Profesional();
                profesional.setIdProfesional(rs.getInt("idProfesional"));
                profesional.setApellido(rs.getString("apellido"));
                profesional.setNombre(rs.getString("nombre"));
                profesional.setDni(rs.getString("dni"));
                profesional.setDomicilio(rs.getString("domicilio"));
                profesional.setTelefono(rs.getString("telefono"));
                profesional.setEmail(rs.getString("email"));
                profesional.setEstado(rs.getBoolean("estado"));
                profesional.setMatricula(rs.getString("matricula"));

                System.out.println("Profesional encontrado");
            } else {
                System.out.println("El profesional no existe");
            }
            rs.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar el profesional: " + ex.getMessage());
        }
        return profesional;
    }

}
