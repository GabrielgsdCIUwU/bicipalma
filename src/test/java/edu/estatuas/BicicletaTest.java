package edu.estatuas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.estatuas.domain.bicicleta.Bicicleta;

public class BicicletaTest {

    @Test
    public void getId() {
        Bicicleta bicicleta = new Bicicleta(0);
        assertEquals(0, bicicleta.getId());
    }    
}
