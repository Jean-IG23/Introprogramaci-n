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




























package mainejmod;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
class Usuario {
    public String nombre, diaEstacionamiento, estado;
    public double costoHora, costoFinal;
    public int numHoras;
    public Vehiculo vehiculo;
    public Usuario(String nombre, String diaEstacionamiento, double costoHora, int numHoras, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.costoHora = costoHora;
        this.numHoras = numHoras;
        this.vehiculo = vehiculo;
        this.diaEstacionamiento = diaEstacionamiento;
    }
    public void calcularCostoFinal() {
        this.costoFinal = this.costoHora * this.numHoras;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDiaEstacionamiento() {
        return diaEstacionamiento;
    }
    public String getEstado() {
        return estado;
    }
    public double getCostoHora() {
     return costoHora;
    }
    public double getCostoFinal() {
        return costoFinal;
    }
    public int getNumHoras() {
        return numHoras;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", diaEstacionamiento=" + diaEstacionamiento + ", estado=" + estado + 
                ", costoHora=" + costoHora + ", costoFinal=" + costoFinal + ", numHoras=" + numHoras + 
                ", vehiculo=" + vehiculo + '}';
    }
}
class Estudiante extends Usuario {
    public String discapacidad;
    public double descuento;
    public Estudiante(String discapacidad, String diaEstacionamiento, String nombre, double costoHora, int numHoras, Vehiculo vehiculo) {
        super(nombre, diaEstacionamiento, costoHora, numHoras, vehiculo);
        this.discapacidad = discapacidad;
    }
    public void calcularCostoFinal() {
        super.calcularCostoFinal();
        if ((discapacidad.equals("SI")) || this.vehiculo instanceof Moto) {
            this.descuento = this.costoFinal * 0.5;
            this.costoFinal -= this.descuento;
        }
    }
    public String getDiscapacidad() {
        return discapacidad;
    }
    public double getDescuento() {
        return descuento;
    }
    public String toString() {
        return super.toString() + " Estudiante{" + "discapacidad=" + discapacidad + ", descuento=" + descuento + '}';
    }
}
class PersonalUTPL extends Usuario {
    public String discapacidad;
    public double descuento;
    public PersonalUTPL(String discapacidad, String diaEstacionamiento, String nombre, double costoHora, int numHoras, Vehiculo vehiculo) {
        super(nombre, diaEstacionamiento, costoHora, numHoras, vehiculo);
        this.diaEstacionamiento = diaEstacionamiento;
        this.discapacidad = discapacidad;
    }
    public void calcularCostoFinal() {
        super.calcularCostoFinal();
        if ((discapacidad.equals("SI")) || this.vehiculo instanceof Moto) {
            this.descuento = this.costoFinal * 0.5;
            this.costoFinal -= this.descuento;
        }
    }
    public String getDiscapacidad() {
        return discapacidad;
    }
    public double getDescuento() {
        return descuento;
    }
    public String toString() {
       return super.toString() + " PersonalUTPL{" + "discapacidad=" + discapacidad + ", descuento=" + descuento + '}';
    }
}
class UsuarioParticular extends Usuario {
    public UsuarioParticular(String nombre, String diaEstacionamiento, double costoHora, int numHoras, Vehiculo vehiculo) {
        super(nombre, diaEstacionamiento, costoHora, numHoras, vehiculo);
    }
    public String toString() {
        return super.toString();
    }
}
class Vehiculo {
    public String matricula;
    public ArrayList<String> diasEstacionamiento;
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    public void verificarDiasEstacionamiento() {
        this.diasEstacionamiento = (Integer.parseInt(this.matricula.substring(matricula.length() - 1, matricula.length())) % 2 == 0)
                ? new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miercoles"))
                : new ArrayList<>(Arrays.asList("Jueves", "Viernes", "Sabado"));
    }
    public String getMatricula() {
        return matricula;
    }
    public ArrayList<String> getDiasEstacionamiento() {
        return diasEstacionamiento;
    }
    public String toString() {
       return "Vehiculo{" + "matricula=" + matricula + ", diasEstacionamiento=" + diasEstacionamiento + '}';
    }
}
class Moto extends Vehiculo {
    public Moto(String matricula) {
        super(matricula);
    }
}
class Auto extends Vehiculo {
    public Auto(String matricula) {
        super(matricula);
    }
}
class Estacionamiento {
    public ArrayList<Usuario> listUsuario;
    public Estacionamiento(ArrayList<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }
    public void validarIngresoMatricula() {
        for (Usuario auxUsuario : listUsuario) {
            auxUsuario.vehiculo.verificarDiasEstacionamiento();
            auxUsuario.estado = "AUTORIZADO";
            if ((auxUsuario instanceof Estudiante) || (auxUsuario instanceof UsuarioParticular)) {
                if (!auxUsuario.vehiculo.diasEstacionamiento.contains(auxUsuario.diaEstacionamiento)) {
                    auxUsuario.estado = "NO AUTORIZADO";
                } else {
                    auxUsuario.calcularCostoFinal();
                }
            } else {
                auxUsuario.calcularCostoFinal();
            }
        }
    }
}
public class MainEJMod {
    public static void main(String[] args) {
        ArrayList<Usuario> listUsuario = new ArrayList<>(Arrays.asList(
                new Estudiante("SI", "Jueves", "User1", 2, 6, new Vehiculo("ABC-6")),
                new PersonalUTPL("SI", "Lunes", "User2", 5, 7, new Vehiculo("XYZ-3")),
                new UsuarioParticular("User3", "Martes", 2, 8, new Vehiculo("OPQ-7"))));
        Estacionamiento estacionamiento = new Estacionamiento(listUsuario);
        estacionamiento.validarIngresoMatricula();
        try {
            Formatter fileOut = new Formatter("archivoSaluda.csv");
            fileOut.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n", "NOMBRE USUARIO", "TIPOS USER", "MATRICULA DE VEHICULO", "DIA", 
                           "DIAS PERMITIDOS POR MATRICULA", "ESTADO", "COSTO HORA", "NUMERO HORAS", "DISCAPACIDAD", "DESCUENTO",
                           "COSTO FINAL");
            for (Usuario auxUser : listUsuario) {
                fileOut.format("%s;%s;%s;%s;%s;%s;%.2f;%d;", auxUser.getNombre(),  auxUser.getClass().getName(), 
                               auxUser.vehiculo.getMatricula(), auxUser.diaEstacionamiento, 
                               auxUser.vehiculo.getDiasEstacionamiento().toString(), auxUser.estado, auxUser.getCostoHora(),
                               auxUser.getNumHoras());
                if (auxUser instanceof Estudiante) 
                        fileOut.format("%s;%.2f", ((Estudiante) auxUser).getDiscapacidad(),  ((Estudiante) auxUser).getDescuento());
                else if (auxUser instanceof PersonalUTPL) 
                        fileOut.format("%s;%.2f", ((PersonalUTPL) auxUser).getDiscapacidad(),  ((PersonalUTPL) auxUser).getDescuento());
                     else
                fileOut.format("%s;%.2f", "", 0.0);
                fileOut.format(";%.2f", auxUser.costoFinal);
                fileOut.format("\n");
            }
            fileOut.close();
           System.out.println("Archivo creado con exito");

        } catch (FileNotFoundException ex) {
            System.out.println("Error en el archivo");
        }
    }
}




























package javaapplication176;

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
public class MainEJ7 {
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
        //generacion de doc .CSV
        try (FileWriter writer = new FileWriter("empleados.csv")) {
            writer.write("Tipo;Nombre;Apellidos;Cedula;Direccion;Antiguedad;Telefono;Salario\n");

  writeEmpleado(writer, "Secretario", secretario, salarioSecretario); 
            writeEmpleado(writer, "Vendedor", vendedor5, salarioVendedor);
            writeEmpleado(writer, "Jefe de Zona", jefeZona1, salarioJefeZona);
       } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeEmpleado(FileWriter writer, String tipo, Empleado4 empleado, double salario) throws IOException {
        writer.write(String.format("%s;%s;%s;%s;%s;%d;%s;%.2f\n",
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




























package mainej1;

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void restarCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }
}

class CarritoDeCompras {
    private Producto producto;
    private double total;

   public void agregarProducto(String nombre, int cantidad, Producto[] productosDisponibles) {
        for (Producto p : productosDisponibles) {
            if (p.getNombre().equals(nombre)) {
                if (p.getCantidad() >= cantidad) {
                    producto = new Producto(p.getNombre(), p.getPrecio(), cantidad);
                    total = p.getPrecio() * cantidad;
                    p.restarCantidad(cantidad);
                    return;
                } else {
                    System.out.println("No hay suficiente cantidad disponible de " + nombre);
                    return;
                }
            }
        }
        System.out.println("El producto " + nombre + " no existe en la tienda.");
    }

    public double calcularTotal() {
        return total;
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la compra:");
        System.out.println(producto.getNombre() + " - Cantidad: " + producto.getCantidad());
    }
    
     public void realizarPago(double montoPagado, double descuento) {
        if (montoPagado >= total) {
            double totalConDescuento = total;
            if (montoPagado > 1000) {
     totalConDescuento -= descuento;
            }
            
            System.out.println("Gracias por su compra. Su cambio es: " + (montoPagado - totalConDescuento));
            
            // Actualizar la cantidad disponible en los productos del carrito
            producto.restarCantidad(producto.getCantidad());
        } else {
            System.out.println("El monto pagado no es suficiente. Faltan $" + (total - montoPagado));
        }
    }
}

public class MainEJ1 {
    public static void main(String[] args) {
        Producto[] productosDisponibles = {
            new Producto("Producto1", 10.0, 5),
            new Producto("Producto2", 20.0, 10)
            // Agregar más productos aquí
        };

        CarritoDeCompras carrito = new CarritoDeCompras();
        double descuento = 5.0; // Descuento de ejemplo

        carrito.agregarProducto("Producto1", 3, productosDisponibles);
        carrito.mostrarDetalleCompra();
        System.out.println("Total: $" + carrito.calcularTotal());

        carrito.realizarPago(30.0, descuento);
    }
}




























package Ensayo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Examen_Parcial_2 {
    public static void main(String[] args) {
        List<Empleado3> listEmpleados3 = new ArrayList<>();
        Map<String, List<Vendedor3>> salespeopleByZone = new HashMap<>();

        Vendedor3 vendedor1 = new Vendedor3("Juan", "SAL", 420, "HHH", "hg", 3333, "123a", "totota", "2012", "sur", 20.12, 400);
        addSalespersonToZone(salespeopleByZone, vendedor1);


        Sistema3 sistema = new Sistema3(listEmpleados3, salespeopleByZone);
        sistema.validarSueldo3();

        // Imprimir los empleados y vendedores con sus salarios
        for (Empleado3 empleado : listEmpleados3) {
            System.out.println(empleado);
        }

        // Imprimir los vendedores organizados por zona
        for (String zone : salespeopleByZone.keySet()) {
            System.out.println("Zona: " + zone);
            List<Vendedor3> vendedores = salespeopleByZone.get(zone);
            for (Vendedor3 vendedor : vendedores) {
                System.out.println(vendedor);
            }
        }
    }

    public static void addSalespersonToZone(Map<String, List<Vendedor3>> salespeopleByZone, Vendedor3 vendedor) {
        List<Vendedor3> vendedoresEnZona = salespeopleByZone.getOrDefault(vendedor.area, new ArrayList<>());
        vendedoresEnZona.add(vendedor);
        salespeopleByZone.put(vendedor.area, vendedoresEnZona);
    }
}

// Las clases Empleado3, Vendedor3, Secretaria2, jefeZona y Sistema3 se mantienen como las proporcionaste en tu código original.



abstract class Empleado3{
    public String nombre;
    public String apellido;
    public int cedula;
    public String direccion;
    public String antiguedad;
    public int telefono;
    public double sueldo;


    public Empleado3(String nombre, String apellido, int cedula, String direccion, String antiguedad, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;

    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getCedula() {
        return cedula;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getAntiguedad() {
        return antiguedad;
    }
    public int getTelefono() {
        return telefono;
    }
    public abstract void calcularSueldo3( );
}
class Vendedor3 extends Empleado3 {
    public String idMatricula;
    public String marca;
    public String modelo;
    public String area;
    public double comision;
    public  double sueldob;
    public Vendedor3(String nombre, String apellido, int cedula, String direccion, String antiguedad, int telefono, String idMatricula, String marca, String modelo, String area, double comision, double sueldob) {
        super(nombre, apellido, cedula, direccion, antiguedad, telefono);
        this.idMatricula = idMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.area = area;
        this.comision = comision;
        this.sueldob = sueldob;
    }
    @Override
    public void calcularSueldo3() {
        this.sueldob = this.sueldob + (comision * 10);
    }
    @Override
    public String toString() {
        return "Vendedor3{" +
                "idMatricula='" + idMatricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", area='" + area + '\'' +
                ", comision=" + comision +
                ", sueldob=" + sueldob +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", direccion='" + direccion + '\'' +
                ", antiguedad='" + antiguedad + '\'' +
                ", telefono=" + telefono +
                ", sueldo=" + sueldo +
                '}';
    }
}
class Secretaria2 extends Empleado3{
    public double horastrabajadas = 8;
    public double horasextra = 2;
    public double costoHoras = 30;

    public Secretaria2(String nombre, String apellido, int cedula, String direccion, String antiguedad, int telefono, double horastrabajadas, double horasextra, double costoHoras) {
        super(nombre, apellido, cedula, direccion, antiguedad, telefono);
        this.horastrabajadas = horastrabajadas;
        this.horasextra = horasextra;
        this.costoHoras = costoHoras;
    }
    @Override
    public void calcularSueldo3() {
        this.sueldo = (this.horastrabajadas * this.costoHoras)+(this.horasextra * this.costoHoras)+
                (this.costoHoras*0.5);
    }
    @Override
    public String toString() {
        return "Secretaria2{" +
                "horastrabajadas=" + horastrabajadas +
                ", horasextra=" + horasextra +
                ", costoHoras=" + costoHoras +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", direccion='" + direccion + '\'' +
                ", antiguedad='" + antiguedad + '\'' +
                ", telefono=" + telefono +
                ", sueldo=" + sueldo +
                '}';
    }
}
// ... (código anterior)

class jefeZona extends Empleado3 {
    public Sistema3 sistema3;
    public String despacho;
    public Secretaria2 secretaria1;
    public Vendedor3 vendedor3;

    public jefeZona(String nombre, String apellido, int cedula, String direccion, String antiguedad, int telefono, String despacho, Secretaria2 secretaria1, Vendedor3 vendedor3) {
        super(nombre, apellido, cedula, direccion, antiguedad, telefono);
        this.despacho = despacho;
        this.secretaria1 = secretaria1;
        this.vendedor3 = vendedor3;
    }

    @Override
    public void calcularSueldo3() {
        double vendedoresEnZona = sistema3.encontrarvendedores(vendedor3);
        this.sueldo = vendedoresEnZona * 10;
    }

    @Override
    public String toString() {
        return "jefeZona{" +
                "despacho='" + despacho + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", direccion='" + direccion + '\'' +
                ", antiguedad='" + antiguedad + '\'' +
                ", telefono=" + telefono +
                ", sueldo=" + sueldo +
                '}';
    }
}

class Sistema3 {
    public List<Empleado3> listEmpleados3;
    public Map<String, List<Vendedor3>> salespeopleByZone;

    public Sistema3(List<Empleado3> listEmpleados3, Map<String, List<Vendedor3>> salespeopleByZone) {
        this.listEmpleados3 = listEmpleados3;
        this.salespeopleByZone = salespeopleByZone;
    }

    public double encontrarvendedores(Vendedor3 vendedor) {
        listEmpleados3.add(vendedor);
        int numeroVendedores = 0;
        for (Empleado3 empleado : listEmpleados3) {
            if (empleado instanceof Vendedor3) {
                numeroVendedores++;
            }
        }
        return numeroVendedores;
    }

    public void validarSueldo3 () {
        for (Empleado3 empleado : listEmpleados3) {
            empleado.calcularSueldo3();
        }
    }
}




























package Ensayo;

import java.util.ArrayList;
public class Sistema_Vuelos {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("pablo", "f555",9630071);
        Pasajero pasajero2 = new Pasajero("carlis", "j999",01234);
        Pasajero pasajero3 = new Pasajero("juan", "564",01234);
        Pasajero pasajero4 = new Pasajero("ben", "954",01234);
        Vuelo chicago = new Vuelo(502, "Ecuador","chicago","11/05/23","10:20:30", 1 );
        Reserva reserva1 = new Reserva(pasajero1, chicago);
        Reserva reserva2 = new Reserva(pasajero2, chicago);
        Reserva reserva3 = new Reserva(pasajero3, chicago);
        Reserva reserva4 = new Reserva(pasajero4, chicago);

        ArrayList<Reserva> reservas = new ArrayList<>();
        reservas.add(reserva1);
        reservas.add(reserva2);
        reservas.add(reserva3);
        reservas.add(reserva4);
        for (Reserva reserva : reservas) {
            System.out.println("Pasajeros en el vuelo:");
            System.out.println(reserva.vuelo.listpasajeros);
        }

    }
}
class User{
    public String nom;
    public String numPasa;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumPasa() {
        return numPasa;
    }

    public void setNumPasa(String numPasa) {
        this.numPasa = numPasa;
    }

    public User(String nom, String numPasa) {
        this.nom = nom;
        this.numPasa = numPasa;
    }
}
class Personl extends User {
    public String numIndetificacion;

    public Personl(String nom, String numPasa, String numIndetificacion) {
        super(nom, numPasa);
        this.numIndetificacion = numIndetificacion;
    }
}
class Pasajero extends User {
    public int numCel;

    public int getNumCel() {
        return numCel;
    }

    public void setNumCel(int numCel) {
        this.numCel = numCel;
    }

    public Pasajero (String nom, String numPasa, int numCel) {
        super(nom, numPasa);
        this.numCel = numCel;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "numCel=" + numCel +
                ", nom='" + nom + '\'' +
                ", numPasa='" + numPasa + '\'' +
                '}';
    }
}
class Vuelo {
    public int numvuel;
    public String origen;
    public String destini;
    public String fecha;
    public String Hora;
    public int limitePa ;
    public String estado;
    final ArrayList<Pasajero> listpasajeros;

    public Vuelo(int numvuel, String origen, String destini, String fecha, String Hora, int limitePa) {
        this.numvuel = numvuel;
        this.origen = origen;
        this.destini = destini;
        this.fecha = fecha;
        this.limitePa = limitePa;
        this.Hora = Hora;
        this.estado = "EN ESPERA";
        this.listpasajeros = new ArrayList<>();
    }
    public void agregarPasajero(Pasajero pasajero) {
        if (listpasajeros.size() <= limitePa) {
            listpasajeros.add(pasajero);
            this.estado = "TIENE ACCESO";
        } else {
            this.estado = "NO TIENE ACCESO";
        }
    }
    @Override
    public String toString() {
        return "Vuelo{" +
                "numvuel=" + numvuel +
                ", origen='" + origen + '\'' +
                ", destini='" + destini + '\'' +
                ", fecha='" + fecha + '\'' +
                ", limitePa=" + limitePa +
                ", estado='" + estado + '\'' +
                '}';
    }
}
class Reserva {
    public Pasajero pasajeros;
    public Vuelo vuelo;

    public Reserva(Pasajero pasajeros, Vuelo vuelo) {
        this.pasajeros = pasajeros;
        this.vuelo = vuelo;
        asignarReserva();
    }

    public void asignarReserva() {
        vuelo.agregarPasajero(pasajeros);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "pasajeros=" + pasajeros +
                ", vuelo=" + vuelo +
                '}';
    }
}




