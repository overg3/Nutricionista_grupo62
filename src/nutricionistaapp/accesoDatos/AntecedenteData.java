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

        String sql = "INSERT INTO antecedentes (idPaciente, antecedente, estado)"
                + " VALUES (?,?,?);";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, antecedente.getPaciente().getIdPaciente());
            ps.setString(2, String.valueOf(antecedente.getAntecendete()).toUpperCase());
            ps.setBoolean(3, antecedente.isEstado());

            ps.executeUpdate();
            System.out.println("Antecedente registrado");

        } catch (SQLException ex) {
            System.err.println("Error al registrar antecedente: " + ex.getMessage());
        }

    }

    public static void modificarAntecedente(int idAntecedente, AntecedenteTipo antecedente) {

        String sql = "UPDATE antecedentes SET antecedente = ? WHERE idAntecedente = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, String.valueOf(antecedente).toUpperCase());
            ps.setInt(2, idAntecedente);

            ps.executeUpdate();
            System.out.println("Antecedente modificado");

        } catch (SQLException ex) {
            System.err.println("Error al modificar el antecedente: " + ex.getMessage());
        }

    }

    public static void eliminarAntecedente(int idAntecedente) {

        String sql = "DELETE FROM antecedentes WHERE idAntecedente = ?";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idAntecedente);
            ps.executeUpdate();
            System.out.println("Antecedente borrado");

        } catch (SQLException ex) {
            System.err.println("Error al borrar antecedente: " + ex.getMessage());
        }

    }

    public static List<Antecedente> listarAntecedentes() {

        List<Antecedente> listaAntecedentes = new ArrayList<>();

        String sql = "SELECT * FROM antecedentes WHERE estado = 1";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                Antecedente antecedente = new Antecedente();
                antecedente.setIdAntecedente(rs.getInt("idAntecedente"));
                antecedente.setPaciente(PacienteData.buscarPacienteID(rs.getInt("idPaciente")));
                antecedente.setAntecendete(AntecedenteTipo.valueOf(rs.getString("tipo").toUpperCase()));
                antecedente.setEstado(rs.getBoolean("estado"));

                listaAntecedentes.add(antecedente);
            }

        } catch (SQLException ex) {
            System.err.println("Error al obtener la lista de antecedentes: " + ex.getMessage());
        }

        return listaAntecedentes;
    }

    public static List<Antecedente> listarAntecedentesIDPaciente(int idPaciente) {

        List<Antecedente> listaAntecedentes = new ArrayList<>();

        String sql = "SELECT * FROM antecedentes WHERE idPaciente = ? AND estado = 1";

        try (Connection conexion = Conexion.getConnection();
                PreparedStatement ps = conexion.prepareStatement(sql);) {

            ps.setInt(1, idPaciente);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Antecedente antecedente = new Antecedente();
                antecedente.setIdAntecedente(rs.getInt("idAntecedente"));
                antecedente.setPaciente(PacienteData.buscarPacienteID(rs.getInt("idPaciente")));
                antecedente.setAntecendete(AntecedenteTipo.valueOf(rs.getString("antecedente").toUpperCase()));
                antecedente.setEstado(rs.getBoolean("estado"));

                listaAntecedentes.add(antecedente);
            }

            rs.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener la lista de antecedentes: " + ex.getMessage());
        }

        return listaAntecedentes;

    }

}
