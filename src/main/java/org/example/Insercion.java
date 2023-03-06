package org.example;

import java.util.Scanner;

public class Insercion {

    Scanner input = new Scanner(System.in);

    int contador = 0;
    int[] numeros = new int[5];

    public void crearLista() {

        //Se crea lista con numeros
        while (contador != 5) {
            System.out.println("Ingrese números: ");
            numeros[contador] = input.nextInt();
            contador++;
        }
    }

    public void ordenarLista() {
        for (int i = 0; i < numeros.length; i++) {
            int pos = i;//Se asigna auxiliar de posición para hacer barrido en while
            int aux = numeros[i];//valor numérico en la posición actual

            while ((pos > 0) && (numeros[pos - 1]) > aux) {//pos>0 para recorrer lista de derecha a izquierda
                // y comprobar si el número anterior es mayor al posterior
                numeros[pos] = numeros[pos - 1];//Si el numero es mayor, se iguala al de la posición actual
                pos--;
            }

            numeros[pos] = aux;//Al finalizar el barrido se asigna el número guardado en el auxiliar a la posición inicial

        }
    }

    public void imprimirLista() {
        //Se muestra lista ordenada
        System.out.println("Se muestra la lista ordenada: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

