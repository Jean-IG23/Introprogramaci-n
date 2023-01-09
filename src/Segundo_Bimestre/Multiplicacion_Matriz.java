package Bimestre2Semana1;

import java.util.Scanner;

public class Multiplicacion_Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las filas de la primera matriz");
        int m1 = sc.nextInt();
        System.out.println("Ingrese las columnas de la primera matriz");
        int c1= sc.nextInt();
        System.out.println("Ingrese las filas de la segunda matriz");
        int m2 = sc.nextInt();
        System.out.println("Ingrese las columnas de la segunda matriz");
        int c2= sc.nextInt();
        int matriz1 [][]= new int[m1][c1];
        int matriz2[][]= new int[m2][c2];
        int matriz3[][]=new int[matriz1.length][matriz2[0].length];
        if (m1==c2 && c1==m2){
            System.out.println("Ingrese los datos de la primera matriz");
            for (int indice1 = 0; indice1 < matriz1.length; indice1++) {
                for (int indice2 = 0; indice2 < matriz1[0].length; indice2++) {
                    matriz1[indice1][indice2]= sc.nextInt();
                }
            }
            System.out.println("Ingrese los datos de la segunda matriz");
            for (int indice1 = 0; indice1 < matriz2.length; indice1++) {
                for (int indice2 = 0; indice2 < matriz2[0].length; indice2++) {
                    matriz2[indice1][indice2]= sc.nextInt();
                }
            }
            System.out.println("Primer Matriz");
            for (int indice = 0; indice < matriz1.length; indice++) {
                for (int indice2 = 0; indice2 < matriz1[0].length; indice2++) {
                    System.out.print(matriz1[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
            System.out.println("Segunda Matriz");
            System.out.println("\t");
            for (int indice = 0; indice < matriz2.length; indice++) {
                for (int indice2 = 0; indice2 < matriz2[0].length; indice2++) {
                    System.out.print(matriz2[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
            for (int fila = 0; fila < matriz1.length; fila++) {
                for (int columna = 0; columna < matriz2[0].length; columna++) {
                    for (int mov = 0; mov < matriz1[0].length; mov++) {
                        matriz3[fila][columna] =matriz3[fila][columna]+(matriz1[fila][mov] * matriz2[mov][columna]);
                    }
                }
            }
            System.out.println("\t");
            System.out.println("Resultado de la multiplicación de las 2 matrices");
            for (int indice = 0; indice < matriz3.length; indice++) {
                for (int indice2 = 0; indice2 < matriz3[0].length; indice2++) {
                    System.out.print(matriz3[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
        }else{
            System.out.println("Los datos ingresados son erroneos");
        }
    }

}
