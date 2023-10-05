package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nutricionistaapp.categorias.Genero;
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

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE paciente SET apellido = ?, nombre = ?, dni = ?, "
                + "domicilio = ?, telefono = ?, genero = ?, email = ?, "
                + "fechaNac = ? WHERE idPaciente = ?";

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
            ps.setInt(9, paciente.getIdPaciente());

            ps.executeUpdate();
            ps.close();
            System.out.println("Paciente modificado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar datos del paciente: " + ex.getMessage());
        }

    }

    public static void borrarPaciente(int idPaciente) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE paciente SET estadoPaciente = false WHERE idPaciente = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idPaciente);

            ps.executeUpdate();
            ps.close();
            System.out.println("Paciente borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar paciente: " + ex.getMessage());
        }

    }

    public static List<Paciente> listarPacientes() {

        List<Paciente> listaPacientes = new ArrayList<>();

        Connection conexion = Conexion.getConnection();
        String sql = "SELECT * FROM paciente WHERE estadoPaciente = 1";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getString("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setEmail(rs.getString("email"));
                paciente.setGenero(Genero.valueOf(rs.getString("genero").toUpperCase()));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstadoPaciente(rs.getBoolean("estadoPaciente"));

                listaPacientes.add(paciente);
            }
            ps.close();

        } catch (SQLException ex) {
            System.err.println("Error obtener la lista de pacientes: " + ex.getMessage());
        }

        return listaPacientes;

    }

    public static List<Paciente> listarPacientesBorrados() {

        List<Paciente> listaPacientes = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        String sql = "SELECT * FROM paciente WHERE estadoPaciente = 0";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getString("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setEmail(rs.getString("email"));
                paciente.setGenero(Genero.valueOf(rs.getString("genero").toUpperCase()));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstadoPaciente(rs.getBoolean("estadoPaciente"));

                listaPacientes.add(paciente);
            }
            ps.close();

        } catch (SQLException ex) {
            System.err.println("Error obtener la lista de pacientes: " + ex.getMessage());
        }

        return listaPacientes;
    }

    public static List<Paciente> listarTodosPacientes() {

        List<Paciente> listaPacientes = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        String sql = "SELECT * FROM paciente";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getString("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setEmail(rs.getString("email"));
                paciente.setGenero(Genero.valueOf(rs.getString("genero").toUpperCase()));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstadoPaciente(rs.getBoolean("estadoPaciente"));

                listaPacientes.add(paciente);
            }
            ps.close();

        } catch (SQLException ex) {
            System.err.println("Error obtener la lista de pacientes: " + ex.getMessage());
        }

        return listaPacientes;
    }

    public static void modificarPeso(int idPaciente, double peso) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE paciente SET pesoActual = ? WHERE idPaciente = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setDouble(1, peso);
            ps.setInt(2, idPaciente);

            ps.executeUpdate();
            ps.close();
            System.out.println("Peso del paciente actualizado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar el peso del paciente: " + ex.getMessage());
        }

    }

    public static Paciente buscarPacienteDNI(String dni) {

        Paciente paciente = null;
        Connection conexion = Conexion.getConnection();

        String sql = "SELECT * FROM paciente WHERE dni = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getString("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setEmail(rs.getString("email"));
                paciente.setGenero(Genero.valueOf(rs.getString("genero").toUpperCase()));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstadoPaciente(rs.getBoolean("estadoPaciente"));
                
                System.out.println("Paciente encontrado");
            } else {
                System.out.println("El paciente no existe");
            }
            ps.close();
            

        } catch (SQLException ex) {
            System.out.println("Error al buscar el paciente: " + ex.getMessage());
        }

        return paciente;

    }

}
