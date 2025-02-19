package edu.estatuas.apppalma;

import java.util.logging.Logger;

import edu.estatuas.domain.bicicleta.Bicicleta;
import edu.estatuas.domain.estacion.Estacion;

public class BiciPalma {
    private static final Logger logger = Logger.getLogger(BiciPalma.class.getName());

    public static void main(String[] args) {

        logger.info("**** caso TEST visualizar estado de la estacion ****");

        Estacion estacion = new Estacion(1, "Manacor", 6);
        estacion.consultarEstacion();

        logger.info("*** caso TEST visualizar anclajes libres ****");

        logger.info("anclajes Libres: " + estacion.anclajesLibres());

        logger.info("*** caso TEST anclar bicicletas ****");

        for (int i = 200; i < 204; i++) {
            estacion.anclarBicicleta(new Bicicleta(i));
        }

        estacion.consultarAnclajes();
    }
}
