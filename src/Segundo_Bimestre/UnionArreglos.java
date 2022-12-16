package SegundoBimestre_Semana2;

public class UnionArreglos {
    public static void main(String[] args) {
        String marcas1 [] = {"Hp","Dell","Assus","Lenovo","Toshiba"};
        String marcas2 [] = {"Samsung","Huawei","Dere"};
        int resultado = marcas1.length + marcas2.length;
        String res [] = new String[resultado];
        for (int indice = 0; indice < marcas1.length; indice++) {
            res [indice] = marcas1[indice];
        }
        for (int indice = marcas1.length, indice2 = 0; indice < res.length; indice++, indice2++) {
            res [indice] = marcas2[indice2];
        }
        for (int indice = 0; indice < res.length; indice++) {
            System.out.println(res[indice]);
        }
    }

}
