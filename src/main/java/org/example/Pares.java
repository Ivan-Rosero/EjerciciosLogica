package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pares {

    Scanner input = new Scanner(System.in);
    List<Integer> pares = new ArrayList<>();

    public void matrizPares() {

        System.out.println("Ingrese las filas de la matriz: ");
        int filas = input.nextInt();
        System.out.println("Ingrese las columnas de la matriz: ");
        int columnas = input.nextInt();

        int matriz[][] = new int[filas][columnas];

        System.out.println("Se creó una matriz con " + filas + " filas, y " + columnas + " columnas.");


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese valores de la posición de la matriz fila " + (i + 1) + ", columna " + (j + 1));
                matriz[i][j] = input.nextInt();
            }

        }

        //Imprimir matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        //Comprobar pares
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares.add(matriz[i][j]);
                }
            }
        }
        //Respuesta
        System.out.println("Hay " + pares.size() + " números pares.");
        System.out.println(pares);
    }
}

