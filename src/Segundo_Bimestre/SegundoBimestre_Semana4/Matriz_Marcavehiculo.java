package SegundoBimestre_Semana4;

import java.util.Locale;
import java.util.Scanner;

/**
 * programa para crear una matriz con valores recibidos desde el teclado y luego poder realizar operaciones de
 * 1-Busqueda
 * 2-Modificacion
 * 3-Eliminacion
 * 4-Visualizacion
 * 5-Salida
 */

public class Matriz_Marcavehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int cols = sc.nextInt();
        sc.nextLine();
        String marcas[][] = new String[filas][cols];// se establece dimension de la matriz
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Ingrese la marca para la posicion ["+fila+"]["+col+"]");
                marcas[fila][col] = sc.nextLine().toLowerCase();
            }
        }
        boolean interruptor = false;
        while (!interruptor) {
            System.out.println("1-Realizar busqueda");
            System.out.println("2-Modificar");
            System.out.println("3-Eliminar");
            System.out.println("4-Visualizar matriz");
            System.out.println("5-Salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la operacion busqueda");
                    System.out.println("Que marca desea buscar");
                    String marca_buscada = sc.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_buscada)){
                                System.out.println("Si se econtro la marca " + marca_buscada +" en la posicion: ["+fila+"]["+col+"]");
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if (encontrado == false)
                        System.out.println("Marca no encontrada");
                    break;
                case 2:
                    System.out.println("Operacion de modificacion");
                    System.out.println("Ingrese que fila desea modificar");
                    int fila1 = sc.nextInt();
                    System.out.println("Ingrese que columna desea modificar");
                    int col1 = sc.nextInt();
                    System.out.println("Cual es la nueva marca a ingresar");
                    String nueva_marca = sc.nextLine();
                    marcas[fila1][col1] = nueva_marca;
                    break;
                case 3:
                    System.out.println("Operacion eliminar");
                    System.out.println("Que marca desea eliminar");
                    String marca_eliminada = sc.nextLine();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_eliminada)) {
                                marcas[fila][col] = "";
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Visualizar matriz");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.println(marcas[fila][col]);
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Salir");
                    interruptor = true;
                    break;
                default:
                        System.out.println("Intente nuevamente numero ingresado invalido");
            }
        }
    }
}
