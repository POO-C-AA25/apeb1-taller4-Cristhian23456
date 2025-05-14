
public class Problema1_Descuentos {

    public int cantProducto;
    public double precio;

    public Problema1_Descuentos() {

    }

    public Problema1_Descuentos(int cantProducto, double precio) {
        this.cantProducto = cantProducto;
        this.precio = precio;
    }

    public double calcularDescuento(int cantProducto, double precio) {
        return (this.precio >= 1000 && this.cantProducto >= 10) ? 0.10 * (this.precio * this.cantProducto) : 0.05 * (this.precio * this.cantProducto);
    }

    public double calcularPrecioFinal() {
        return (this.precio * this.cantProducto) - calcularDescuento(cantProducto, precio);
    }

    @Override
    public String toString() {
        return "Precio unitario: $" + precio
                + "\nCantidad: " + cantProducto
                + "\nDescuento aplicado: $" + calcularDescuento(cantProducto, precio)
                + "\nPrecio final: $" + calcularPrecioFinal();
    }
}
