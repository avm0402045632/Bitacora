package com.trabajo.clases.info;

public class tecnico extends Persona{
    String area;
    int id;

    public tecnico() {
    }

    public tecnico(String area, int id) {
        this.area = area;
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
