import java.util.Scanner;

public class cedula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su número de cedula");
        int arreglo [] = new int [10];
        int sp = 0, si = 0, st = 0, x;
        String prov = "";
        for (int indice = 0; indice < 10; indice++) {
            arreglo[indice] = teclado.nextInt();
        }
        for (int indice = 1; indice < 8; indice = indice + 2) {
            si = si + arreglo[indice];
        }
        for (int indice = 0; indice < 9; indice= indice + 2) {
            x = arreglo[indice] * 2;
            if(x > 9) {
                x = x - 9;
            }
            sp = sp + x;
        }
        if(arreglo[0] == 0 && arreglo[1] == 1) {
            prov = "Azuay";
        }
        if(arreglo[0] == 0 && arreglo[1] == 2) {
            prov = "Bolivar";
        }
        if(arreglo[0] == 0 && arreglo[1] == 3) {
            prov = "Cañar";
        }
        if(arreglo[0] == 0 && arreglo[1] == 4) {
            prov = "Carchi";
        }
        if(arreglo[0] == 0 && arreglo[1] == 5) {
            prov = "Cotopaxi";
        }
        if(arreglo[0] == 0 && arreglo[1] == 6) {
            prov = "Chimborazo";
        }
        if(arreglo[0] == 0 && arreglo[1] == 7) {
            prov = "El Oro";
        }
        if(arreglo[0] == 0 && arreglo[1] == 8) {
            prov = "Esmeraldas";
        }
        if(arreglo[0] == 0 && arreglo[1] == 9) {
            prov = "Guayas";
        }
        if(arreglo[0] == 1 && arreglo[1] == 0) {
            prov = "Imbabura";
        }
        if(arreglo[0] == 1 && arreglo[1] == 1) {
            prov = "Loja";
        }
        if(arreglo[0] == 1 && arreglo[1] == 2) {
            prov = "Los Rios";
        }
        if(arreglo[0] == 1 && arreglo[1] == 3) {
            prov = "Manabì";
        }
        if(arreglo[0] == 1 && arreglo[1] == 4) {
            prov = ",Morona Santiago";
        }
        if(arreglo[0] == 1 && arreglo[1] == 5) {
            prov = "Napo";
        }
        if(arreglo[0] == 1 && arreglo[1] == 6) {
            prov = "Pastaza";
        }
        if(arreglo[0] == 1 && arreglo[1] == 7) {
            prov = "Pichincha";
        }
        if(arreglo[0] == 1 && arreglo[1] == 8) {
            prov = "Tungurahua";
        }
        if(arreglo[0] == 1 && arreglo[1] == 9) {
            prov = "Zamora Chinchipe";
        }
        if(arreglo[0] == 2 && arreglo[1] == 0) {
            prov = "Galapagos";
        }
        if(arreglo[0] == 2 && arreglo[1] == 1) {
            prov = "Sucumbios";
        }
        if(arreglo[0] == 2 && arreglo[1] == 2) {
            prov = "Orellana";
        }
        if(arreglo[0] == 2 && arreglo[1] == 3) {
            prov = "Santo Domingo de los Tsachilas";
        }
        if(arreglo[0] == 2 && arreglo[1] == 4) {
            prov = "Santa Elena";
        }
        st = sp + si;
        x = 10 - (st % 10);
        if (x == arreglo[9] ){
            System.out.println("Cedula correcta");
            System.out.println("La cedula pertenece a la provincia de " + prov);
        } else {
            System.out.println("Cedula incorrecta");
        }
    }
}

