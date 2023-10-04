package nutricionistaapp.entidades;

public class Profesional {

    private int idProfesional;
    private String apellido;
    private String nombre;
    private String dni;
    private String domicilio;
    private String telefono;
    private String email;
    private boolean estado;
    private String matricula;

    public Profesional() {
    }

    public Profesional(int idProfesional, String apellido, String nombre, String dni, String domicilio, String telefono, String email, boolean estadoPro, String matricula) {
        this.idProfesional = idProfesional;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.estado = estadoPro;
        this.matricula = matricula;
    }

    public Profesional(String apellido, String nombre, String dni, String domicilio, String telefono, String email, boolean estadoPro, String matricula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.estado = estadoPro;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return matricula + " - " + nombre + " " + apellido;
    }

}
