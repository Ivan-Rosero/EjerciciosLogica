package org.example;

import java.util.Scanner;

public class Imprimir_en_equis {
    public void enEquis(){

        int[][] matriz = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1)
                    System.out.print(matriz[i][j]);
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

