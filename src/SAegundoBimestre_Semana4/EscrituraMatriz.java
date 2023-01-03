package SAegundoBimestre_Semana4;

import java.util.Scanner;

public class EscrituraMatriz {
    public static void main(String[] args) {
        int numeros[][] = new int[3][2];
        int filas = numeros.length;
        int columnas = numeros[1].length;
        numeros[1][1] = 5;
        numeros[2][0] = 9;
        // operacion escritutra de una matriz
        Scanner sc = new Scanner(System.in);
        for (int fila = 0; fila < filas; fila++) {
            System.out.println("Fila " + fila);
            for (int columna = 0; columna < columnas; columna++) {
                System.out.println("Ingrese una edad para numeros["+ fila +"]["+ columna +"]");
                        int edad = sc.nextInt();
                numeros[fila][columna] = edad;
                //System.out.print(numeros[fila][columna] + "\t");
            }
        }
        // operacion lectura de una matriz
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(numeros[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}