package SegundoBimestre.Segundo_Bimestre;

public class Arreglos2 {
    public static void main(String[] args) {
        //creacion de arreglos sin valor predefinidos
        String universidades [] = new String[5];
        System.out.println("Arreglo universidades");
        for (int indice = 0; indice < universidades.length ; indice++) {
            System.out.print(universidades[indice] + "\t");
        }
        int notas [] = new int[4];
        System.out.println("Arreglo de notas");
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.print(notas[indice] + "\t");
        }
        boolean valores [] = new boolean[10];
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.print(valores[indice] + "\t");
        }
        double numeros []= new double[5];
        for (int indice = 0; indice < numeros.length ; indice++) {
            System.out.println(numeros[indice]);
        }
        //creacion de un arreglo cuando en unicio no conocemos su tamaño
        String nombres [];
        nombres = new String[10];
    }
}
