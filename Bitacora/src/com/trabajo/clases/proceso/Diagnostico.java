package com.trabajo.clases.proceso;

import java.util.Date;

public class Diagnostico {
    String dia;
    String fallo, causa, solucion, estadoDelEquipo, piezasUtilizadas;
    float costo;

    public Diagnostico() {
    }

    public Diagnostico(String dia, String fallo, String causa, String solucion, String estadoDelEquipo, String piezasUtilizadas, float costo) {
        this.dia = dia;
        this.fallo = fallo;
        this.causa = causa;
        this.solucion = solucion;
        this.estadoDelEquipo = estadoDelEquipo;
        this.piezasUtilizadas = piezasUtilizadas;
        this.costo = costo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getFallo() {
        return fallo;
    }

    public void setFallo(String fallo) {
        this.fallo = fallo;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public String getEstadoDelEquipo() {
        return estadoDelEquipo;
    }

    public void setEstadoDelEquipo(String estadoDelEquipo) {
        this.estadoDelEquipo = estadoDelEquipo;
    }

    public String getPiezasUtilizadas() {
        return piezasUtilizadas;
    }

    public void setPiezasUtilizadas(String piezasUtilizadas) {
        this.piezasUtilizadas = piezasUtilizadas;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
