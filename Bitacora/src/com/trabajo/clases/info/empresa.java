package com.trabajo.clases.info;

public class empresa {
    String Nombre, Direccion;
    int numero;

    public empresa() {
    }

    public empresa(String nombre, String direccion, int numero) {
        Nombre = nombre;
        Direccion = direccion;
        this.numero = numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
