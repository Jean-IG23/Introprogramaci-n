package Bimestre2Semana2;

public class CuadradoArreglo {
    public static void main(String[] args) {
        int numeros []= {2,3,5,7,9,11,13};
        int cuadrados[]=new int[numeros.length];
        for (int indice = 0; indice < numeros.length; indice++) {
            cuadrados[indice]=numeros[indice]*numeros[indice];
        }
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(cuadrados[indice]);
        }
    }
}
