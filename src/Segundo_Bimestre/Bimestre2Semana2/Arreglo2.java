package Bimestre2Semana2;

public class Arreglo2 {
    public static void main(String[] args) {
        //creacion de arreglos, sin valores predefinidos
        String universidades[] = new String[5];
        System.out.println("arreglo universidades: ");
        for (int indice = 0; indice < universidades.length; indice++) {
            System.out.print(universidades[indice]+ "\t");
        }
        int notas [] = new int[4];
        System.out.println("\n");
        System.out.println("arreglo notas: ");
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.print(notas[indice]+ "\t");
        }
        System.out.println("\n");
        System.out.println("arreglo valores");
        boolean valores []= new boolean[10];
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.print(valores[indice]+ "\t");
        }
        //creacion de un arreglo cuando en un inicio no conocemos su tamaño
        String nombres[]; //creando un arreglo nombres


        nombres = new String[10];//despues de saber la cantidad de datos colocar la cantidad donde esta el 10
    }
}
