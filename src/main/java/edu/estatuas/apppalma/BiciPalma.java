package edu.estatuas.apppalma;

import java.util.logging.Logger;

import edu.estatuas.config.LoggerConfig;
import edu.estatuas.domain.bicicleta.Bicicleta;
import edu.estatuas.domain.estacion.Estacion;
import edu.estatuas.domain.tarjetausuario.TarjetaUsuario;

public class BiciPalma {
    private static final Logger logger = Logger.getLogger(BiciPalma.class.getName());

    static {
        LoggerConfig.init();
    }

    public static void main(String[] args) {
        logger.info("**** caso TEST visualizar estado de la estacion ****");

        Estacion estacion = new Estacion(1, "Manacor", 6);
        estacion.consultarEstacion();

        logger.info("*** caso TEST visualizar anclajes libres ****");
        logger.info("anclajes Libres: " + estacion.anclajesLibres());

        logger.info("*** caso TEST anclar bicicletas ****");
        int[] bicicletas = {200, 201, 202, 203};
        for (int i : bicicletas) {
            estacion.anclarBicicleta(new Bicicleta(i));
        }
        logger.info("anclajes Libres tras generar " + bicicletas.length + " bicis: " + estacion.anclajesLibres());

        logger.info("**** caso TEST consultar bicicletas ancladas ****");
        estacion.consultarAnclajes();

        logger.info("**** caso TEST retirar bicicleta ****");
        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
        logger.info("¿tarjeta de usuario activada? (true/false): " + tarjetaUsuario.isActivada());

        estacion.consultarAnclajes();
        logger.info("anclajes Libres: " + estacion.anclajesLibres());
    }
}
