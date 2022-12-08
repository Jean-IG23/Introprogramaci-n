package Bimestre2Semana1;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un nùmero");
        int n = teclado.nextInt();
        int suma = 0;
        int contador= 1;
        while (contador <= n) {
            if (n % contador == 0) {
                int division = n / contador;
                suma = suma + division;
            }
            contador = contador + 1;
        }
        suma = suma - n;
        if (suma > n ) {
            System.out.println("El número ingresado si es un número abundante " + suma);
        } else {
            System.out.println("El número ingresado no es un número abundante " + suma);
        }
    }
}
