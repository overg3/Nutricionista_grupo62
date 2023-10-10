package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

}
