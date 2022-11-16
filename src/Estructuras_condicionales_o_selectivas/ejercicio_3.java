package Estructuras_condicionales_o_selectivas;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int valor1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2 = teclado.nextInt();
        if (valor1%valor2==0) {
            System.out.println("El primer numero es divisible para el segundo numero");
        }else{
            System.out.println("El segundo numero es divisible para el primer numero");
        }


    }
}
