public class Rectangulo
{
    private double ancho;
    private double alto;

    public Rectangulo (double ancho, double alto)
    {
        this.ancho = ancho;
        this.alto = alto;
    }
    public Rectangulo ()
    {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double area (double alto, double ancho)
    {
        double area = alto * ancho;
        return area;
    }
    public double perimetro (double alto, double ancho)
    {
        double resultado = (2 * alto) + (2 * ancho);

        return resultado;
    }

}
