/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.entidades;

/**
 *
 * @author asd
 */
public class Consola {
    private String nombre;
    private String marca;
    private int anioLanzamiento;

    public Consola(String nombre, String marca, int anioLanzamiento) {
        this.nombre = nombre;
        this.marca = marca;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAnioLanzamiento() { return anioLanzamiento; }
    public void setAnioLanzamiento(int anioLanzamiento) { this.anioLanzamiento = anioLanzamiento; }

    @Override
    public String toString() {
        return "Consola: " + nombre + ", Marca: " + marca + ", Año de Lanzamiento: " + anioLanzamiento;
    }    
}
