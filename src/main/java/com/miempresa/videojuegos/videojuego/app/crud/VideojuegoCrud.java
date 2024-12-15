/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.crud;

import com.miempresa.videojuegos.videojuego.app.entidades.Videojuego;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asd
 */
public class VideojuegoCrud {
    private List<Videojuego> videojuegos = new ArrayList<>();

    public void agregar(Videojuego videojuego) {
        videojuegos.add(videojuego);
    }

    public List<Videojuego> listar() {
        return videojuegos;
    }

    public boolean actualizar(String nombre, Videojuego actualizado) {
        for (int i = 0; i < videojuegos.size(); i++) {
            if (videojuegos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                videojuegos.set(i, actualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String nombre) {
        return videojuegos.removeIf(videojuego -> videojuego.getNombre().equalsIgnoreCase(nombre));
    }    
}
