package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import nutricionistaapp.entidades.Paciente;

public class PacienteData {

    public static void agregarPaciente(Paciente paciente) {

        Connection conexion = Conexion.getConnection();
        String sql = "INSERT INTO paciente (apellido, nombre, dni, domicilio, "
                + "telefono, genero, email, fechaNac, pesoActual, pesoDeseado, "
                + "estadoPaciente) VALUES (?,?,?,?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, paciente.getApellido());
            ps.setString(2, paciente.getNombre());
            ps.setString(3, paciente.getDni());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getTelefono());
            ps.setString(6, paciente.getGenero().toString());
            ps.setString(7, paciente.getEmail());
            ps.setDate(8, Date.valueOf(paciente.getFechaNac()));
            ps.setDouble(9, paciente.getPesoActual());
            ps.setDouble(10, paciente.getPesoDeseado());
            ps.setBoolean(11, paciente.isEstadoPaciente());

            ps.executeUpdate();
            ps.close();
            System.out.println("Paciente " + paciente.getDni() + " agregado.");

        } catch (SQLException ex) {
            System.err.println("Error al agregar paciente: " + ex.getMessage());

        }
        
        

    }

    public static void modificarPaciente(Paciente paciente) {

    }

    public static void borrarPaciente(int idPaciente) {

    }

    public static List<Paciente> listarPacientes() {
        return null;
    }

    public static List<Paciente> listarPacientesBorrados() {
        return null;
    }

    public static List<Paciente> listarTodosPacientes() {
        return null;
    }

    public static void modificarPeso(int idPaciente, double peso) {

    }

    public static Paciente buscarPacienteDNI(String dni) {
        return null;
    }

}
