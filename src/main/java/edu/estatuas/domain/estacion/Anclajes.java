package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;

class Anclajes {

    private Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i=0; i < anclajes.length; i++) {
            anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return anclajes;
    }

    int numAnclajes() {
        return anclajes.length;
    }

    void ocuparAnclaje(int numAnclaje, Movil movil) {
        anclajes[numAnclaje - 1].anclarBici(movil);
    }

    Movil getBiciAt(int numAnclaje) {
        return anclajes[numAnclaje - 1].getBici();
    }
}
