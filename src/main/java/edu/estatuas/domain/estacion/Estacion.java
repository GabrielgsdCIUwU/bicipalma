package edu.estatuas.domain.estacion;

import java.util.logging.Logger;

import edu.estatuas.config.LoggerConfig;
import edu.estatuas.domain.bicicleta.Movil;
import edu.estatuas.domain.tarjetausuario.Autenticacion;

public class Estacion {

    private static final Logger logger = Logger.getLogger("");
    static {
        LoggerConfig.init();
    }
    private final int id;
    private final String direccion;
    private Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    private int numAnclajes() {
        return anclajes().numAnclajes();
    }

    private Anclajes anclajes() {
        return anclajes;
    }

    public void consultarEstacion() {
        logger.info(this.toString());
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

    public boolean leerTarjetaUsuario(Autenticacion autenticacion) {
        return autenticacion.isActivada();
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

    public void retirarBicicleta(Autenticacion autenticacion) {
        if (!autenticacion.isActivada()) {
            logger.info("No se puede retirar bicicleta sin tarjeta de usuario activada");
            return;
        }

        for (int i = 1; i < numAnclajes(); i++) {
            if (anclajes().getBiciAt(i) != null) {
                anclajes.anclajes()[i - 1].liberarBici();
                mostrarBicicleta(anclajes().getBiciAt(i), i);
                return;
            }
        }

        /*
         * Se ejecuta el siguiente código al no encontrar ningún móvil
         */
         logger.warning("No hay bicicletas en la estación");
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

    private void mostrarBicicleta(Movil movil, int numAnclaje) {
        logger.info("bicicleta retirada: " + movil + " del anclaje: " + numAnclaje);
    }

    @Override
    public String toString() {
        return "ID: " + getId() + '\n' +
            "Dirección: " + getDireccion() + '\n' +
            "Numero Anclajes: " + numAnclajes();
    }
}
