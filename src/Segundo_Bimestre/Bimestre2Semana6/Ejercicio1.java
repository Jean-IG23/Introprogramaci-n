import java.util.Scanner;

public class Ejercicio1 {
    static int saldo;
    public void retirar(int cantidad_retirar){
        if (cantidad_retirar>0 && cantidad_retirar<=saldo){
            saldo= saldo-cantidad_retirar;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public   void depositar(int deposito){
        if (deposito>0){
            saldo= saldo+deposito;
        }else{
            System.out.println("Cantidad invalida");
        }
    }
    public void ejecutar(){
        boolean interruptor= true;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese su saldo");
        saldo= sc.nextInt();
        while (interruptor){
            System.out.println("Ingrese 0 para salir");
            System.out.println("Ingrese 1 para consultar Saldo actual");
            System.out.println("Ingrese 2 para realizar un retiro");
            System.out.println("Ingrese 3 para realizar un deposito");
            int opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Su saldo actual es: "+ saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar");
                    int ret= sc.nextInt();
                    retirar(ret);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de deposito");
                    int dep = sc.nextInt();
                    depositar(dep);
                    break;
                case 0:
                    System.out.println("Gracias por su visita");
                    interruptor= false;
            }
        }
    }
    public static void main(String[] args) {
        Ejercicio1 abc = new Ejercicio1();
        abc.ejecutar();
    }
}
