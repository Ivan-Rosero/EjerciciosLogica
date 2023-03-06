package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FechasOrdenar {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static Calendar calendar = Calendar.getInstance();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    static Date[] dates = new Date[5];
    static String[] fechas = new String[5];

    public void agregarFechas() throws NumberFormatException, ParseException, IOException {
        for (int i = 0; i < fechas.length; i++) {
            System.out.println("Ingrese fecha " + (i + 1) + " en el formato " + "aaaa/mm/dd");
            String Date = input.readLine();
            calendar.setTime(dateFormat.parse(Date));
            String fechaConFormato = dateFormat.format(calendar.getTime());
            dates[i] = calendar.getTime();

            fechas[i] = fechaConFormato;
        }
    }

    public void mostrarLista() {
        for (int i = 0; i < fechas.length; i++) {
            System.out.println((i + 1) + ". Fecha " + fechas[i]);
        }
    }

    public void ordernarLista() {
        for (int i = 0; i < fechas.length; i++) { //Toma cada palabra de la cadena
            for (int j = 0; j < fechas.length && i != j; j++) {//Ayuda a comparar cada palabra con las demás en los ciclos
                if (fechas[i].compareToIgnoreCase(fechas[j]) < 0) {
                    String aux = fechas[i];
                    fechas[i] = fechas[j];
                    fechas[j] = aux;
                }
            }
        }

    }
}

