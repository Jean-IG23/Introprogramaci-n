package Bimestre2Semana4;

import java.util.Scanner;

/**
 * Programa para crear una matriz con valores recibidos desde el teclado, y luego poder realizar
 * repetitivamente operaciones de:
 * 1. Busqueda
 * 2. Modificacion
 * 3. Eliminacion
 * 4. Visualizacion
 * 5. Salida
 */

public class MatrizMarcaVehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int cols = sc.nextInt();
        sc.nextLine();
        String marcas[][]= new String[filas][cols];
        //llenado de la matriz: Operacion Escritura:
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Ingrese valor para posicion["+fila+"]["+col+"]");
                marcas[fila][col]= sc.nextLine().toLowerCase();

            }
        }
        boolean salir= false;
        while (!salir){
            System.out.println("Digite 1 para realizar una busqueda: ");
            System.out.println("Digite 2 para modificar un valor especifico: ");
            System.out.println("Digite 3 para Eliminar un valor: ");
            System.out.println("Digite 4 para visualizar la matriz: ");
            System.out.println("Digite 5 para salir: ");
            int opc = sc.nextInt();
            sc.nextLine();
            boolean encontrado= false;
            switch (opc){
                case 1:
                    System.out.println("HAS SELECCIONADO LA OPERACION BUSQUEDA");
                    System.out.println("¿Que marca busca: ?");
                    String marca_buscada = sc.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_buscada)){
                                System.out.println("Si se encontro la marca: "+ marca_buscada);
                                System.out.println("En la posicion: ["+fila+"]["+col+"]");
                                encontrado=true;
                                break;
                            }
                        }
                    }
                    if (encontrado==false){
                        System.out.println("MARCA NO ENCONTRADA");
                    }
                    break;
                case 2:
                    System.out.println("HAS SELECCIONADO LA OPERACION DE MODIFICACION");
                    System.out.println("Ingrese que fila desea modificar: ");
                    int fila = sc.nextInt();
                    System.out.println("Ingrese que columna desea modificar: ");
                    int col = sc.nextInt();
                    System.out.println("Cual es la nueva marca a ingresar: ?");
                    String nueva_marca = sc.nextLine();
                    marcas[fila][col]=nueva_marca;
                    break;
                case 3:
                    System.out.println("HAS SELECCIONADO LA OPERACION DE ELIMINACION");
                    System.out.println("Que marca va a eliminar: ?");
                    String marca_a_eliminar= sc.nextLine().toLowerCase();
                    for (int fila2 = 0; fila2 < filas; fila2++) {
                        for (int columna2 = 0; columna2 < cols; columna2++) {
                            if(marcas[fila2][columna2].equals(marca_a_eliminar)){
                                marcas[fila2][columna2]="";
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("HAS SELECCIONADO LA OPERACION LECTURA");
                    for (int fila1 = 0; fila1 < filas; fila1++) {
                        for (int col1 = 0; col1 < cols; col1++) {
                            System.out.print(marcas[fila1][col1]+"\t");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 5:
                    System.out.println("HASTA PRONTO");
                    salir=true;
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }
    }

}
