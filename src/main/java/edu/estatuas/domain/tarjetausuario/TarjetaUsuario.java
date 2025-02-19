package edu.estatuas.domain.tarjetausuario;

public class TarjetaUsuario implements Autenticacion {
    private final String id;
    private boolean activada;

    TarjetaUsuario (String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    @Override
    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }
}
