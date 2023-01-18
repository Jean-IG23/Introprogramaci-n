package Bimestre2Semana4;

public class SumaMatriz {
    public static void main(String[] args) {
        int a[][]={{2,4,6},{10,5,15},{8,8,4}};
        int b[][]={{8,4,5},{2,1,6},{8,9,10}};
        int c[][]=new int[3][3];
        for (int fila = 0; fila < a.length; fila++) {
            for (int col = 0; col < a[0].length; col++) {
                c[fila][col]=a[fila][col]+b[fila][col];
            }
        }
        for (int fila = 0; fila < a.length; fila++) {
            for (int columna = 0; columna < a[0].length; columna++) {
                System.out.print(c[fila][columna] + "\t");
            }
            System.out.println("\n");
        }
    }
}
