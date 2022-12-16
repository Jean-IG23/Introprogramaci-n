package SegundoBimestre_Semana2;

public class ArregloCuadrado {
    public static void main(String[] args) {
        int numeros [] = {2, 3, 5, 7, 9,11, 13};
        int cuadrado [] = new int [numeros.length];
        for (int indice = 0; indice < numeros.length; indice++){
            cuadrado[indice] = numeros[indice] * numeros[indice];
        }
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(cuadrado[indice]);
        }
    }
}
