package edu.estatuas.apppalma;

import java.util.logging.Logger;

import edu.estatuas.domain.estacion.Estacion;

public class BiciPalma {
    private static final Logger logger = Logger.getLogger(BiciPalma.class.getName());

    public static void main(String[] args) {

        logger.info("**** caso TEST visualizar estado de la estacion ****");

        Estacion estacion = new Estacion(1, "Manacor", 2);
        estacion.consultarEstacion();
    }
}
