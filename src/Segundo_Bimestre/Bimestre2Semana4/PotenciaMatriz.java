package Bimestre2Semana4;

import java.util.Scanner;

/**
 * Programa para elevar una potencia dado los elementos de la matriz
 */
public class PotenciaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[][]= {{1,2,3},{4,5,6},{7,8,9}};
        //dimension de la matriz 3x3
        int matriz_potencia[][]=new int[numeros.length][numeros[0].length];
        System.out.println("Ingrese el valor de la potencia ");
        int potencia= sc.nextInt();
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[0].length; columna++) {
                matriz_potencia[fila][columna]= (int) Math.pow(numeros[fila][columna], potencia);
                System.out.print(matriz_potencia[fila][columna]+"\t");
            }
            System.out.println("\n");
        }
    }
}
