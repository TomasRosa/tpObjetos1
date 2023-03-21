public class Empleado
{
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado (int dni, double salario)
    {
        this.dni = dni;
        this.salario = salario;
    }
    public Empleado (String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public double salarioAnual (double salario)
    {
        salario = salario * 12;

        return  salario;
    }

    public double salarioPorcentaje (double salario, double porcentaje)
    {
        double totalPorcentaje = (porcentaje / 100) + 1;

        salario = salario * totalPorcentaje;

        return salario;
    }
    public void mostrar (int dni, String nombre, String apellido, double salario)
    {
        System.out.println("Empleado" + "[DNI= " + dni + ", NOMBRE= " + nombre + ", APELLIDO= " + apellido + ", SALARIO= " + salario + "]");
    }
}
