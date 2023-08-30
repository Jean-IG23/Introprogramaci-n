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
