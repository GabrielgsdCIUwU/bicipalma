package edu.estatuas.domain.estacion;

import java.util.logging.Logger;

public class Estacion {

    private static final Logger logger = Logger.getLogger("");
    private final int id;
    private final String direccion;
    private Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    private int numAnclajes() {
        return anclajes.numAnclajes();
    }

    private Anclajes anclajes() {
        return anclajes;
    }

    public void consultarEstacion(){
        logger.info("id: " + getId());
        logger.info("direccio: " + getDireccion());
        logger.info("NumeroAnclajes: " + numAnclajes());
    }
}
