package edu.estatuas.domain.estacion;

import edu.estatuas.domain.bicicleta.Movil;

class Anclaje {
    private boolean ocupado;
    private Movil bici;

    Anclaje() {
        this.ocupado = false;
        this.bici = null;
    }

    boolean isOcupado() {
        return ocupado;
    }

    Movil getBici() {
        return this.bici;
    }

    void anclarBici(Movil movil) {
        this.bici = movil;
        this.ocupado = true;
    }

    void liberarBici() {
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "Ocupado: " + Boolean.toString(isOcupado());
    }
}
