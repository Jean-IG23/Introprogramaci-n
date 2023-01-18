package Bimestre2Semana4;
/**
 * Programa para calcular el promedio de los elementos de una matriz dada
 */
public class PromedioMatriz {
    public static void main(String[] args) {
        int numeros [][]={{5,6},{2,7},{7,1},{3,4}};
        int suma_total = 0;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[0].length; columna++) {
                suma_total += numeros[fila][columna];
            }
        }
        int nro_elementos= numeros.length*numeros[0].length;
        double promedio = (double) suma_total/nro_elementos;
        System.out.println("suma: "+ suma_total);
        System.out.println("promedio: "+ promedio);
    }
}

