/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author asd
 */
public class VentanaPrincipal extends Aplicacion {

    private JPanel panelContenido;

    @Override
    public void start() {
        EventQueue.invokeLater(() -> {
            try {
                
                JFrame ventana = new JFrame();
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setBounds(100, 100, 450, 300);
                
                panelContenido = new JPanel();
                panelContenido.setBorder(new EmptyBorder(5, 5, 5, 5));
                panelContenido.setLayout(new BorderLayout(0, 0));
                
                JLabel mensaje = new JLabel("Bienvenido a la Aplicación de Gestión de Videojuegos");
                panelContenido.add(mensaje, BorderLayout.CENTER);
                
                ventana.setContentPane(panelContenido);
                
                ventana.setVisible(true);
            } catch  (HeadlessException e) {
                System.err.println("Error al inicializar la ventana: " + e.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.start();
    }
}