package Bimestre2Semana1;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        int interruptor = 1;
        while (interruptor == 1) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("opción 1: Convertir de MB a KB ");
            System.out.println("Opción 2: Convertir de KB a MB ");
            System.out.println("Opción 3: Convertir de MB a Bits");
            System.out.println("Opción 4: SALIR");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escogió convertir de MB a KB");
                    System.out.println("Ingrese un valor de los MB ");
                    double n = teclado.nextDouble();
                    double di = n * 1024;
                    System.out.println("Los resultado es: " + di);
                    break;
                case 2:
                    System.out.println("Escogió convertir de de KB a MB");
                    System.out.println("Ingrese el valor de los KB");
                    double kb = teclado.nextDouble();
                    double mul = kb * 1024;
                    System.out.println("El resultado es: " + mul);
                    break;
                case 3 :
                    System.out.println("Escogió convertir un valor de MB a bits");
                    System.out.println("Ingrese el valor de los MB");
                    double mb = teclado.nextDouble();
                            double multi = mb * 1024*1024*8;
                    System.out.println("El valor de los bits es: " + multi);
                    break;
                case 4:
                    System.out.println("GRACIAS POR PREFERIRNOS");
                    interruptor = 0;
                    break;
                default:
                    System.out.println("Opción incorrecta, seleccione nuevamente Por Favor");
            }
        }
    }
}