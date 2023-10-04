
package nutricionistaapp;

import java.time.LocalDate;
import nutricionistaapp.accesoDatos.PacienteData;
import nutricionistaapp.categorias.Genero;
import nutricionistaapp.entidades.Paciente;

public class Main {
    public static void main(String[] args) {
        
        Paciente paciente = new Paciente("Prueba", "NombrePrueba", "31312321", 
                "Av. ASasd 464", "464446465", "prueba@gmail.com", Genero.MASCULINO, 
                LocalDate.of(1988, 8, 8), 200, 110, true);
        
        PacienteData.agregarPaciente(paciente);
        
    }
    
}
