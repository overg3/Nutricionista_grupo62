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

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    

    @Override
    public String toString() {
        return matricula + " - " + nombre + " " + apellido;
    }

}
