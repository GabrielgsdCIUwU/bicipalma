package edu.estatuas.domain;

public class Estacion {

    private final int id;
    private final String direccion;

    public Estacion(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }
}
