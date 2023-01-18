package Bimestre2Semana2;

import java.util.Scanner;

/**
 * Programa que solicite el nombre de n marcas de vehiculos y las almacene en un arreglo.
 * Finalmente el programa debe mostrar el nombre de las marcas alamcenadas en el arreglo
 */
public class ArregloMarca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marcas[];
        System.out.println("¿Cuantas marcas de vehiculo va a ingresar? ");
        int n= sc.nextInt();// cuando se lee un valor desde el teclado y despues se necesita leer otro valor se coloca la linea 15
        sc.nextLine();
        marcas= new String [n];//creamos el arreglo con n elementos
        //operacion escritura de un arreglo
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println("Ingrese el nombre de la marca "+(indice + 1)+" :");
            String marca = sc.nextLine();
            marcas[indice]=marca;
        }
        System.out.println("Lista de marcas ingresadas");
        //operacion lectura de un arreglo
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.print(marcas[indice]+ "\t");
        }
        System.out.println("\n");
        //operacion de busqueda
        System.out.println("¿Que nombre de marca desea buscar?");
        String marca_busqueda= sc.nextLine().toUpperCase();//siempre convertir a mayusculas en string poniendo la linea 31 .toUpperCase()
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals(marcas[indice].toUpperCase())) { //cuando se quiere comparar dos datos y son string usar la linea 33 y adicionalmente usar el to uppercase indicado en la linea 31
                System.out.println("Marca Encontrada");
                System.out.println("Se encuentra en el indice " + indice);
                break;
            }
        }
    }
}
