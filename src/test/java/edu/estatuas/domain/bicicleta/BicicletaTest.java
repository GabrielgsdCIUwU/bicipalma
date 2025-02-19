package edu.estatuas.domain.bicicleta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BicicletaTest {

    @Test
    public void getId() {
        Bicicleta bicicleta = new Bicicleta(0);
        assertEquals(0, bicicleta.getId());
    }    
}
