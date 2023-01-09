package AlgortmosOrdenamiento;

public class Burbuja {
    public static void main(String[] args) throws InterruptedException{
        int arreglo[]=new int[100000];
        int indiceelem=0;
        for (int indice = 100000; indice > 0; indice--) {
            arreglo[indiceelem] = indice;
            indiceelem++;
        }
        long inicio= System.currentTimeMillis();
        Thread.sleep(2000);
        for (int indice = 0; indice < arreglo.length-1; indice++) {
            for (int indice2 = 0; indice2 < arreglo.length-1 ; indice2++) {
                if (arreglo[indice2] > arreglo[indice2+1]) {
                    int aux= arreglo[indice2];
                    arreglo[indice2]=arreglo[indice2+1];
                    arreglo[indice2+1]=aux;
                }
            }
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin = System.currentTimeMillis();
        double tiempo= (double) ((fin-inicio)/1000);
        System.out.println(tiempo+" segundos");
}

}
