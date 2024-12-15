/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author asd
 * @param <T>
 */
public class GestionDeAlmacenamiento<T> {

    // Método para guardar una lista de objetos en un archivo
    public void guardar(String archivo, List<T> datos) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(datos);
        }
    }

    // Método para cargar una lista de objetos desde un archivo
    @SuppressWarnings("unchecked")
    public List<T> cargar(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<T>) in.readObject();
        }
    }
}
