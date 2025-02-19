package edu.estatuas.domain.estacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.estatuas.domain.bicicleta.Bicicleta;

public class AnclajeTest {

    @Test
    public void nuevoAnclaje() {
        Anclaje anclaje = new Anclaje();
        assertNull(anclaje.getBici());
        assertFalse(anclaje.isOcupado());
    }

    @Test
    public void anclarBici() {
        Anclaje anclaje = new Anclaje();
        Bicicleta bici = new Bicicleta(0);

        anclaje.anclarBici(bici);

        assertTrue(anclaje.isOcupado());
        assertEquals(bici, anclaje.getBici());
    }

    @Test
    public void liberarBici() {
        Anclaje anclaje = new Anclaje();
        Bicicleta bici = new Bicicleta(1);

        anclaje.anclarBici(bici);

        anclaje.liberarBici();

        assertFalse(anclaje.isOcupado());
        assertNull(anclaje.getBici());
    }
}
