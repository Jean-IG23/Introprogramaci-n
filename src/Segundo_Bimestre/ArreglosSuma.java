package SegundoBimestre_Semana2;

import java.util.Scanner;

public class ArreglosSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese los numeros que desea en el arreglo");
        int n = teclado.nextInt();
        int ar1[] = new int [n];
        int ar2[] = new int [n];

        System.out.println("Ingrese los números para el arreglo 1");
        for (int indice = 0; indice < n ; indice++) {
            int n1 = teclado.nextInt();
            ar1 [indice] = n1;

        }
        System.out.println("Ingrese los números para el arreglo 2");
        for (int indice = 0; indice < n; indice++) {
            int numeros2 = teclado.nextInt();
            ar2[indice]=numeros2;

        }
        int sumatotal[]= new int [n];
        for (int indice = 0; indice < n ; indice++) {
            sumatotal[indice]= ar1[indice]+ar2[indice];

        }
        for (int indice = 0; indice < n ; indice++) {
            System.out.println(sumatotal[indice]);
        }
    }
