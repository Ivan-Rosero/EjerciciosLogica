package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Alfabetico {

    Scanner input = new Scanner(System.in);

    public void ordenAlfabetico() {
        try {
            int contador = 0;
            String[] vector = new String[5];
            //Se crea lista con palabras
            while (contador != 5) {
                System.out.println("Ingrese palabra: ");
                vector[contador] = input.nextLine();
                contador++;
            }
            //Se realiza el ordenamiento
            for (int i = 0; i < vector.length; i++) { //Toma cada palabra de la cadena
                for (int j = 0; j < vector.length && i != j; j++) {//Ayuda a comparar cada palabra con las demás en los ciclos
                    if (vector[i].compareToIgnoreCase(vector[j]) < 0) {
                        String aux = vector[i];
                        vector[i] = vector[j];
                        vector[j] = aux;
                    }
                }
            }
            //Se muestra lista ordenada
            System.out.println("Se muestra la lista ordenada: ");
            for (String a : vector) {
                System.out.println(a);
            }
        } catch (Exception e) {

        }
    }

}
