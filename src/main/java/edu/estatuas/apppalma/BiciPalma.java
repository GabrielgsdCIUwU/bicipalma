package edu.estatuas.apppalma;

import java.util.logging.Logger;

import edu.estatuas.domain.Estacion;

public class BiciPalma {
    private static final Logger logger = Logger.getLogger(BiciPalma.class.getName());

    public static void main(String[] args) {
        Estacion estacion = new Estacion(1, "Manacor");
        logger.info("Hello World!");
    }
}
