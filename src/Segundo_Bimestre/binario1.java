package Personal;

import java.util.Scanner;

public class binario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿ Cuantos numeros va a ingresar ?");
        int n = sc.nextInt();
        double multiplicacion = 0;
        double suma = 0;
        int elevado = -1;
        double resultado = 0;
        int arreglo[] = new int [n];
        System.out.println("Ingrese los numero binarios uno por uno");
        for (int indice = 0; indice < n; indice++) {
            arreglo[indice] = sc.nextInt();
            if (arreglo[indice] != 1 && arreglo[indice] != 0) {
                System.out.println("El numero ingresado es invalido");
                indice = indice + n;
            }
        }
        for (int indice = n - 1; indice >= 0 ; indice--) {
            elevado = elevado + 1;
            multiplicacion = Math.pow(2, elevado);
            suma = arreglo[indice] * multiplicacion;
            resultado = resultado + suma;
        }
        System.out.println("conversión: " + resultado);
    }
}
