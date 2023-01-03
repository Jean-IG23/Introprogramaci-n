package SAegundoBimestre_Semana4;

import jdk.swing.interop.SwingInterOpUtils;

public class Matriz {
    public static void main(String[] args) {
        //int matriz [][] = new int[2][3];
        // creacion de una matriz con valores predefinidos
        String univ[][] = {
                {"UTPL", "UCUENCA", "ESPOL"},
                {"UNL", "AZUAY", "UIDE"}
        };
        //System.out.print("dimension de+ la matriz: ");
        //System.out.print(" Filas = " + univ.length);
        //System.out.println(", columnas = " + univ[0].length);
        int filas = univ.length;
        int columnas = univ[1].length;
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(univ[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}
