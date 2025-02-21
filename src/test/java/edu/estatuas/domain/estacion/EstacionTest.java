package edu.estatuas.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.estatuas.domain.tarjetausuario.TarjetaUsuario;


public class EstacionTest {

    @Test
    public void crearEstacion() {
        Estacion estacion = new Estacion(1, "Manacor", 0);
        assertEquals("ID: 1\nDirección: Manacor\nNumero Anclajes: 0", estacion.toString());
    }

    @Test
    public void anclajesLibres() {
        Estacion estacion = new Estacion(5, "amet consectetur", 20);
        assertEquals(20, estacion.anclajesLibres());
    }

    @Test
    public void anclarBicicletaVacia() {
        Estacion estacion = new Estacion(6, "amet consectetur", 1);

        estacion.anclarBicicleta(null);
        assertEquals(1, estacion.anclajesLibres());
    }

    @Test
    public void retirarBicicletaEnAnclajesVacios() {
        Estacion estacion = new Estacion(7, "amet consectetur", 3);
        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
        estacion.retirarBicicleta(tarjetaUsuario);

        assertEquals(3, estacion.anclajesLibres());
    }
}
