package Estructuras_condicionales_o_selectivas;

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para presentar que nùmero es mayor");
        System.out.println("Ingrese el primer nùmero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo nùmero");
        int num2 = teclado.nextInt();
        if (num1>num2){
            System.out.println("El numero mayor es: " + num1);
        } if (num1<num2) {
                    System.out.println("El numero mayor es: " +num2);
                } if (num1 == num2) {
                    System.out.println("Los numeros ingresados son iguales");
                }
                System.out.println("ERROR");
        }
    }
