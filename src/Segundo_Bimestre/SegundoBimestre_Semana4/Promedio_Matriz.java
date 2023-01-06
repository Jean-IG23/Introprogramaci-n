package SegundoBimestre_Semana4;

/**
 * programa para calcular el promedio de los elementos de una matriz dada
 */

public class Promedio_Matriz {
    public static void main(String[] args) {
        int numeros[][] = {{5,6},{2,7},{7,1},{3,4}};
        int suma_total = 0;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[0].length; columna++) {
                suma_total += numeros[fila][columna];
            }
        }
        double divisipn = numeros.length * numeros[0].length;
        double promedio = suma_total / divisipn;
        System.out.println("La suma es: " + suma_total);
        System.out.println("El promedio es: " + promedio);
    }
}
