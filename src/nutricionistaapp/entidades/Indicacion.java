package nutricionistaapp.entidades;

import nutricionistaapp.categorias.Horario;

public class Indicacion {

    private int idIndicacion;
    private Comida comida;
    private Dieta dieta;
    private Horario horario;
    private int porcion;

    public Indicacion() {
    }

    public Indicacion(int idIndicacion, Comida comida, Dieta dieta, Horario horario, int porcion) {
        this.idIndicacion = idIndicacion;
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
        this.porcion = porcion;
    }

    public Indicacion(Comida comida, Dieta dieta, Horario horario, int porcion) {
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
        this.porcion = porcion;
    }

    public int getIdIndicacion() {
        return idIndicacion;
    }

    public void setIdIndicacion(int idIndicacion) {
        this.idIndicacion = idIndicacion;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public int getPorcion() {
        return porcion;
    }

    public void setPorcion(int porcion) {
        this.porcion = porcion;
    }

}
