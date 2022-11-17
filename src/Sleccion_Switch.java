import java.util.Scanner;

public class Sleccion_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Lunes");
                break;  //salta al final de la estructura
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
