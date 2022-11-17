import java.util.Scanner;

public class circunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi = 3.1416;
        System.out.println("Ingrese el valor de la radio: ");
        double radio = teclado.nextDouble();
        double elevado = Math.pow(radio, 2);
        System.out.println("El area de la circunferecncia es: " + pi * elevado);
    }
}
