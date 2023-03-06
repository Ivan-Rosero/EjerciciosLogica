package org.example;

import java.util.Scanner;

public class Triangulo {
    Scanner input = new Scanner(System.in);

    public void triangulos() {
        try {
            System.out.println("Ingrese 1 o 2 de acuerdo al tipo de triángulo a imprimir: ");
            System.out.println("1. Equilatero");
            System.out.println("2. Recto");
            int tipoTriangulo = input.nextInt();

            if (tipoTriangulo == 1) {
                System.out.println("Triángulo equilatero");
                System.out.println("Ingrese el número de filas del triángulo");
                int filas = input.nextInt(); // Número de filas del triángulo
                // Ciclo que recorre las filas del triángulo
                for (int i = 1; i <= filas; i++) {
                    // Ciclo que imprime los espacios en blanco antes de los asteriscos
                    for (int j = 1; j <= filas - i; j++) {
                        System.out.print(" ");
                    }
                    // Ciclo que imprime los asteriscos
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    // Salto de línea al final de cada fila
                    System.out.println();
                }
            } else if (tipoTriangulo == 2) {
                System.out.println("Triángulo recto");
                System.out.println("Ingrese el número de filas del triángulo");
                int filas = input.nextInt(); // Número de filas del triángulo
                for (int i = 1; i <= filas; i++) {
                    // Ciclo que imprime los asteriscos
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Salto de línea al final de cada fila
                    System.out.println();
                }
            } else {
                System.out.println("Esa opción no es valida.");
            }
        } catch (Exception exception) {
            System.out.println("Ingrese un valor valido.");
        }
    }

}

