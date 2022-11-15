package Repetición_while;

import javax.swing.*;

/**
 * GENERAR LA TABLA DE MULTIPLICAR HASTA EL 10 DE UN NÚMERO INGRESADA POR TECLADO
 */
public class TablaMultiplicación {
    public static void main(String[] args) {
        //System.out.println("PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        JOptionPane.showMessageDialog(null,"PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        //System.out.println("Ingrese un número: ");
        String num = JOptionPane.showInputDialog("Ingrese un número: ");
        int contador = 1;
        String acumulador = "";
        while (contador <= 10){
            int mult = Integer.parseInt(num) * contador;
            String salida = num + "x" + String.valueOf(contador) + "=" + String.valueOf(mult) + "\n";
            acumulador = acumulador + salida;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null, acumulador);

    }

}
