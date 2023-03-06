package org.example;

import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner input = new Scanner(System.in);


            System.out.println("Ingrese el número de ejercicio a realizar: ");
            System.out.println("1. Ordenamiento Selección");
            System.out.println("2. Ordenamiento Inserción");
            System.out.println("3. Ordenamiento Burbuja");
            System.out.println("4. Ordenamiento Alfabético");
            System.out.println("5. Ordenamiento Fechas");
            System.out.println("6. Busqueda Binaria");
            System.out.println("7. Busqueda Secuencial");
            System.out.println("8. Matriz en equis");
            System.out.println("9. Matriz ingresando filas y columnas");
            System.out.println("10. Lista inversa");
            System.out.println("11. Numeros pares");
            System.out.println("12. Imprimir equis y guiones");
            System.out.println("13. Imprimir triángulo");
            int opcion = input.nextInt();

            switch (opcion){
                case 1:
                Seleccion seleccion = new Seleccion();
                    seleccion.crearLista();
                    seleccion.ordenarLista();
                    seleccion.imprimirLista();
                    break;
                case 2:
                Insercion insercion = new Insercion();
                    insercion.crearLista();
                    insercion.ordenarLista();
                    insercion.imprimirLista();
                    break;
                case 3:
                Burbuja burbuja = new Burbuja();
                    burbuja.crearLista();
                    burbuja.ordenarLista();
                    burbuja.imprimirLista();
                    break;
                case 4:
                Alfabetico alfabetico = new Alfabetico();
                    alfabetico.ordenAlfabetico();
                    break;
                case 5:
                FechasOrdenar fechasOrdenar = new FechasOrdenar();
                    fechasOrdenar.agregarFechas();
                    System.out.println("Estas son las fechas en el orden ingresado: ");
                    fechasOrdenar.mostrarLista();
                    fechasOrdenar.ordernarLista();
                    System.out.println("Estas son las fechas en orden cronológico: ");
                    fechasOrdenar.mostrarLista();
                    break;
                case 6:
                BusquedaBinaria bBinaria = new BusquedaBinaria();
                    bBinaria.busqBinaria();
                    break;
                case 7:
                BusquedaSecuencial bSequencial = new BusquedaSecuencial();
                    bSequencial.busqSecuencial();
                    break;
                case 8:
                Imprimir_en_equis enX = new Imprimir_en_equis();
                    enX.enEquis();
                    break;
                case 9:
                Ingresar_filas_columnas fYC = new Ingresar_filas_columnas();
                    fYC.filasColumnas();
                    break;
                case 10:
                Inversa inversa = new Inversa();
                    inversa.inversa();
                    break;
                case 11:
                Pares pares = new Pares();
                    pares.matrizPares();
                    break;
                case 12:
                Imprimir_equis_guiones eqGu = new Imprimir_equis_guiones();
                    eqGu.equisGuiones();
                    break;
                case 13:
                Triangulo triangulo = new Triangulo();
                    triangulo.triangulos();
                    break;
                default:
                    System.out.println("El dato ingresado no es valido.");
                    break;
            }

    }
}