package Bimestre2Semana2;

public class Arreglo {
    public static void main(String[] args) {
        //creacion de arreglos predefinidos
        String universidades []= {"Utpl", "unl", "espol", "ucuenca", "usfg"};
        int tam = universidades.length;
        System.out.println("Tamaño del arreglo es = " + tam);
        for (int indice = 0; indice < tam; indice++) {
            System.out.print(universidades[indice]+ "   ");
        }


        System.out.println("\n");
        //creacion de un arreglo de tipo entero
        int notas[]= {7,8,5,4,10};
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.print(notas[indice]+"  ");
        }


        System.out.println("\n");
        //creacion de un arreglo de tipo char
        char vocales[] = {'a','e','i','o','u'};
        for (int indice = 0; indice < vocales.length; indice++) {
            System.out.print(vocales[indice]+"  ");
        }


        System.out.println("\n");
        //creacion de un arreglo de tipo booleano
        boolean valores[]={true, false, false, true, true};
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.print(valores[indice]+ "  ");
        }


        System.out.println("\n");
        //creacion de un arreglo de tipo decimal
        double numeros[]={1.0, 2.5, 3.1};
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print(numeros[indice]+"  ");
        }
    }
}
