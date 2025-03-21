package com.algortimo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Encriptador de Cadenas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Crear componentes
        JLabel label = new JLabel("Ingrese una cadena:");
        JTextField textField = new JTextField(20);
        JButton encryptButton = new JButton("Encriptar");
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        // Agregar acción al botón
        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadena = textField.getText();
                String[] resultados = processCadena(cadena);
                resultArea.setText("Cadena original: " + cadena + "\n" +
                                   "Palabra encriptada 1: " + resultados[0] + "\n" +
                                   "Palabra encriptada 2: " + resultados[1]);
            }
        });

        // Agregar componentes al frame
        frame.add(label);
        frame.add(textField);
        frame.add(encryptButton);
        frame.add(new JScrollPane(resultArea));

        // Mostrar la ventana
        frame.setVisible(true);
    }

    public static String[] processCadena(String cadena) {
        int dimensionPalabra = cadena.length();
        char[] palabraEncriptada1 = new char[dimensionPalabra];
        char[] palabraEncriptada2 = new char[dimensionPalabra];

        for (int i = 0; i < dimensionPalabra; i++) {
            palabraEncriptada1[i] = (char) (cadena.charAt(i) + 1);
        }
        for (int i = 0; i < dimensionPalabra; i++) {
            palabraEncriptada2[i] = (char) (palabraEncriptada1[i] + 1);
        }

        return new String[]{new String(palabraEncriptada1), new String(palabraEncriptada2)};
    }
}
