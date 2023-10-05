package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import nutricionistaapp.entidades.Profesional;

public class ProfesionalData {

    public static void agregarProfesional(Profesional profesional) {

        Connection conexion = Conexion.getConnection();
        String sql = "INSERT INTO profesional (apellido, nombre, dni, domicilio, "
                + "telefono, email, estado, matricula) VALUES (?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, profesional.getApellido());
            ps.setString(2, profesional.getNombre());
            ps.setString(3, profesional.getDni());
            ps.setString(4, profesional.getDomicilio());
            ps.setString(5, profesional.getTelefono());
            ps.setString(6, profesional.getEmail());
            ps.setBoolean(7, profesional.isEstado());
            ps.setString(8, profesional.getMatricula());

            ps.executeUpdate();
            ps.close();
            System.out.println("Profesional: " + profesional.getMatricula() + " agregado.");

        } catch (SQLException ex) {
            System.err.println("Error al agregar profesional: " + ex.getMessage());

        }

    }

    public static void borrarProfesional(int idProfesional) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE profesional SET estado = false WHERE idProfesional = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idProfesional);

            ps.executeUpdate();
            ps.close();
            System.out.println("Profesional borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar profesional: " + ex.getMessage());
        }

    }

    public static void modificarProfesional(Profesional profesional) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE profesional SET apellido = ?, nombre = ?, dni = ?, "
                + "domicilio = ?, telefono = ?, email = ?, estado = ?, matricula = ?"
                + " WHERE idProfesional = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

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
            ps.close();
            System.out.println("Profesional modificado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar datos del profesional: " + ex.getMessage());
        }

    }

}
