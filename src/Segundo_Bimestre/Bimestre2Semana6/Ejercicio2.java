import java.util.Scanner;

public class Ejercicio2 {
    double hipotenusa;
    double s_ab;
    public void hip (double a, double b){
        s_ab=(a*a)+(b*b);
        hipotenusa=hipotenusa*hipotenusa;
    }
    public void Indentificar(){
        if (hipotenusa == s_ab){
            System.out.println("Es un triangulo rectangulo");
        }else if(hipotenusa<s_ab){
            System.out.println("Es un triangulo acutangulo");
        } else if (hipotenusa>s_ab) {
            System.out.println("Es un triangulo obtusangulo");
        }
    }
    public void resultado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer cateto");
        double c1 = sc.nextDouble();
        System.out.println("Ingrese el segundo cateto");
        double c2 = sc.nextDouble();
        System.out.println("Ingrese la hipotenusa");
        hipotenusa = sc.nextDouble();
        hip(c1,c2);
        Indentificar();
    }
    public static void main(String[] args) {
        Ejercicio2 var = new Ejercicio2();
        var.resultado();
    }
}
