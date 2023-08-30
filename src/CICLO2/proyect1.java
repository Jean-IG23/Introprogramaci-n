import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;

public abstract class Datos_Personales {
    public String nombre;
    public String apellido;
    public String cedula;
    public String direccion;
    public int anos_antiguedad;
    public String telefono;
    public double salario;

    public Datos_Personales(String nombre, String apellido, String cedula, String direccion, int anos_antiguedad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.anos_antiguedad = anos_antiguedad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
    return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAnos_antiguedad() {
        return anos_antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public abstract double calcularSueldo();
}

class Secretaria extends Datos_Personales{
    public String despacho;
    public int horas;
    public double costoHora;
    public int horaExtra;

    public Secretaria(String nombre, String apellido, String cedula, String direccion, int anos_antiguedad, String telefono, String despacho, int horas, double costoHora, int horaExtra) {
        super(nombre, apellido, cedula, direccion, anos_antiguedad, telefono);
        this.despacho = despacho;
        this.horas = horas;
        this.costoHora = costoHora;
        this.horaExtra = horaExtra;
    }

    public String getDespacho() {
        return despacho;
    }

    public int getHoras() {
        return horas;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public double calcularSueldo() {
        if (this.horaExtra > 0) {
            return this.salario = (this.horaExtra * 2) + this.horas * this.costoHora;
        } else {
            return this.salario = (this.horas * this.costoHora);
        }
    }
}
class Vendedores extends Datos_Personales{
    public String matricula;
    public String marca;
    public String modelo;
    public String areaVenta;
    public int ventasMensauales;
    public double porcentaje;
    public double salarioBasico;

    public Vendedores(String nombre, String apellido, String cedula, String direccion, int anos_antiguedad, String telefono, String matricula, String marca, String modelo, String areaVenta, int ventasMensauales, double porcentaje, double salarioBasico) {
        super(nombre, apellido, cedula, direccion, anos_antiguedad, telefono);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.areaVenta = areaVenta;
        this.ventasMensauales = ventasMensauales;
        this.porcentaje = porcentaje;
        this.salarioBasico = salarioBasico;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
  }

    public String getAreaVenta() {
        return areaVenta;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public double calcularSueldo() {
        return this.salario = this.salarioBasico + (this.ventasMensauales * this.porcentaje);
    }
}

class Jefe_De_Zona extends Datos_Personales{
    public String despacho;
    public Secretaria secretaria;
    public ArrayList<Vendedores> listvendedores;
    public double ventaGlobal;

    public Jefe_De_Zona(String nombre, String apellido, String cedula, String direccion, int anos_antiguedad, String telefono, String despacho, Secretaria secretaria, ArrayList<Vendedores> listvendedores, double ventaGlobal) {
        super(nombre, apellido, cedula, direccion, anos_antiguedad, telefono);
        this.despacho = despacho;
        this.secretaria = secretaria;
        this.listvendedores = listvendedores;
        this.ventaGlobal = ventaGlobal;
 }

    public String getDespacho() {
        return despacho;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public ArrayList<Vendedores> getVendedores() {
        return listvendedores;
    }

    public double getVentaGlobal() {
        return ventaGlobal;
    }

    public double calcularSueldo() {
        double ventasTotales = 0;
        for (Vendedores aux: listvendedores) {
            ventasTotales += aux.calcularSueldo();
        }
        return this.salario + (ventasTotales * 0.1);
    }
}

class GestionEmpleados {

    public void Escribir(ArrayList<Datos_Personales> empleados) throws IOException {
  Formatter formatter = new Formatter(new FileWriter("Empleados.csv"));

        formatter.format("%s,%s,%s,%s,%s,%s\n", "NOMBRE", "APELLIDO", "CEDULA", "DIRECCION", "SALARIO", "INFO_EXTRA");

        for (Datos_Personales empleado : empleados) {
            formatter.format(
                    "%s,%s,%s,%s,%.2f,%s\n",
                    empleado.getNombre(),
                    empleado.getApellido(),
                    empleado.getCedula(),
                    empleado.getDireccion(),
                    empleado.calcularSueldo(),
                    empleado instanceof Secretaria ? "Despacho: " + ((Secretaria) empleado).getDespacho() :
                            empleado instanceof Vendedores ? "Matricula: " + ((Vendedores) empleado).getMatricula() :
                                    empleado instanceof Jefe_De_Zona ? "Despacho: " + ((Jefe_De_Zona) empleado).getDespacho() : ""
            );
        }

        formatter.close();
    }
}

class Ejecutor {
    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria("Yeily", "Iniguez","1105727992","Sol de los Andes",3,"0988390090","Servicio",5,3.50,5);
        ArrayList<Vendedores> listvendedores = new ArrayList<>(Arrays.asList(new Vendedores("Emily","Iniguez","11055155","sol de los andes",8,"0522122","ABC-123","Hyunday","Accent","Servicio",2300,0.1,450),
                new Vendedores("Edgar","Iniguez","451561651","penas",4,"5626516","DEF-456","Chevrolet","Hilux","Servicio",4000,0.5,450)));

        Jefe_De_Zona jefe_de_zona = new Jefe_De_Zona("Jean","Iniguez","1105727992","SOL DE LOS ANDES",19,"0988390090","Jefe",secretaria,listvendedores,2000);

        ArrayList<Datos_Personales> datos_personales = new ArrayList<>();
        datos_personales.add(secretaria);
        datos_personales.addAll(listvendedores);
        datos_personales.add(jefe_de_zona);

        GestionEmpleados gestionEmpleados = new GestionEmpleados();
        try {
            gestionEmpleados.Escribir(datos_personales);
            System.out.println("DATOS GUARDADOS CORRECTAMENTE");
        } catch (IOException e) {
            System.out.println("ERROR AL ESCRIBIR AL ARCHIVO");
            throw new RuntimeException(e);
        }
    }
}




























package Ensayo;
import java.util.Formatter;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

class Empleado4 {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String direccion;
    private int antiguedad;
    private String telefono;
    private double salario;

    public Empleado4 (String nombre, String apellidos, String cedula, String direccion, int antiguedad, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
   }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
 public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }
}

class Secretario extends Empleado4 {
    private String despacho;
    private double costoHora;
    private int horasTrabajadas;
    private int horasExtras;

    public Secretario(String nombre, String apellidos, String cedula, String direccion, int antiguedad, String telefono, double salario, String despacho, double costoHora, int horasTrabajadas, int horasExtras) {
        super(nombre, apellidos, cedula, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.costoHora = costoHora;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double salarioHoras = costoHora * horasTrabajadas;
        double salarioExtras = costoHora * horasExtras * 1.5;
        return salarioBase + salarioHoras + salarioExtras;
    }
}

class Vendedor4 extends Empleado4 {
    private String cocheMatricula;
    private String cocheMarca;
    private String cocheModelo;
    private String telefonoMovil;
    private String areaVenta;
    public double ventasMensuales = 500000000;
    private double comision;
   public Vendedor4 (String nombre, String apellidos, String cedula, String direccion, int antiguedad, String telefono, double salario, String cocheMatricula, String cocheMarca, String cocheModelo, String telefonoMovil, String areaVenta, double comision) {
        super(nombre, apellidos, cedula, direccion, antiguedad, telefono, salario);
        this.cocheMatricula = cocheMatricula;
        this.cocheMarca = cocheMarca;
        this.cocheModelo = cocheModelo;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + (comision * ventasMensuales); // Debes definir 'ventasMensuales'
    }
}

class JefeZona1 extends Empleado4 {
    private String despacho;
    private Secretario secretario;
    private ArrayList<Vendedor4> vendedores1;

    public JefeZona1(String nombre, String apellidos, String cedula, String direccion, int antiguedad, String telefono, double salario, String despacho, Secretario secretario, ArrayList<Vendedor4> vendedores1) {
       super(nombre, apellidos, cedula, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores1 = vendedores1;
    }
    @Override
    public double calcularSalario() {
        double ventasTotales = 0;
        for (Vendedor4 vendedor : vendedores1) {
            ventasTotales += vendedor.ventasMensuales; // Debes definir 'ventasMensuales'
        }
        double salarioBase = super.calcularSalario();
        return salarioBase + (ventasTotales * 0.1);
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Secretario secretario = new Secretario("Ana", "López", "123456789", "Calle A, Ciudad", 2, "1234567890", 1000.0, "Oficina 101", 10.0, 160, 10);

        Vendedor4 vendedor5 = new Vendedor4("Juan", "García", "987654321", "Avenida B, Pueblo", 3, "9876543210", 1500.0, "ABC123", "Toyota", "Corolla", "555-12345", "Zona Norte", 0.05);

        Secretario secretarioJefe = new Secretario("Laura", "Pérez", "543216789", "Calle C, Ciudad", 5, "5432167890", 1200.0, "Oficina 202", 12.0, 180, 15);
      ArrayList<Vendedor4> vendedoresJefe = new ArrayList<>();
        vendedoresJefe.add(vendedor5);

        JefeZona1 jefeZona1 = new JefeZona1("Carlos", "Martínez", "789654321", "Avenida D, Pueblo", 7, "7896543210", 2500.0, "Oficina 303", secretarioJefe, vendedoresJefe);

        double salarioSecretario = secretario.calcularSalario();
        double salarioVendedor = vendedor5.calcularSalario();
        double salarioJefeZona = jefeZona1.calcularSalario();

        System.out.println("Salario del Secretario: $" + salarioSecretario);
        System.out.println("Salario del Vendedor: $" + salarioVendedor);
        System.out.println("Salario del Jefe de Zona: $" + salarioJefeZona);
        try (FileWriter writer = new FileWriter("empleados.csv")) {
            writer.write("Tipo,Nombre,Apellidos,Cedula,Direccion,Antiguedad,Telefono,Salario\n");

            writeEmpleado(writer, "Secretario", secretario, salarioSecretario);
            writeEmpleado(writer, "Vendedor", vendedor5, salarioVendedor);
            writeEmpleado(writer, "Jefe de Zona", jefeZona1, salarioJefeZona);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  private static void writeEmpleado(FileWriter writer, String tipo, Empleado4 empleado, double salario) throws IOException {
        writer.write(String.format("%s,%s,%s,%s,%s,%d,%s,%.2f\n",
                tipo,
                empleado.getNombre(),
                empleado.getApellidos(),
                empleado.getCedula(),
                empleado.getDireccion(),
                empleado.getAntiguedad(),
                empleado.getTelefono(),
                salario
        ));
    }
}
