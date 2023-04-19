import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Leerdatos {
    public static void main(String[] args) {
        File archivo = new File("datos.txt");
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String line;
            int numLine = 1;
            while ((line = buffer.readLine()) != null) {
                System.out.print(numLine + ": ");
                System.out.println(line);
                numLine++;
            }
            buffer.close();
            lector.close();
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }
    }
}
