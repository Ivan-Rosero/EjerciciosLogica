package org.example;

import java.util.Scanner;

public class BusquedaBinaria {

    Scanner input = new Scanner(System.in);
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void busqBinaria() {
        System.out.println("Ingrese número para comprobar que existe");
        int numero = input.nextInt();

        boolean encontrado = false;
        int izq = 0;
        int der = numeros.length - 1;

        while (izq <= der) {
            int medio = (izq + der) / 2;
            if (numeros[medio] == numero) {
                encontrado = true;
                break;
            } else {
                if (numeros[medio] < numero) {
                    izq = medio + 1;
                } else {
                    der = medio - 1;
                }
            }
        }
        if (encontrado) {
            System.out.println("Se encontró el número");
        } else {
            System.out.println("No se encontró el número");
        }

    }
}
