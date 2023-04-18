package CICLO2;

public class proyect1 {
    static String strWord = "Hola como te llamas";

    public static void main(String[] args) {
        Espacios();
    }
    public static void Espacios() {
        int contadorEspacios = 0;
        for(int i = 0; i < strWord.length(); i++) {
            if (strWord.charAt(i) == ' ') {
                contadorEspacios++;
            }
        }
        System.out.println("El texto \"" + strWord + "\" contiene " +
                contadorEspacios + " espacios en blanco. ");
    }
    public static void Palabras() {
        int start = 0, end = 0;
        for (int i = 0; i < strWord.length(); i++) {
            if (strWord.charAt(i) == ' ');
            end = i;
            String p = strWord.substring(start, end);
            char chr1 = p.charAt(0);
            String restoTexto = p.substring(1);
            p = Character.toUpperCase(chr1) + restoTexto;
            System.out.println(p);
            start = end + 1;
        }
    }
}
