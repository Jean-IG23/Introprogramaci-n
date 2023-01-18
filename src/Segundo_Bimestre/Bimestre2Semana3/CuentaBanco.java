package Bimestre2Semana3;

import java.util.Scanner;

public class CuentaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String socio []= {"Pablo","Ivan","Richar","Andy","David"};
        int cuenta[]={1234,4567,8910,1112,1314};
        int saldo[]={1200,5000,3000,2500,10000};
        boolean interruptor=true;
        int salida=2;
        while (interruptor){
            System.out.println("Ingrese su numero de cuenta");
            int cnum = sc.nextInt();
            for (int indi = 0; indi < cuenta.length; indi++) {
                if (cnum == cuenta[indi]) {
                    while (salida==2){
                        System.out.println("Ingrese 1 para realizar un deposito");
                        System.out.println("Ingrese 2 para realizar un retiro");
                        System.out.println("Ingrese 3 para consultar datos");
                        System.out.println("Ingrese 4 para salir del programa");
                        int opc= sc.nextInt();
                        switch (opc){
                            case 1:
                                System.out.println("Ingrese la cantidad del deposito");
                                int dep= sc.nextInt();
                                if (dep >= 0) {
                                    saldo[indi]=saldo[indi]+dep;
                                }else{
                                    System.out.println("cantidad invalida");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese la cantidad del retiro");
                                int ret= sc.nextInt();
                                if (ret <= saldo[indi] && ret>=0) {
                                    saldo[indi]= saldo[indi]-ret;
                                }else{
                                    System.out.println("Cantidad invalida");
                                }
                                break;
                            case 3:
                                System.out.println("Nombre: "+ socio[indi]);
                                System.out.println("Cuenta: "+ cuenta[indi]);
                                System.out.println("Saldo: "+ saldo[indi]);
                                break;
                            case 4:
                                salida=4;
                                interruptor=false;
                                break;
                        }
                    }
                }else if(indi==5){
                    System.out.println("Numero de cuenta invalido");
                }
            }

        }
    }
}
