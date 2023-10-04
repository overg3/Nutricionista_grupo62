package nutricionistaapp.entidades;

import nutricionistaapp.categorias.ComidaTipo;

public class Comida {

    private int idComida;
    private String nombre;
    private ComidaTipo tipo;
    private double calorias;
    private boolean estadoComida;

    public Comida() {
    }

    public Comida(int idComida, String nombre, ComidaTipo tipo, double calorias, boolean estadoComida) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.tipo = tipo;
        this.calorias = calorias;
        this.estadoComida = estadoComida;
    }

    public Comida(String nombre, ComidaTipo tipo, double calorias, boolean estadoComida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.calorias = calorias;
        this.estadoComida = estadoComida;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ComidaTipo getTipo() {
        return tipo;
    }

    public void setTipo(ComidaTipo tipo) {
        this.tipo = tipo;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public boolean isEstadoComida() {
        return estadoComida;
    }

    public void setEstadoComida(boolean estadoComida) {
        this.estadoComida = estadoComida;
    }

    @Override
    public String toString() {
        return idComida + " - " + nombre;
    }

}
