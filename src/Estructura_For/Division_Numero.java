package Estructura_For;

import java.util.Scanner;

public class Division_Numero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = teclado.nextInt();
        for (int contador = 1; contador <= n; contador++ ){
            if (n % contador ==0)
            System.out.println("Los divisores son: " + contador);
        }
    }
}
