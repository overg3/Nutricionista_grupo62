package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nutricionistaapp.entidades.Registro;

public class RegistroData {

    public static void agregarRegistro(Registro registro) {

        Connection conexion = Conexion.getConnection();
        String sql = "INSERT INTO registroPeso (idPaciente, peso, fecha, estado)"
                + " VALUES (?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, registro.getPaciente().getIdPaciente());
            ps.setDouble(2, registro.getPeso());
            ps.setDate(3, Date.valueOf(registro.getFecha()));
            ps.setBoolean(4, registro.isEstado());

            ps.executeUpdate();
            ps.close();
            System.out.println("Nuevo peso registrado");

        } catch (SQLException ex) {
            System.err.println("Error al registrar peso: " + ex.getMessage());

        }

    }

    public static void modificarRegistroPeso(int idRegistro, double peso) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE registroPeso SET peso = ? WHERE idRegistro = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setDouble(1, peso);
            ps.setInt(2, idRegistro);

            ps.executeUpdate();
            ps.close();
            System.out.println("Peso del registro actualizado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar el peso del registro: " + ex.getMessage());
        }

    }

    public static void bajaRegistro(int idRegistro) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE registroPeso SET estado = false WHERE idRegistro = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idRegistro);

            ps.executeUpdate();
            ps.close();
            System.out.println("Registro borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar el registro: " + ex.getMessage());
        }

    }

    public static List<Registro> listaRegistros(int idPaciente) {

        List<Registro> listaRegistros = new ArrayList<>();

        Connection conexion = Conexion.getConnection();
        String sql = "SELECT * FROM registropeso WHERE idPaciente = ? AND estado = 1";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Registro registro = new Registro();
                registro.setIdRegistro(rs.getInt("idRegistro"));
                registro.setPaciente(PacienteData.buscarPacienteID(rs.getInt("idPaciente")));
                registro.setPeso(rs.getDouble("peso"));
                registro.setFecha(rs.getDate("fecha").toLocalDate());
                registro.setEstado(rs.getBoolean("estado"));

                listaRegistros.add(registro);
            }
            ps.close();

        } catch (SQLException ex) {
            System.err.println("Error obtener la lista de registros: " + ex.getMessage());
        }

        return listaRegistros;

    }

}
