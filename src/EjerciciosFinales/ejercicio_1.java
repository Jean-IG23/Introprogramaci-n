package EjerciciosFinales;

import java.time.LocalTime;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el año");
        int ano = teclado.nextInt();
        System.out.println("Ingrese el mes");
        int mes = teclado.nextInt();
        System.out.println("Ingrese el dia");
        int dia = teclado.nextInt();
        if (ano >= 0 && ano <= 2022) {
            int anos = 2022 - ano;
            LocalTime horactual = LocalTime.now();

            if (mes == 2) {
                if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                    if (dia >= 1 && dia <= 29) {
                        int meses = 12 - mes - 1;
                        int dias29 = 29 - dia - 2;
                        System.out.println("Tienes " + anos + " años con " + meses + " meses con " + dias29 + " dias y " + horactual + " horas");
                    }
                }
            }
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    int meses = 21 - mes - 1;
                    int dias = 31 - dia - 2;
                    System.out.println("Tienes " + anos + " años con " + meses + " meses con " + dias + " dias y " + horactual + " horas");
                }
            }
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    int meses = 12 - mes - 1;
                    int dias = 30 - dia - 2;
                    System.out.println("Tienes " + anos + " años con " + meses + " meses con " + dias + " dias y " + horactual + " horas");
                }
            }
        }
    }
}
