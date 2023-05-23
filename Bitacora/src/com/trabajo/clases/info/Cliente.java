package com.trabajo.clases.info;

public class Cliente  extends Persona{
    String tipoCliente;

    public Cliente() {
    }

    public Cliente(String tipoCilente) {
        this.tipoCliente = tipoCilente;
    }

    public String getTipoCilente() {
        return tipoCliente;
    }

    public void setTipoCilente(String tipoCilente) {
        this.tipoCliente = tipoCilente;
    }
}
