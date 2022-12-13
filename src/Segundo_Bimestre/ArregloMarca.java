package SegundoBimestre.Segundo_Bimestre;

import java.util.Scanner;

/**
 * Programa que solicite el nombre de n marcas de vehiculos y almacene en un arreglo,  finalmente el programa debe mostrar  el nombre de las marcas almacenas en el arreglo
 */
public class ArregloMarca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String marcas [];
        System.out.println("cuantas marcas desea ingresar ");
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas = new String[n];
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Ingrese el nombre de las marcas " + (indice + 1));
            String nombres = teclado.nextLine().toUpperCase();
            marcas [indice] = nombres ;
        }
        for (int indice = 0; indice < n; indice++) {
            System.out.print(marcas[indice] +"\t");
        }
        //Operacion de busqueda
        System.out.println("Que marca quiere buscar");
        String marca_busqueda = teclado.nextLine().toUpperCase();
        System.out.println("marca buscada"+ marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals(marcas[indice].toUpperCase() ) ) {
            System.out.println("Marca encontrada, se encuentra en el indice " + indice);
            break;
        }else{
                System.out.println("No se encuentra esta marca ingresada");
            }
        }
    }
}
