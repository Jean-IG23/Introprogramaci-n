package semaman3;

import java.util.Scanner;

public class FichaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombres[] = new String[100];
        int edad[] = new int[100];
        String uni[] = new String[100];
        boolean interruptor = true;
        int indice = 0;
        while(interruptor) {
            System.out.println("INGRESE DATOS DEL ESTUDIANTE");
            System.out.println("Ingrese nombres");
            nombres[indice] = sc.nextLine();
            System.out.println("Ingrese la edad");
            edad[indice] = sc.nextInt();
            sc.nextLine();//para leer un enter despuesde ingresar edad
            System.out.println("Ingrese las iniciales de la universidad donde estudia");
            uni[indice] = sc.nextLine();
            indice++;
            System.out.println("Dese ingresar un buevo estudiante si/no");
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("no"))
                interruptor = false;
        }
        System.out.println("ORDENAR ARREGLO POR EDAD");
        for (int i = 1; i < edad.length; i++) {
            for (int elemento = 0; elemento <= edad.length - 2; elemento++) {
                // veroiificar si realizamos inbtercambip
                if (edad[elemento] > edad[elemento + 1]) {
                    int aux = edad[elemento];
                    edad[elemento] = edad[elemento + 1];
                    edad[elemento + 1] = aux;
                    //procesao de intercanbio en arregki nimbres
                    String aux_n = nombres[elemento];
                    nombres[elemento] = nombres[elemento + 1];
                    nombres[elemento + 1] = aux_n;
                    //proceso de ntercambio de uni
                    String aux_u = uni[elemento];
                    uni[elemento] = uni[elemento + 1];
                    uni[elemento + 1] = aux_u;
                }
            }
        }
        //presentar datos de estudiantes
        for (int pos = 0; pos <= nombres.length; pos++) {
            if (nombres[pos] != null) {
                System.out.println(nombres[pos]);
                System.out.println(edad[pos]);
                System.out.println(uni[pos]);
            }
        }
    }
}