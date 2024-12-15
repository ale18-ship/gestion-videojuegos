/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.gui;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author asd
 */
public class AplicacionPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                JFrame frame = new JFrame("Gestión de Videojuegos");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 400);
                
                JMenuBar barraDeMenus = new JMenuBar();
                
                JMenu menuVideojuegos = new JMenu("Videojuegos");
                JMenuItem itemCrearVideojuego = new JMenuItem("Crear Videojuego");
                JMenuItem itemListarVideojuegos = new JMenuItem("Listar Videojuegos");
                
                itemCrearVideojuego.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(frame, "Función para crear videojuegos no implementada aún.");
                });
                
                itemListarVideojuegos.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(frame, "Función para listar videojuegos no implementada aún.");
                });
                
                menuVideojuegos.add(itemCrearVideojuego);
                menuVideojuegos.add(itemListarVideojuegos);
                
                JMenu menuConsolas = new JMenu("Consolas");
                JMenuItem itemCrearConsola = new JMenuItem("Crear Consola");
                JMenuItem itemListarConsolas = new JMenuItem("Listar Consolas");
                
                itemCrearConsola.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(frame, "Función para crear consolas no implementada aún.");
                });
                
                itemListarConsolas.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(frame, "Función para listar consolas no implementada aún.");
                });
                
                menuConsolas.add(itemCrearConsola);
                menuConsolas.add(itemListarConsolas);
                
                JMenu menuJugadores = new JMenu("Jugadores");
                JMenuItem itemCrearJugador = new JMenuItem("Crear Jugador");
                JMenuItem itemListarJugadores = new JMenuItem("Listar Jugadores");
                
                itemCrearJugador.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(frame, "Función para crear jugadores no implementada aún.");
                });
                
                itemListarJugadores.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(frame, "Función para listar jugadores no implementada aún.");
                });
                
                menuJugadores.add(itemCrearJugador);
                menuJugadores.add(itemListarJugadores);
                
                barraDeMenus.add(menuVideojuegos);
                barraDeMenus.add(menuJugadores);
                barraDeMenus.add(menuConsolas);
                
                frame.setJMenuBar(barraDeMenus);
                
                frame.setVisible(true);
            } catch (HeadlessException e) {
            }
        });
    }
    
}
