package Estructuras_condicionales_o_selectivas;

import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la tolerancia");
        double tol = teclado.nextDouble();
        if (tol<0.1){
        System.out.println("Exploracion espacial");
        } else if ((tol >= 0.1)&&(tol < 1)){
            System.out.println("Grado militar");
    }else if ((tol >= 1)&&(tol <= 10)){
            System.out.println("Grado comercial");
        } else if (tol > 10){
            System.out.println("Grado jefe");
        }
    }
}

