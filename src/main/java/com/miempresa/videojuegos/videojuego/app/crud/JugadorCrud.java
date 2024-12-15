/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.crud;

import com.miempresa.videojuegos.videojuego.app.entidades.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asd
 */
public class JugadorCrud {
    private List<Jugador> jugadores = new ArrayList<>();

    public void agregar(Jugador jugador) {
        jugadores.add(jugador);
    }

    public List<Jugador> listar() {
        return jugadores;
    }

    public boolean actualizar(String nombre, Jugador actualizado) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
                jugadores.set(i, actualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String nombre) {
        return jugadores.removeIf(jugador -> jugador.getNombre().equalsIgnoreCase(nombre));
    }    
}
