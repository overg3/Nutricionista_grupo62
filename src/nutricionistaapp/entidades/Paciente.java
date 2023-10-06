package nutricionistaapp.entidades;

import nutricionistaapp.categorias.Genero;
import java.time.LocalDate;

public class Paciente {

    private int idPaciente;
    private String apellido;
    private String nombre;
    private String dni;
    private String domicilio;
    private String telefono;
    private String email;
    private Genero genero;
    private LocalDate fechaNac;
    private double pesoActual;
    private double altura;
    private double imc;
    private double pesoDeseado;
    private boolean estadoPaciente;

    public Paciente() {
    }

    public Paciente(int idPaciente, String apellido, String nombre, String dni, String domicilio, String telefono, String email, Genero genero, LocalDate fechaNac, double pesoActual, double altura, double imc, double pesoDeseado, boolean estadoPaciente) {
        this.idPaciente = idPaciente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.pesoActual = pesoActual;
        this.altura = altura;
        this.imc = pesoActual / (altura * altura);
        this.pesoDeseado = pesoDeseado;
        this.estadoPaciente = estadoPaciente;
    }

    public Paciente(String apellido, String nombre, String dni, String domicilio, String telefono, String email, Genero genero, LocalDate fechaNac, double pesoActual, double altura, double imc, double pesoDeseado, boolean estadoPaciente) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.pesoActual = pesoActual;
        this.altura = altura;
        this.imc = pesoActual / (altura * altura);
        this.pesoDeseado = pesoDeseado;
        this.estadoPaciente = estadoPaciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoDeseado() {
        return pesoDeseado;
    }

    public void setPesoDeseado(double pesoDeseado) {
        this.pesoDeseado = pesoDeseado;
    }

    public boolean isEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(boolean estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    @Override
    public String toString() {
        return idPaciente + " - " + nombre + " " + apellido;
    }

}
