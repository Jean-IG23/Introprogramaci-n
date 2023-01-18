package Bimestre2Semana3;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int numero[]={20,10,5,3,2,1};
        //controlamos el numero de pasadas generales
        for (int indice = 1; indice <= numero.length-1 ; indice++) {
            for (int elemento = 0; elemento <= numero.length-2; elemento++) {
                //verificar si realizamos un intercambio
                if (numero[elemento] > numero[elemento+1]) {
                    int aux = numero[elemento];
                    numero[elemento]=numero[elemento+1];
                    numero[elemento+1]=aux;
                }
            }
        }
        for (int indice = 0; indice < numero.length; indice++) {
            System.out.println(numero[indice]);
        }

    }
