package nutricionistaapp;

import java.time.LocalDate;
import java.util.List;
import nutricionistaapp.accesoDatos.PacienteData;
import nutricionistaapp.categorias.Genero;
import nutricionistaapp.entidades.Paciente;

public class Main {

    public static void main(String[] args) {

        // Instancia nueva de paciente (modificar DNI para evitar error de duplicado)
        Paciente paciente = new Paciente(12, "Pepperino", "Pepe", "33833333",
                "Av. ASasd 464", "464446465", "prueba@gmail.com", Genero.OTRO,
                LocalDate.of(1988, 2, 1), 200, 110, true);
//        
//        PacienteData.agregarPaciente(paciente);
//
//            PacienteData.borrarPaciente(10);

    }

}
