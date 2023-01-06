package SegundoBimestre_Semana4;
/**
 * programa para generar la transpuesta de una matriz
 */
public class Matriz_Transpuesta {
    public static void main(String[] args) {
        char letras [][] = {{'a', 'b', 'c'},{'d', 'e', 'f'}};// dimension 2x3
        char transpuesta[][] = new char[letras[0].length][letras.length];
        for (int fila = 0; fila < letras[0].length; fila++) {
            for (int col = 0; col < letras.length; col++) {
                System.out.print(letras[col][fila] + "\t");
                transpuesta[fila][col] = letras[col][fila];
            }
            System.out.println();
        }
    }
}
