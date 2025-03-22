package com.algortimo1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {
    
    public static String[] processCadena(String cadena) {
        // 1. Crear variables basicas.
        int dimensionPalabra;
        int i;
        char[] palabraEncriptada1;
        char[] palabraEncriptada2;

        // 3. Determinar la cantidad de caracteres en la cadena. 
        dimensionPalabra = cadena.length();

        // 4. Asignar dimension palabra a la palabra encriptada 1.
        palabraEncriptada1 = new char[dimensionPalabra];
        // 5. Asignar dimension palabra a la palabra encriptada 2.
        palabraEncriptada2 = new char[dimensionPalabra];

        // 6. Modificar cada uno de los caracteres en la cadena según corrimiento.
        for ( i = 0; i < dimensionPalabra; i++) {
            palabraEncriptada1[i] = (char) (cadena.charAt(i) + 1);
        }
        // 7. Volver a modicar cada uno de los caracteres en la cadena según corrimiento.
        for ( i = 0; i < dimensionPalabra; i++) {
            palabraEncriptada2[i] = (char) (palabraEncriptada1[i] + 1);
        }

        return new String[]{new String(palabraEncriptada1), new String(palabraEncriptada2)};
    }
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Encriptador de Cadenas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        
        // 2. Obtener la cadena de entrada.
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
             //8. Mostrar la cadena, la palabra encriptada 1 y la palabra encriptada 2.
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

    
}