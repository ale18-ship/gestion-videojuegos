/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.iconos;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author asd
 */
public class CargarIcono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Ejemplo de Ícono");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            
            ImageIcon icono = new ImageIcon(CargarIcono.class.getResource("/com/miempresa/videojuegos/vistas/iconos/jugando-videojuegos.png"));
            
            JLabel etiqueta = new JLabel("Este es un ícono:", icono, JLabel.CENTER);
            etiqueta.setHorizontalTextPosition(JLabel.CENTER); // Texto centrado horizontalmente
            etiqueta.setVerticalTextPosition(JLabel.BOTTOM);  // Texto debajo del ícono
            
            frame.add(etiqueta);
            frame.setVisible(true);
        });
    }
    
}
