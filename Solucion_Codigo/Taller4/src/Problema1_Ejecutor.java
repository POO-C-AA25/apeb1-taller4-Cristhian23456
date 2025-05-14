
import java.util.Scanner;

public class Problema1_Ejecutor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantProducto;
        double precio;
        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();

        System.out.print("Ingrese la cantidad del producto: ");
        cantProducto = input.nextInt();

        Problema1_Descuentos descuento = new Problema1_Descuentos(cantProducto, precio);
        System.out.println("Detalles de la compra");
        System.out.println(descuento.toString());
    }
}
