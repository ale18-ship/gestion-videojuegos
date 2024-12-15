/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.entidades;

/**
 *
 * @author asd
 */
public class Jugador {
    private String nombre;
    private int nivel;
    private String logros;

    public Jugador(String nombre, int nivel, String logros) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.logros = logros;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public String getLogros() { return logros; }
    public void setLogros(String logros) { this.logros = logros; }

    @Override
    public String toString() {
        return "Jugador: " + nombre + ", Nivel: " + nivel + ", Logros: " + logros;
    }
}    
