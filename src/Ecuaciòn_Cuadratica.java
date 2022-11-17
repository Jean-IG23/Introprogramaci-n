import java.util.Scanner;

public class Ecuaciòn_Cuadratica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para resolver una ecuación cuadrática aplicando la fórmula general");
        System.out.println("Ingrese el valor de a: ");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        double b = teclado.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        double c = teclado.nextDouble();
        double xp = (-b + Math.sqrt((b*b)-(4*a*c)) )/2*a;
        double xn = (-b - Math.sqrt((b*b)-(4*a*c)) )/2*a;
        System.out.println("El resultado de la ecuacion cuadratica es: ");
        System.out.println("x1: "+ xp);
        System.out.println("x2: "+ xn);

    }
}

