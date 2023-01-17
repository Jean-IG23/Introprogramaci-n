package Bimestre2Semana6;

import java.util.Scanner;

/**
 * PROGRAMA PARA VERIFICAR A TRAVEZ DE METODOS SI UN NUMEROS ES PRIMO O NO
 */
public class Verificacion {
    int num_a_verificar;
    public boolean vereficar_primo(int num_a_verificar){
        int contador_divisores = 0;
        for (int contador = 1; contador <= num_a_verificar ; contador++) {
            if (num_a_verificar % contador == 0)//detectamos un nuevo divisor
                contador_divisores++;
        }
        if (contador_divisores == 2)//verificamos si es primo
            return true;
        else
            return false;
    }
    public boolean verificar_par_impar (int num_a_verificar){
        if (num_a_verificar%2==0)
            return true;
        else
            return false;

    }
    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while(interruptor){
            System.out.println("Digíte 1 para saber si es primo ");
            System.out.println("Digíte 2 para saber si es par o impar: ");
            System.out.println("Digite 0 para Salir");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 0:
                    interruptor = false;
                    System.out.println("SALIR");
                    break;
                case 1:
                    ingresar_numeros();
                    if (vereficar_primo(num_a_verificar)==true)
                        System.out.println("Es primo");
                    else
                        System.out.println("No es primo");
                    break;
                case 2:
                    ingresar_numeros();
                    if (verificar_par_impar(num_a_verificar)==true)
                        System.out.println("Es par");
                    else
                        System.out.println("NO es par");
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
            }
        }
    }
    public void ingresar_numeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        num_a_verificar = teclado.nextInt();
    }
    public static void main(String[] args) {
        Verificacion mivariable = new Verificacion();
        mivariable.ejecutar();

    }
}
