package semaman3;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int numero [] = {20, 10, 5, 3, 2, 1};
        for (int i = 1; i < numero.length; i++) {
            for (int elemento = 0; elemento < numero.length - 1; elemento++) {
                // veroiificar si realizamos inbtercambip
                if (numero[elemento] > numero[elemento + 1]) {
                    int aux = numero[elemento];
                    numero[elemento] = numero[elemento + 1];
                    numero[elemento + 1] = aux;
                }
            }
        }
        //mostar arreglo ordenado
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }
}
