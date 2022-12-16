package SegundoBimestre_Semana2;

import java.util.Locale;
import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String n = teclado.nextLine().toLowerCase();
        int tm_palabra = n.length();
        char palabra_arr [] = new char[tm_palabra];
        // pasamos los caracteres de palabra al arreglo de palabra a letra
        for (int indice = 0; indice < tm_palabra; indice++) {
            palabra_arr [indice] = n.charAt(indice);
        }
        // lectura de arreglo d derecha a izquierda
        String palabra_invertida = "";
        for (int indice = tm_palabra - 1; indice >= 0 ; indice--) {
            palabra_invertida = palabra_invertida + palabra_arr[indice];
        }
        if (n .equals(palabra_invertida) ) {
            System.out.println("Si es palabra palindroma " + palabra_invertida);
        } else {
            System.out.println("No es una palabra polindroma " + palabra_invertida);
        }
    }
}

