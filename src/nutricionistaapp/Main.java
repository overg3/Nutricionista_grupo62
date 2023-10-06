package nutricionistaapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import nutricionistaapp.accesoDatos.ComidaData;
import nutricionistaapp.accesoDatos.DietaData;
import nutricionistaapp.accesoDatos.PacienteData;
import nutricionistaapp.accesoDatos.ProfesionalData;
import nutricionistaapp.accesoDatos.RegistroData;
import nutricionistaapp.categorias.ComidaTipo;
import nutricionistaapp.categorias.Genero;
import nutricionistaapp.entidades.Comida;
import nutricionistaapp.entidades.Dieta;
import nutricionistaapp.entidades.Paciente;
import nutricionistaapp.entidades.Profesional;
import nutricionistaapp.entidades.Registro;

public class Main {

    public static void main(String[] args) {

        // Instancia nueva de paciente (modificar DNI para evitar error de duplicado)
      
//        Paciente paciente = new Paciente(12, "Dominguez", "Alberto", "33833333",
//                "Av. ASasd 464", "464446465", "prueba@gmail.com", Genero.MASCULINO,
//                LocalDate.of(1988, 2, 1), 180, 110, true);
      
        
        Profesional profesional = new Profesional(4, "Cormichot", "Lalo", "2301666", "Av. NoseQue", "49878987", "cormichot@gmail.com", true, "4294639");
        Paciente paciente = PacienteData.buscarPacienteDNI("45678901");
        
        
        Dieta dieta = new Dieta("Dieta de la vaca loca", profesional, paciente, 
                LocalDate.now(), LocalDate.of(2023, Month.DECEMBER, 12), 
                paciente.getPesoActual(), 75.1, true);
        
        DietaData.agregarDieta(dieta);
        

    }

}
