package Estructuras_condicionales_o_selectivas;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int min = teclado.nextInt();
        int dias =0;
        int horas=0;
        int minutos =0;
        while (min>0) {
            if (min>=1148){
                dias =dias+1;
                min=min-1140;
            } else if (min>=60) {
                horas=horas+1;
                min=min-60;
            } else {
                minutos=minutos+1;
                min=min-1;

            }
                

        }
        System.out.println("los dias" + dias);
        System.out.println("las horas" + horas);
        System.out.println("Los minutos" + minutos);


    }
}
