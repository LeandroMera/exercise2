package org.gorditodev.ejerciciodos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Menu {
    private int num;
    private String nombre;
    private double precio;
    private String descripcion;

    public Menu(Integer id, String nombre, Double precio, String descripcion) {
        this.num = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;

    }

    public Menu() {
    }
}
