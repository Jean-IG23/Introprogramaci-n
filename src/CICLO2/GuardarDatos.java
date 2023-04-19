import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GuardarDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n <= 3) {
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.next();

            System.out.println("Ingrese su número de cedula: ");
            int cedula = sc.nextInt();

            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();

            String rutaArchivo = "JEAN.txt";
            try {
                File archivo = new File(rutaArchivo);
                FileWriter escritor = new FileWriter(archivo, true);
                PrintWriter printWriter = new PrintWriter(escritor);
                printWriter.print( n + ": Nombre: " + nombre);
                printWriter.print("; Edad: " + edad);
                printWriter.println("; Cedula: " + cedula);
                printWriter.close();
                System.out.println("Información almacenada correctamente.........");
            } catch (
                    IOException e) {
                System.out.println("Ha ocurrido un error al escribir en el archivo");
            }
            n++;
        }

    }
}
