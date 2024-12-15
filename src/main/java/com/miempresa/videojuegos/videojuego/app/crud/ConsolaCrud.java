/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.crud;

import com.miempresa.videojuegos.videojuego.app.entidades.Consola;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asd
 */
public class ConsolaCrud {
    private List<Consola> consolas = new ArrayList<>();

    public void agregar(Consola consola) {
        consolas.add(consola);
    }

    public List<Consola> listar() {
        return consolas;
    }

    public boolean actualizar(String nombre, Consola actualizada) {
        for (int i = 0; i < consolas.size(); i++) {
            if (consolas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                consolas.set(i, actualizada);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String nombre) {
        return consolas.removeIf(consola -> consola.getNombre().equalsIgnoreCase(nombre));
    }    
}
