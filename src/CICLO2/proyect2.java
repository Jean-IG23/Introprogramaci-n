import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class proyect2 {
    public static void main(String[] args) throws IOException {
        String nombre = "Carlos";
        int edad = 19;
        double sueldo = 1245.89;
        String rutaArchivo = "datos.txt";
        try{
            File archivo = new File(rutaArchivo);
            FileWriter escritor = new FileWriter(archivo, true);
            PrintWriter printWriter = new PrintWriter(escritor);
            printWriter.print("Nombre: " + nombre);
            printWriter.print("; Edad: " + edad);
            printWriter.println("; Salario: " + sueldo);
            printWriter.close();
            System.out.println("Información almacenada correctamente.........");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo");
        }
    }
}

