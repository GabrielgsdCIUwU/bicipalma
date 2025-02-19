package edu.estatuas.domain.estacion;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import edu.estatuas.domain.bicicleta.Bicicleta;



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

    @Test
    public void getNumAnclajes() {
        Estacion estacion = new Estacion(3, "Lore Ipsum", 20);
        assertEquals(20, estacion.numAnclajes());
    }

    @Test
    public void anclarBicicleta(){
        Estacion estacion = new Estacion(4, "Dolor sit", 1);
        Bicicleta bicicleta = new Bicicleta(0);
        estacion.anclarBicicleta(bicicleta);
        System.out.println(estacion.anclajes());
        assertEquals(bicicleta, estacion.anclajes().getBiciAt(1));
    }
}
