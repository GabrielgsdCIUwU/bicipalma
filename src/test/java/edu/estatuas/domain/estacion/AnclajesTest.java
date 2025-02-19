package edu.estatuas.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.estatuas.domain.bicicleta.Bicicleta;

public class AnclajesTest {
    
    @Test
    public void crearAnclajes() {
        Anclajes anclajes = new Anclajes(6);
        assertEquals(6, anclajes.numAnclajes());
    }

    @Test
    public void ocuparAnclaje() {
        Anclajes anclajes = new Anclajes(6);
        Bicicleta bicicleta = new Bicicleta(0);

        anclajes.ocuparAnclaje(1, bicicleta);

        assertEquals(bicicleta, anclajes.getBiciAt(1));
    }

}
