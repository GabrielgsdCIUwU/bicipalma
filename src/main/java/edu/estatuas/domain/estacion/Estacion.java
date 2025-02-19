package edu.estatuas.domain.estacion;

import java.util.logging.Logger;

import edu.estatuas.domain.bicicleta.Movil;

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

    int getId() {
        return id;
    }

    String getDireccion() {
        return direccion;
    }

    int numAnclajes() {
        return anclajes().numAnclajes();
    }

    Anclajes anclajes() {
        return anclajes;
    }

    public void consultarEstacion() {
        logger.info("id: " + getId());
        logger.info("direccion: " + getDireccion());
        logger.info("NumeroAnclajes: " + numAnclajes());
    }

    public void anclarBicicleta(Movil movil) {

        for (int i = 1; i < numAnclajes() + 1; i++) {
            if (anclajes().getBiciAt(i) == null) {
                anclajes().ocuparAnclaje(i, movil);
                mostrarAnclaje(movil, i);
                break;
            }
        }

    }

    public int anclajesLibres() {
        int libres = 0;
        for (int i = 1; i < numAnclajes() + 1; i++) {
            if (anclajes().getBiciAt(i) == null) {
                libres++;
            }
        }
        return libres;
    }

    public void consultarAnclajes() {

        for (int i = 1; i < numAnclajes() + 1; i++) {
            if (anclajes().getBiciAt(i) != null) {
                logger.info("Anclaje "+ i + " " + anclajes.getBiciAt(i));
            } else {
                logger.info("Anclaje "+ i + " libre");
            }
        }
    }

    private void mostrarAnclaje(Movil movil, int numAnclaje) {
        logger.info("bicicleta: " + movil + " anclada en el anclaje: " + numAnclaje);
    }
}
