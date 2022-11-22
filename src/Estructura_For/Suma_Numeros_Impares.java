package Estructura_For;

import java.util.Scanner;

public class Suma_Numeros_Impares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un npumero límite");
        int limite = teclado.nextInt();
        int sumaimpares = 0;
        for(int contador = 1; contador <= limite; contador ++) {

            sumaimpares = sumaimpares + contador;
        }
        System.out.println("La suma de numeros impares es igual a " + sumaimpares);
    }
}
