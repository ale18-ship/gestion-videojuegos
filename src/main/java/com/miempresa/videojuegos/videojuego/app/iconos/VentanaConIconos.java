/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.iconos;

import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author asd
 */
public class VentanaConIconos {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Ventana con Iconos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setLayout(new GridLayout(1, 3)); // Distribuye los iconos horizontalmente
            
            ImageIcon icono1 = new ImageIcon(VentanaConIconos.class.getResource("/com/miempresa/videojuegos/vistas/iconos/jugando-videojuegos.png"));
            ImageIcon icono2 = new ImageIcon(VentanaConIconos.class.getResource("/com/miempresa/videojuegos/vistas/iconos/dos-jugadores.png"));
            ImageIcon icono3 = new ImageIcon(VentanaConIconos.class.getResource("/com/miempresa/videojuegos/vistas/iconos/venta-de-verano.png"));
            
            JLabel etiqueta1 = new JLabel(icono1);
            JLabel etiqueta2 = new JLabel(icono2);
            JLabel etiqueta3 = new JLabel(icono3);
            
            frame.add(etiqueta1);
            frame.add(etiqueta2);
            frame.add(etiqueta3);
            
            frame.setVisible(true);
        });
    }
}
