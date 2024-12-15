/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.videojuegos.videojuego.app.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author asd
 */
class Aplicacion {
    private JFrame frame;
    private JPanel contentPane;

    public Aplicacion() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));

        JLabel mensaje = new JLabel("Bienvenido a la Aplicación de Gestión de Videojuegos");
        contentPane.add(mensaje, BorderLayout.CENTER);

        frame.setContentPane(contentPane);
    }

    public void start() {
        EventQueue.invokeLater(() -> frame.setVisible(true));
    }

    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion();
        aplicacion.start();
    }
}
    
