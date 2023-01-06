package SegundoBimestre_Semana4;

import java.util.Scanner;

/**
 * programa paa elevar a una potencia dada los elementos de la matriz
 */
public class Potencia_Matriz {
    public static void main(String[] args) {
        int numeros[][] = {{1,2,3},{4,5,6},{7,8,9}}; //dimencion de la matriz 3x3
        int matriz_potencia [][] = new int [numeros.length][numeros[0].length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la potencia");
        int potencia = sc.nextInt();
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[0].length; columna++) {
                matriz_potencia[fila][columna] = (int) Math.pow(numeros[fila][columna], potencia);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int n = 0; n < numeros[0].length; n++) {
                System.out.print(matriz_potencia[i][n] + "\t");
            }
            System.out.println("");
        }
    }
}
