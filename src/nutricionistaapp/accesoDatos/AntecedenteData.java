package nutricionistaapp.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import nutricionistaapp.categorias.AntecedenteTipo;
import nutricionistaapp.entidades.Antecedente;

public class AntecedenteData {

    public static void agregarAntecedente(Antecedente antecedente) {

        Connection conexion = Conexion.getConnection();
        String sql = "INSERT INTO antecedentes (idPaciente, antecedente, estado)"
                + " VALUES (?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, antecedente.getPaciente().getIdPaciente());
            ps.setString(2, String.valueOf(antecedente.getAntecendete()).toUpperCase());
            ps.setBoolean(3, antecedente.isEstado());

            ps.executeUpdate();
            ps.close();
            System.out.println("Antecedente registrado");

        } catch (SQLException ex) {
            System.err.println("Error al registrar antecedente: " + ex.getMessage());
        }

    }

    public static void modificarAntecedente(int idAntecedente, AntecedenteTipo antecedente) {

        Connection conexion = Conexion.getConnection();
        String sql = "UPDATE antecedentes SET antecedente = ? WHERE idAntecedente = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, String.valueOf(antecedente).toUpperCase());
            ps.setInt(2, idAntecedente);

            ps.executeUpdate();
            ps.close();
            System.out.println("Antecedente modificado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar el antecedente: " + ex.getMessage());
        }

    }

    public static void eliminarAntecedente(int idAntecedente) {

        Connection conexion = Conexion.getConnection();
        String sql = "DELETE FROM antecedentes WHERE idAntecedente = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idAntecedente);
            ps.executeUpdate();
            ps.close();
            System.out.println("Antecedente borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar antecedente: " + ex.getMessage());
        }

    }

    public static List<Antecedente> listarAntecedentes() {

        List<Antecedente> listaAntecedentes = new ArrayList<>();

        Connection conexion = Conexion.getConnection();
        String sql = "SELECT * FROM antecedentes WHERE estado = 1";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Antecedente antecedente = new Antecedente();
                antecedente.setIdAntecedente(rs.getInt("idAntecedente"));
                antecedente.setPaciente(PacienteData.buscarPacienteID(rs.getInt("idPaciente")));
                antecedente.setAntecendete(AntecedenteTipo.valueOf(rs.getString("tipo").toUpperCase()));
                antecedente.setEstado(rs.getBoolean("estado"));

                listaAntecedentes.add(antecedente);
            }
            ps.close();

        } catch (SQLException ex) {
            System.err.println("Error al obtener la lista de antecedentes: " + ex.getMessage());
        }

        return listaAntecedentes;
    }

}
