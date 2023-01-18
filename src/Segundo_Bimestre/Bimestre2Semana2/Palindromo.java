package Bimestre2Semana2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra= sc.nextLine();
        int tam_palabra = palabra.length();
        System.out.println(tam_palabra);
        char palabra_arr[]= new char[tam_palabra];
        char letra[]= new char[tam_palabra];
        for (int indice = 0; indice < tam_palabra; indice++) {
            palabra_arr[indice]=palabra.charAt(indice); //para deletrearlo se usa.charAt()
        }
        for (int indice = 0; indice < tam_palabra; indice++) {
            System.out.println(palabra_arr[indice]);
        }
        //lectura de arreglo de derecha a izquierda
        String palabra_invertida="";
        for (int indice = tam_palabra-1; indice >= 0; indice--) {
            palabra_invertida=palabra_invertida+palabra_arr[indice];
        }
        if (palabra.equals(palabra_invertida)) {
            System.out.println("si es palindromo");
        }else{
            System.out.println("la palabra no es palindroma");
        }
    }
}
