package Bimestre2Semana5;

import java.util.Scanner;

public class ClaseConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA PARA SUMAR 2 NUMEROS");
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        int resultado = sumar(num1, num2); // llamamos al etodo y recibimos el valor
        System.out.println("La suma es : " + resultado);
        //sumar_2_numeros(num1, num2);
        double promedio = obtener_promedio(resultado, 2);
        System.out.println("El promedio  de los numeros es: " + promedio);
    }
    /**
     * Este metodo realiza la suma de 2 nuermos enteros
     * @param n1
     * @param n2
     * @return resulrtado
     */
    public static int sumar(int  n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }

    public static void sumar_2_numeros(int n1, int n2){
        int resultado = n1 + n2;
        System.out.println("La suma de los numeros es: " + resultado);
    }
    public static double obtener_promedio(int suma_total, int cantidad_numeros){
        double promedio = (double)suma_total/(double)cantidad_numeros;
        return promedio;
    }
}
