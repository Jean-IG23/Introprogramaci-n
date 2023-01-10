package Bimestre2Semana5;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA OBTENER EL ÁREA DE FIGURAS GEOMÉTRICAS");
        System.out.println("DIGITE 1 PARA OBTENER EL ÁREA DE UNA CIRCUNFERENCIA");
        System.out.println("DIGITE 2 PARA OBTENER EL ÁREA DE UN CUADRADO");
        System.out.println("DIGITE 3 PARA OBTENER EL ÁREA DE UN CILINDRO");
        Scanner teclado=new Scanner(System.in);
        int opcion = teclado.nextInt();
        seleccionar_figura(opcion);
    }
    public static void seleccionar_figura (int opcion){
        Scanner teclado=new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor del radio: ");
                double radio= teclado.nextInt();
                double area=obtener_area_circunferencia(radio);
                System.out.println("El área es: "+area);
                break;
        }
    }

    /**
     * Método para obtener el área de una circunferencia
     * @param radio
     * @return
     */
    public double obtener_area_circunferencia (double radio){
        double area= Math.PI * Math.pow(radio,2);
        return area;

    }

    /**
     * Método para obtener el área de un cuadrado
     * @param lado
     * @return
     */
    public double Obtener_area_cuadrado(double lado){
        double area =lado*lado;
        return area;
    }

    /**
     * Método para obtener el área de un cilindro
     * @return
     */
    public void Obtener_area_cilindro(){
    }
}
