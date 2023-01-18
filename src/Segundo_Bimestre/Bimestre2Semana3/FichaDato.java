package Bimestre2Semana3;

import java.util.Scanner;

public class FichaDato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean interruptor=true;
        int indice=0;
        String nombre[]= new String[1000];
        int edad[]= new int[1000];
        String universidad [] = new String[1000];
        while (interruptor){
            System.out.println("INGRESE LOS DATOS SOLICITADOS");
            System.out.println("Ingrese su nombre");
            nombre [indice] = sc.nextLine();
            System.out.println("Ingrese su edad");
            edad[indice]= sc.nextInt();
            System.out.println("Ingrese las iniciales de su universidad");
            sc.nextLine();universidad[indice]= sc.nextLine();
            indice++;
            System.out.println("Desea seguir ingresando datos?");
            String resp= sc.nextLine().toUpperCase();
            if (resp.equals("no")){
                interruptor=false;
            }
        }
        System.out.println("Ordenar arreglo por edad");
        for (int ind = 1; ind <= edad.length-1 ; ind++) {
            for (int elemento = 0; elemento <= edad.length-2; elemento++) {
                //verificar si realizamos un intercambio
                if (edad[elemento] > edad[elemento+1]) {
                    int aux = edad[elemento];
                    edad[elemento]=edad[elemento+1];
                    edad[elemento+1]=aux;
                    String aux_n = nombre[elemento];
                    nombre[elemento]=nombre[elemento+1];
                    nombre[elemento+1]=aux_n;
                    String aux_u = universidad[elemento];
                    universidad[elemento]=universidad[elemento+1];
                    universidad[elemento+1]=aux_u;
                }
            }
        }
        //presentar los datos de los estudiantes
        for (int pos = 0; pos < nombre.length; pos++) {
            if (nombre[pos] != null){
                System.out.println("Nombres: "+ nombre[pos]);
                System.out.println("Edad: "+ edad[pos]);
                System.out.println("Universidad: "+ universidad[pos]);
            }
        }
    }
}
