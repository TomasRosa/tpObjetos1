public class Hora
{
     private int hora;
     private int minuto;
     private int segundo;

    public int getHora()
    {
        return hora;
    }

    public void setHora(int hora)
    {
        this.hora = hora;
    }

    public int getMinuto()
    {
        return minuto;
    }

    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }

    public int getSegundo()
    {
        return segundo;
    }

    public void setSegundo(int segundo)
    {
        this.segundo = segundo;
    }
    public Hora ()
    {

    }
    public Hora (int hora, int minuto, int segundo)
    {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public int validarHora (int hora)
    {
        int flag = 0;

        if(hora > 23 || hora < 0)
        {
            flag = 1;
        }
        return flag;
    }
    public int validarMinutoSegundo (double minutoSegundo)
    {
        int flag = 0;
        if(minutoSegundo > 59 || minutoSegundo < 0)
        {
            flag = 1;
        }
        return flag;
    }
    public void imprimirHora ()
    {
        System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
    }
    public int avanzarUnSegundo ()
    {
        this.segundo++;
        return segundo;
    }
    public int retrocederUnSegundo()
    {
        this.segundo--;
        return segundo;
    }
}
