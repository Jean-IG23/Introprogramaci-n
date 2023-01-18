package Bimestre2Semana4;

public class Matriz {
    public static void main(String[] args) {
        //int matriz[][]=new int[2][3];
        //creacion de una matriz con valores predefinidos
        String univ[][]={{"utpl","ucuenca","espol"},{"unl","uazuay","uide"},{"unach","usfq","salesiana"}};
        //System.out.println("filas "+univ.length);
        //System.out.println("columnas "+univ[0].length);
        int filas2 = univ.length;
        int columnas2 = univ[0].length;
        for (int fila = 0; fila < filas2; fila++) {
            for (int columna = 0; columna < columnas2; columna++) {
                System.out.print(univ[fila][columna]+ "\t");
            }
            System.out.println();
        }
    }
}
