public class Venta {

        private static int cantidadItems = 0;
        private int id;
        private String descripcion;
        private int cantidad;
        private double precioUnitario;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public double getPrecioUnitario() {
            return precioUnitario;
        }

        public void setPrecioUnitario(double precioUnitario) {
            this.precioUnitario = precioUnitario;
        }

        public Venta (String descripcion)
        {
            this.cantidadItems++;
            this.id = cantidadItems;
            this.descripcion = descripcion;
        }
        public Venta (int cantidad, double precioUnitario)
        {
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
        }
        public double calcularPrecioCantidadUnitario (int cantidad, double precioUnitario)
        {
            double precioTotal = cantidad * precioUnitario;
            return precioTotal;
        }

        public void mostrar (int id, String descripcion, int cantidad, double precioUnitario, double precioTotal)
        {
            System.out.println("Empleado[ID= " + id + ", DESCRIPCION= " + descripcion + ", CANTIDAD= " + cantidad + ", PRECIO UNITARIO= " + precioUnitario + ", PRECIO TOTAL= "+ precioTotal + "]");
        }

}
