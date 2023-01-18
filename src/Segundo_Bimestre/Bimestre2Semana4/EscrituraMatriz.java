package Bimestre2Semana4;

import java.util.Scanner;

public class EscrituraMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[][]= new int[3][2];
        int filas2 = numeros.length;
        int columnas2 = numeros[0].length;
        numeros[1][1]= 5;
        numeros[2][0]=9;
        System.out.println("Ingrese una edad");
        //operacion de escritura de una matriz
        for (int fila = 0; fila < filas2; fila++) {
            System.out.println("fila: "+ fila);
            for (int columna = 0; columna < columnas2; columna++) {
                System.out.println("Ingrese una edad para numeros["+fila+"]["+columna+"]");
                numeros[fila][columna]= sc.nextInt();
            }
        }
        //operacion lectura de una matriz
        for (int fila = 0; fila < filas2; fila++) {
            for (int columna = 0; columna < columnas2; columna++) {
                System.out.print(numeros[fila][columna]+ "\t");
            }
            System.out.println("\n");
        }
    }
}
