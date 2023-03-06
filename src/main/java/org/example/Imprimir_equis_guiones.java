package org.example;

import java.util.Scanner;

public class Imprimir_equis_guiones {
    public void equisGuiones() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el numero de filas de la equis: ");
        String filas = scanner.nextLine();

        if (!filas.matches("\\d+")) {
            throw new IllegalArgumentException("Ingrese solo números.");
        }
        numero = Integer.parseInt(filas);
        if (numero <= 0) {
            throw new IllegalArgumentException("Ingrese números positivos");
        }

        int matriz[][] = new int[numero][numero];

        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j || i + j == matriz.length - 1)
                        System.out.print("X");
                    else
                        System.out.print("_");
                }
                System.out.println();
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

