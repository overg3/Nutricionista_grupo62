package nutricionistaapp.entidades;

import java.time.LocalDate;

public class Dieta {

    private int idDieta;
    private Profesional profesional;
    private String nombre;
    private Paciente paciente;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private double pesoInicial;
    private double pesoFinal;
    private boolean estadoDieta;

    public Dieta() {
    }

    public Dieta(int idDieta, String nombre, Profesional profesional, Paciente paciente, LocalDate fechaInicio, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estadoDieta) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.profesional = profesional;
        this.paciente = paciente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estadoDieta = estadoDieta;
    }

    public Dieta(String nombre, Profesional profesional, Paciente paciente, LocalDate fechaInicio, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estadoDieta) {
        this.nombre = nombre;
        this.profesional = profesional;
        this.paciente = paciente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estadoDieta = estadoDieta;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstadoDieta() {
        return estadoDieta;
    }

    public void setEstadoDieta(boolean estadoDieta) {
        this.estadoDieta = estadoDieta;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return nombre + " - " + paciente.getNombre() + " " + paciente.getApellido();
    }

}
