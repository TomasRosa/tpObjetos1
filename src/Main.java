import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Que ejercicio desea ver?");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1();
                ///hola
                break;
            }
            case 2:
            {
                ejercicio2();
                ///ejercicio2
                break;
            }
            case 3:
            {
                ejercicio3();
                break;
            }
            case 4:
            {
                ejercico4();
            }
            case 5:
            {
                ejercicio5();
            }
        }
    }

    public static void ejercicio1 ()
    {
        Rectangulo forma = new Rectangulo(1.0,1.0);
        System.out.println("Ancho: " + forma.getAncho());
        System.out.println("Alto: " + forma.getAlto());

        System.out.println("Area: " + forma.area(forma.getAlto(), forma.getAncho()));
        System.out.println("Perimetro: " + forma.perimetro(forma.getAlto(), forma.getAncho()));

        forma.setAncho(2.0);
        forma.setAlto(2.3);

        System.out.println("Area: " + forma.area(forma.getAlto(), forma.getAncho()));
        System.out.println("Perimetro: " + forma.perimetro(forma.getAlto(), forma.getAncho()));

        Rectangulo forma2 = new Rectangulo();

        System.out.println("Ancho: " + forma2.getAncho());
        System.out.println("Alto: " + forma2.getAlto());
    }
    public static void ejercicio2()
    {
        String nombre = "Carlos";
        String apellido = "Gutierrez";
        int dni = 23456345;
        double salario = 25000;

        Empleado emp = new Empleado(nombre, apellido);
        emp = new Empleado(dni, salario);

        emp.mostrar(dni, nombre, apellido, salario);

        String nombre2 = "Ana";
        String apellido2 = "Sanchez";
        int dni2 = 34234123;
        double salario2 = 27500;

        Empleado emp2 = new Empleado(nombre2, apellido2);
        emp2 = new Empleado(dni2, salario2);

        emp2.mostrar(dni2, nombre2, apellido2, salario2);

        double salarioAumentado = emp.salarioPorcentaje(salario, 15);
        System.out.println("Salario con porcentaje= "+ salarioAumentado);

        double salarioAnual = emp.salarioAnual(salarioAumentado);
        System.out.println("Salario Anual= "+ salarioAnual);

    }
    public static void ejercicio3 ()
    {
        int cantidad = 19;
        double precioUnitario = 300;

        String descripcion = "Comestible";
        Venta item = new Venta(cantidad, precioUnitario);
        item = new Venta(descripcion);

        double precioTotal = item.calcularPrecioCantidadUnitario(cantidad, precioUnitario);

        item.mostrar(item.getId(), descripcion, cantidad, precioUnitario, precioTotal);
    }
    public static void ejercico4 ()
    {
        double balanceInicial = 5000;

        Cuenta banco = new Cuenta(balanceInicial);
        banco = new Cuenta("Tomas");

        double balance = banco.credito2(balanceInicial, 3000);
        banco.setBalance(balance);
        System.out.println("Tu balance con el dinero depositado es de: " + banco.getBalance());

        double balanceDebito = banco.debito2(banco.getBalance(), 5000);
        banco.setBalance(balanceDebito);
        System.out.println("Tu balance con el dinero retirado es de: " + banco.getBalance());

        banco.mostrarCaracteristicasCuenta();
    }
    ///No se utilizar los constructores que no tienen parametros.
    public static void ejercicio5 ()
    {
        Scanner scan = new Scanner(System.in);
        Hora hora = new Hora();

        int hora2;
        int minuto;
        int segundo;

        do
        {
            System.out.println("Ingrese una hora.");
            hora2 = scan.nextInt();
        }while(hora.validarHora(hora2) == 1);
        do
        {
            System.out.println("Ingrese un minuto.");
            minuto = scan.nextInt();
        }while(hora.validarMinutoSegundo(minuto) == 1);
        do
        {
            System.out.println("Ingrese un segundo.");
            segundo = scan.nextInt();
        }while(hora.validarMinutoSegundo(segundo)== 1);

        hora.setHora(hora2);
        hora.setMinuto(minuto);
        hora.setSegundo(segundo);

        hora.imprimirHora();
        segundo = hora.retrocederUnSegundo();
        hora.setSegundo(segundo);
        System.out.println("Segundo retrocedido: " + segundo);
        segundo = hora.avanzarUnSegundo();
        hora.setSegundo(segundo);
        System.out.println("Segundo avanzado: " + segundo);
    }
}