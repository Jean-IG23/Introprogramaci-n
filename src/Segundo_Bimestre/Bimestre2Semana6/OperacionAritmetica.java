package Bimestre2Semana6;

import java.util.Scanner;

/**
 * Programa para crear metodos para realizar opraciones matematicas
 */
public class OperacionAritmetica {
    //Creacion de variales globales
    int n1;
    int n2;

    /**
     * Método para realizar la suma de 2 números enteros
     *
     * @param n1
     * @param n2
     * @return n1 + n2
     */
    public int sumar(int n1, int n2) {
        return (n1 + n2);
    }

    /**
     * Metodo para realizar la resta de 2 numeros enteros
     *
     * @param n1
     * @param n2
     * @return n1 - n2
     */
    public int restar(int n1, int n2) {
        return (n1 - n2);
    }

    /**
     * Metodo para multiplicar 2 numeros enteros
     *
     * @param n1
     * @param n2
     */
    public void multiplicar(int n1, int n2) {
        System.out.println("La multiplicacion es: " + (n1 * n2));
    }

    /**
     * metodo para divir 2 numeros enteros
     */
    public void dividir() {
        if (n2 != 0) {
            System.out.println("La division es: " + ((double) n1 / (double) n2));
        } else
            System.out.println("La division por cero no existe");
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        boolean i = true;
        while (i == true) {
            System.out.println("Digite 0 para salir");
            System.out.println("Digite 1 para sumar 2 numeros");
            System.out.println("Digite 2 para restar 2 numeros");
            System.out.println("Digite 3 para multiplicar 2 numeros");
            System.out.println("Digite 4 para dividir 2 numeros");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("SALIR");
                    i = false;
                    break;
                case 1:
                    System.out.println("La suma es: " + sumar(n1, n2));
                    break;
                case 2:
                    System.out.println("La resta es: " + restar(n1, n2));
                    break;
                case 3:
                    multiplicar(n1, n2);
                    break;
                case 4:
                    dividir();
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }
    }
    public static void main(String[] args) {
        OperacionAritmetica mivarable = new OperacionAritmetica();
        mivarable.ejecutar();
    }
}
