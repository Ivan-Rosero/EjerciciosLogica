package org.example;

import java.util.List;
import java.util.Scanner;

public class Seleccion {

    Scanner input = new Scanner(System.in);

    int contador = 0;
    int[] numeros = new int[5];

    //Se crea lista con numeros
    public void crearLista() {

        while (contador != 5) {
            System.out.println("Ingrese números a ordenar: ");
            numeros[contador] = input.nextInt();
            contador++;
        }
    }

    //Se realiza ordenamiento
    public void ordenarLista() {
        for (int i = 0; i < numeros.length; i++) {//Recorre cada número de la lista
            int minIndex = i; //Se iguala el indice para tener como referencia el mínimo
            for (int j = i + 1; j < numeros.length; j++) {//Se recorre para comparar números
                if (numeros[j] < numeros[minIndex]) {//Se comprueba si el número actual es menor al mínimo
                    minIndex = j;//Se reemplaza el indice en caso de que el número en con el índice mínimo sea mayor
                }
            }
            int temp = numeros[i];
            numeros[i] = numeros[minIndex];//Se reubica el número menor mas cerca del principio de la lista
            numeros[minIndex] = temp;

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
