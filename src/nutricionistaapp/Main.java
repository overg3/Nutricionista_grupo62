package nutricionistaapp;

import java.time.LocalDate;
import java.util.List;
import nutricionistaapp.accesoDatos.ComidaData;
import nutricionistaapp.accesoDatos.PacienteData;
import nutricionistaapp.accesoDatos.ProfesionalData;
import nutricionistaapp.categorias.ComidaTipo;
import nutricionistaapp.categorias.Genero;
import nutricionistaapp.entidades.Comida;
import nutricionistaapp.entidades.Paciente;
import nutricionistaapp.entidades.Profesional;

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
        
        
        Profesional profesional = new Profesional(7, "Carranzo", "Pepe",
                "33834768", "Av. Particular 78", "46445262", "asadad@gmail.com",
                true, "3597564");
        
        ProfesionalData.modificarProfesional(profesional);
        

    }

}
