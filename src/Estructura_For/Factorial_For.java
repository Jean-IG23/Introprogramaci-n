package Estructura_For;

import java.util.Scanner;

public class Factorial_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int n = teclado.nextInt();
       int factorial = 1;
        for (int contador = 1; contador <= n; contador++ ){
           factorial = n * contador;

        System.out.println("El resultado es " + factorial);
        }
    }
}
