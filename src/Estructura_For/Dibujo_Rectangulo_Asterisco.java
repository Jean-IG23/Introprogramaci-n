package Estructura_For;

import java.util.Scanner;

public class Dibujo_Rectangulo_Asterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        //System.out.println("Ingrese el numero de columnas: ");
        //int columnas = teclado.nextInt();
        for (int fila = 1; fila <= filas; fila++){// controlamos número de filas
            String filaasterisco = "";
            for (int columna = 1; columna <= fila; columna++){//numero de columnas controladas
                filaasterisco = filaasterisco + "*";
            }
            System.out.println(filaasterisco);
        }
    }
}
