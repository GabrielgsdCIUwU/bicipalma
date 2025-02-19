package edu.estatuas;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import edu.estatuas.domain.estacion.Estacion;


public class EstacionTest 
{
    
    @Test
    public void getId() {
        Estacion estacion = new Estacion(1, "Manacor", 0);
        assertEquals(1, estacion.getId());
    }

    @Test
    public void getDireccion() {
        Estacion estacion = new Estacion(2, "Palma", 0);
        assertEquals("Palma", estacion.getDireccion());
    }
}
