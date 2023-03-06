package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Burbuja {

        Scanner input = new Scanner(System.in);

        int contador = 0;
        int[] numeros = new int[5];

        //Se crea lista con numeros
        public void crearLista(){
        while (contador != 5){
            System.out.println("Ingrese números: ");
            numeros[contador] = input.nextInt();
            contador++;
        }
        }

        //Se realiza el ordenamiento
        public void ordenarLista(){
        for (int i = 0; i <numeros.length -1; i++){//Toma cada número
            for (int j = 0; j < numeros.length -1; j++) {//Se compara cada número con los demás en cada ciclo
                if(numeros[j] > numeros[ j + 1]){//Se verifica si el numero de la posición actual es mayor al de la posición siguiente
                    int aux = numeros[j];
                    numeros[j] = numeros[ j + 1 ];
                    numeros[ j + 1 ] = aux; //Se reubica la posición de los numeros
                }
            }
        }
        }

        //Se imprimen números
        public void imprimirLista(){
        System.out.println("Los numeros odenados de menor a mayor son: ");
        for (int i = 0; i < numeros.length;i++){
            System.out.println(numeros[i]);
        }
        }
    }

