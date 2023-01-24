package Bimestre2Semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa para relaizar la divisón entre 2 números
 */

public class ManejoExcepcion {
    double n1;
    double n2;

    public static void main(String[] args) {
        ManejoExcepcion mivar = new ManejoExcepcion();
        mivar.ejecutar();
    }
    public void ejecutar() {
        ingresar_datos();
        System.out.println("Resultado = " + dividir() );
    }
    public void ingresar_datos() {
        // el codigo try ayuda a captaar siesq ocurre alguna excepción
        try { // este codigo tiene la posibilidad de presentar una exepcin
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el numerador");
            n1 = sc.nextDouble();
            System.out.println("Ingrese el denominador");
            n2 = sc.nextDouble();
        } catch (Exception error_de_sc){
            System.out.println("Manejo de la excepcion con catch");
            System.out.println(error_de_sc.getMessage());
        }
    }
    public double dividir() {
        double resultado = 0;
        try {
            //posiblemente puede ocurrir una excepción
            resultado = n1 / n2;
        }catch (ArithmeticException error) {
            // se ejecuta solo si hay una excepción
            System.out.println("Error de topo aritmetico");
            System.out.println(error.getMessage());
        }finally {
            // estre codigo se ejecuta exista o no excepción
            System.out.println("ERROR");
        }
        return resultado;
    }
}
