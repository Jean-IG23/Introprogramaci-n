import java.util.Scanner;

public class ConndicionalAnidada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORIA DE EDAD");
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        if(edad >0 && edad <= 150){
            if (edad > 0 && edad < 18){  //solo hay como poner condicionales
                System.out.println("Eres menor de edad");
            } else if (edad >= 18 && edad <= 65) {
                System.out.println("Eres mayor de edad");
            } else if (edad > 65 && edad <= 100) {
                System.out.println("Eres de la tercera edad");
            } else if (edad > 100 && edad <= 150) {
                System.out.println("Eres una persona sabia");
        }else
                System.out.println("Edad invalida");}
    }
}