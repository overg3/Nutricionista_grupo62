package nutricionistaapp.entidades;

import java.time.LocalDate;

public class Registro {

    private int idRegistro;
    private Paciente paciente;
    private double peso;
    private LocalDate fecha;
    private boolean estado;

    public Registro() {
    }

    public Registro(int idRegistro, Paciente paciente, double peso, LocalDate fecha, boolean estado) {
        this.idRegistro = idRegistro;
        this.paciente = paciente;
        this.peso = peso;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Registro(Paciente paciente, double peso, LocalDate fecha, boolean estado) {
        this.paciente = paciente;
        this.peso = peso;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return paciente.getNombre() + " " + paciente.getApellido() 
                + " " + peso + " " + fecha;
    }

}
