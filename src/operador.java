import java.util.Scanner;

public class operador {
    public static void main(String[] args) {
        //Uso de tipos de datos en java
        //Todo lo que se coloca entre comillas en java, es un texto
        String nombre_estudiante  = "Hugo Paz"; //variable de tipo de texto
        int edad = 18;
        boolean valor = false;
        System.out.println("valor de variable nombre_estudiante= "+nombre_estudiante);
        System.out.println("valor de la variable edad= "+ edad);
        System.out.println("valor de la variable valor= "+ valor);


        //USO DE LOS OPERADORES ARITMETICOS
        System.out.println("USO DE LOS OPERADORES ARITMETICOS");
        Scanner entrada = new Scanner(System.in);// Con el comando "Scanner" permite receptar valores desde el teclado

        System.out.println("INGRESE EL PRIMER NUMERO: ");
        int numero1 = entrada.nextInt();

        System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        int numero2 = entrada.nextInt(); //nextInt permite leer valor de tipo entero

        System.out.println("numero1= "+ numero1);
        System.out.println("numero2= "+ numero2);

        System.out.println("Operacion suma");
        int suma = (numero1 + numero2);
        System.out.println("El resultado de la suma es: " + suma);

        System.out.println("Operacion resta");
        System.out.println("Resultado de la resta: "+ (numero1 - numero2));

        System.out.println("Operacion multiplicacion");
        System.out.println("Resultado de la multiplicacion: " + (numero1 * numero2));

        System.out.println("Operacion Division");
        System.out.println("Resultado division: " + (numero1/numero2));

        System.out.println("Operacion Residuo");
        System.out.println("Resultado operacion residuo: " + (numero1 % numero2));//se obtiene el residuo de la division

        System.out.println("Ingresa tus nombres completos");
        entrada.next();//para que permita escribir
        String nombres_completos = entrada.nextLine();
        System.out.println("Nombre ingresado:" + nombres_completos);
    }
}
