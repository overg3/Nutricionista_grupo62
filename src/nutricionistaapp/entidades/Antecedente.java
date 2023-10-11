package nutricionistaapp.entidades;

import nutricionistaapp.categorias.AntecedenteTipo;

public class Antecedente {

    private int idAntecedente;
    private Paciente paciente;
    private AntecedenteTipo antecendete;
    private boolean estado;

    public Antecedente(int idAntecedente, Paciente paciente, AntecedenteTipo antecendete, boolean estado) {
        this.idAntecedente = idAntecedente;
        this.paciente = paciente;
        this.antecendete = antecendete;
        this.estado = estado;
    }

    public Antecedente() {
    }

    public Antecedente(Paciente paciente, AntecedenteTipo antecendete, boolean estado) {
        this.paciente = paciente;
        this.antecendete = antecendete;
        this.estado = estado;
    }

    public int getIdAntecedente() {
        return idAntecedente;
    }

    public void setIdAntecedente(int idAntecedente) {
        this.idAntecedente = idAntecedente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public AntecedenteTipo getAntecendete() {
        return antecendete;
    }

    public void setAntecendete(AntecedenteTipo antecendete) {
        this.antecendete = antecendete;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
