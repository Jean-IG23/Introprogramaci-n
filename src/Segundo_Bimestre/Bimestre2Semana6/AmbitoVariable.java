package Bimestre2Semana6;

public class AmbitoVariable {
static int numero = 10; //creacion de variable global

    public static void cambiavalor() {
        numero = numero + 15;
        int valor = 5;
    }
    public void cambiavalor(int numero) {
        this.numero = this.numero + 50;
    }
    public static void main(String[] args) {
        cambiavalor();
        System.out.println("El nuevo valor del numero = " + numero);
        AmbitoVariable mivariable = new AmbitoVariable();
        mivariable.cambiavalor(100);
        System.out.println("El nuevo valor del numero = " + numero);

        for (int i = 0; i < 5; i++) {
            System.out.println("Repeticion " + i);
        }
        System.out.println("El valor final del indice ");
    }
}
