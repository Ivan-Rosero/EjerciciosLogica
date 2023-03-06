package org.example;

import java.util.Scanner;

public class BusquedaSecuencial {
    public void busqSecuencial(){
        Scanner input = new Scanner(System.in);
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Ingrese número a buscar");
        int numero = input.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]){
                encontrado = true;
                break;
            }

        }
        if(encontrado == true){
            System.out.println("El número " + numero + " se encontró en la lista.");
        }else{
            System.out.println("No se encontró el número " + numero + " en la lista.");
        }
    }
}
