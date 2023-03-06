package org.example;

import java.util.Scanner;

public class Inversa {



    public void inversa() {

        Scanner input = new Scanner(System.in);

        int contador = 0;
        int[] numeros = new int[5];

        //Se crea lista con numeros
        while (contador != 5) {
            System.out.println("Ingrese números: ");
            numeros[contador] = input.nextInt();
            contador++;
        }


    //public void imprimirLista(){
        System.out.println("La lista ingresada es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("La lista ingresada, invertida es: ");
        for (int i = numeros.length -1; i >= 0 ; i--) {
            System.out.println(numeros[i]);

        }
    }
}
