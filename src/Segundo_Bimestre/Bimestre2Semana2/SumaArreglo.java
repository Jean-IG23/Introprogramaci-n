package Bimestre2Semana2;

import java.util.Scanner;

public class SumaArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a colocar: ");
        int numeros = sc.nextInt();
        int arreglos1[] = new int[numeros];
        int arreglos2[] = new int[numeros];
        System.out.println("Ingrese la pimera cantidad de numeros");
        for (int indice = 0; indice < numeros; indice++) {
            int num1 = sc.nextInt();
            arreglos1[indice] = num1;
        }
        System.out.println("Ingresar la segunda cantidad de numeros");
        for (int indice = 0; indice < numeros; indice++) {
            int num2 = sc.nextInt();
            arreglos2[indice] = num2;
        }
        int sumat[] = new int[numeros];
        for (int indice = 0; indice < numeros; indice++) {
            sumat[indice] = arreglos1[indice] + arreglos2[indice];
        }
        for (int indice = 0; indice < numeros; indice++) {
            System.out.println(sumat[indice]);
        }
    }
}
