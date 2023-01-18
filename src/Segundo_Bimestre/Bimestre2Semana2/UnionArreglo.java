package Bimestre2Semana2;

public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1 []= {"hp", "dell", "assus","lenovo", "toshiba"};
        String marcas2 []= {"samsung","huawei","dere"};
        int tam_arr_resultado = marcas1.length + marcas2.length;    //8
        String res []= new String[tam_arr_resultado];

        for (int indice = 0; indice < 5; indice++) {
            res[indice]=marcas1[indice];
        }
        for (int indice = 5, indice2=0; indice < 8; indice++, indice2++) {
            res[indice]=marcas2[indice2];
        }
        for (int indice = 0; indice < 8; indice++) {
            System.out.println(res[indice]);
        }
    }
}
