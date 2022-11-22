package Estructura_For;

import java.util.Scanner;

public class Tabla_Multiplicación {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = teclado.nextInt();
        boolean interruptor = true;
        for (int contador = 10; contador >= 0 && interruptor==true; contador--) {
            int multiplicacion = numero * contador;
            System.out.println(numero +" * "+ contador + " = " + multiplicacion );
            if(contador == 5)
                interruptor = false;
        }

    }
}
