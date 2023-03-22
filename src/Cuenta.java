///Clase
public class Cuenta
{
    ///Atributos del objeto
    private int identificador;
    private int contadorID = 0;
    private String nombre;

    private double balance;
    ///Setters y Getters del objeto
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    ///Constructores del objeto
    public Cuenta (String nombre)
    {
        this.contadorID++;
        this.identificador = this.contadorID;
        this.nombre = nombre;
    }
    public Cuenta (double balance)
    {
        this.balance = balance;
    }
    ///Metodos
    public double credito (double dineroADepositar)
    {
        this.balance = this.balance + dineroADepositar;
        return balance;
    }
    public double credito2 (double balance, double dineroADepostar)
    {
        balance = balance + dineroADepostar;
        return balance;
    }
    public double debito (double dineroARetirar)
    {
        this.balance = this.balance - dineroARetirar;
        if(dineroARetirar > this.balance)
        {
            System.out.println("Usted esta queriendo retirar mas dinero del que tiene");
        }
       return balance;
    }
    public double debito2 (double balance, double dineroARetirar)
    {
        balance = balance - dineroARetirar;
        if(dineroARetirar > balance)
        {
            System.out.println("Usted esta queriendo retirar mas dinero del que tiene");
        }
        return balance;
    }
    public void mostrarCaracteristicasCuenta ()
    {
        System.out.println("Identificador: " + this.identificador);
        System.out.println("Balance: " + this.balance);
        System.out.println("Nombre: " + this.nombre);
    }
}
