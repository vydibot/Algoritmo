package com.algortimo1;


public class Main {
    public static void processCadena(String cadena) {
        // Paso 2: Establecer la longitud de la cadena
        int length = cadena.length();

        // Paso 3: Generar un vector (array) llamado 'vector1'
        char[] vector1 = new char[length];

        // Paso 4: Generar un vector (array) llamado 'vector2'
        char[] vector2 = new char[length];

        // Paso 5: Iterar el 'vector1': asignando un valor más en código ASCII al carácter de la misma posición en la cadena
        for (int i = 0; i < length; i++) {
            vector1[i] = (char)(cadena.charAt(i) + 1); // Se suma 1 al código ASCII de cada carácter
        }

        // Paso 6: Iterar el 'vector2': asignando un valor más en código ASCII al carácter de la misma posición en el 'vector1'
        for (int i = 0; i < length; i++) {
            vector2[i] = (char)(vector1[i] + 1); // Se suma 1 al código ASCII de cada carácter en 'vector1'
        }

        // Pass 7: Reformar la cadena original, el vector1 y el vector2
        System.out.println("Cadena original: " + cadena);
        System.out.println("Vector 1: " + new String(vector1));
        System.out.println("Vector 2: " + new String(vector2));
    }

    public static void main(String[] args) {
        // Pass 1: Recibir la cadena (Tipo String)
        String cadena = "hola";

        // Llamamos a la función que procesa la cadena
        processCadena(cadena);
    }
}