public class SistemaNomina {
    public static void main(String[] args) {
        Empleado.jornada = 3;
        Empleado.costoExtra = 8;
        Gerente gerente1 = new Gerente("Augusto",10,2,"Cristina","Contabilidad");
        gerente1.calcularSueldo();
        System.out.println(gerente1);
        Operario operario1 = new Operario("David",8,3);
        operario1.calcularSueldo();
        System.out.println(operario1);
    }
}
class Empleado{
    public static double costoExtra;
    public static double jornada;
    public String nombre;
    private double sueldo;
    public double horas;
    public double costoHora;

    public Empleado() {

    }
    public Empleado(String nombre, double horas, double costoHora) {
        this.nombre = nombre;
        this.horas = horas;
        this.costoHora = costoHora;
    }
    public void calcularSueldo(){
        this.sueldo = this.horas*this.costoHora;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", horas=" + horas +
                ", costoHora=" + costoHora +
                '}';
    }
}
class Gerente extends Empleado{
    public String secretaria;
    public String departamento;

    public Gerente() {

    }

    public Gerente(String nombre, double horas, double costoHora, String secretaria, String departamento) {
        super(nombre, horas, costoHora);
        this.secretaria = secretaria;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "Gerente{" +
                "secretaria='" + secretaria + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
class Operario extends Empleado{
    public double horasExtras;
    public Operario() {}
    public Operario(String nombre, double horas, double costoHora) {
        super(nombre, horas, costoHora);
    }
    @Override
    public void calcularSueldo(){
        if (this.horas > jornada){
            this.horasExtras = this.horas - jornada;
            super.setSueldo((jornada * this.costoHora) + (this.horasExtras * ( costoExtra * this.costoHora)));
        }else{
            super.calcularSueldo();
        }
    }
    @Override
    public String toString() {
        return "Operario{" + super.toString() + "}";
    }
}

