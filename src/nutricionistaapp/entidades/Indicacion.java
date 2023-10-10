package nutricionistaapp.entidades;

import nutricionistaapp.categorias.Horario;

public class Indicacion {

    private int idIndic;
    private Comida comida;
    private Dieta dieta;
    private Horario horario;
    private int porcion;
    private boolean estado;

    public Indicacion() {
    }

    public Indicacion(int idIndicacion, Comida comida, Dieta dieta, Horario horario, int porcion, boolean estado) {
        this.idIndic = idIndicacion;
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
        this.porcion = porcion;
        this.estado = estado;
    }

    public Indicacion(Comida comida, Dieta dieta, Horario horario, int porcion, boolean estado) {
        this.comida = comida;
        this.dieta = dieta;
        this.horario = horario;
        this.porcion = porcion;
        this.estado = estado;
    }

    public int getIdIndicacion() {
        return idIndic;
    }

    public void setIdIndicacion(int idIndicacion) {
        this.idIndic = idIndicacion;
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

    public int getIdIndic() {
        return idIndic;
    }

    public void setIdIndic(int idIndic) {
        this.idIndic = idIndic;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
