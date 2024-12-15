/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.entidades;

/**
 *
 * @author asd
 */
public class Videojuego {
    private String nombre;
    private String genero;
    private String plataforma;

    public Videojuego(String nombre, String genero, String plataforma) {
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public String getPlataforma() { return plataforma; }

    @Override
    public String toString() {
        return "Videojuego: " + nombre + ", Género: " + genero + ", Plataforma: " + plataforma;
    }
}    

