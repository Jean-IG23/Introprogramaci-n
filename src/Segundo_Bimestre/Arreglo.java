package SegundoBimestre.Segundo_Bimestre;

public class Arreglo {
    public static void main(String[] args) {
        // crecion de arreglos con valores predefinidos
        String vector1[] = {"UTPL", "UNL", "ESPOL", "UCUENCA", "USFQ", "UIDE"};
        int tam = vector1.length; // ESTO SIRVE PARA OBTENER EL TAMAÑO DE LA FILA
        System.out.println("Tamaño del arreglo es igual a: " + tam);
        for (int indice = 0; indice < tam; indice++) {
            System.out.print(vector1[indice] + "\t");
            System.out.println("\n");
        }
        //crecion de un arreglo de tipo entero
        int notas[] = {7, 8, 9, 10, 11};
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.println(notas[indice]);
        }
        //creacion de un arreglo de tipo char
        char letra[] = {'a', 'e', 'i', 'o', 'u'};
        for (int indice = 0; indice < letra.length; indice++) {
        System.out.println(letra[indice]);
        }
        boolean valor[] = {true,false,false,true,false};
        for (int indice = 0; indice < valor.length ; indice++) {
            System.out.println(valor[indice]);
        }
        double numeros [] = {1.0, 2.5, 3.1,};
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);

        }
    }
}
