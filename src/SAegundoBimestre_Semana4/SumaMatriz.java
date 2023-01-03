package SAegundoBimestre_Semana4;

public class SumaMatriz {
    public static void main(String[] args) {
        int matriz_a[][] = {
                {1,2,3},
                {4,0,7},
                {1,6,5}
        };
        int matriz_b[][] = {
                {0,1,3},
                {9,3,2},
                {1,9,5}
        };
        int filas = matriz_a.length;
        int columnas = matriz_a[0].length;
        int matriz_c[][] = new int[filas][columnas];
        // suma de matriz a+ b es = c
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz_c[fila][columna] = matriz_a[fila][columna] + matriz_b[fila][columna];
            }
        }
        //mostrar los elementos de la matriz c
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(matriz_c[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}
