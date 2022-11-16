package Estructuras_condicionales_o_selectivas;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar 3 numeros enteros");
        System.out.println("Ingrese el primer valor");
        int num1 = teclado.nextInt();
        System.out.println("Ingresar el segundo valor");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer valor");
        int num3 = teclado.nextInt();
        int resultado = (num1^2)+(num2^2);
        int num4 = (num3^2);
        if (resultado == num4) {
        System.out.println("Los valores ingresados son nùmeros de lados de triangulo rectangulos");
    } else {
        System.out.println("Los valores ingresados no son nùmeros de lados de tringulo rectangulo");

    }
}
}
