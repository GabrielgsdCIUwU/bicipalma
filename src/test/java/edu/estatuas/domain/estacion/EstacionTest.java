package edu.estatuas.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


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
}
