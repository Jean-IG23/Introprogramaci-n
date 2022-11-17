import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        double valor1 = teclado.nextDouble();
        double elevado = Math.pow(valor1, 2);
        System.out.println("Ingresar el segundo valor: ");
        double valor2 = teclado.nextDouble();
        double evevad = Math.pow(valor2, 2);
        double numero = (elevado + evevad);
        int x = 2;
        double raiz = Math.sqrt(numero);
        System.out.println("El valor de la Hipotenusa es: "+ raiz );

    }
}
