package Bimestre2Semana5;

import java.util.Scanner;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        saludar_con_nombre(nombre);
    }
    public static void saludar(){
        System.out.println("BIENVENIDO A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java");
    }
    public static void saludar_con_nombre(String nombre){
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java");
    }
}
