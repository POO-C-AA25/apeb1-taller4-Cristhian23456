
import java.util.Scanner;
public class Problema5_Ejecutor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Problema5_Gimnasio gym = new Problema5_Gimnasio();
        int nimClient, duracion;
        String nombre, tipoEjercicio;
        boolean completado;
        System.out.print("¿Cuantos clientes desea registrar?: ");
        int n =input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nCliente #" + (i + 1));
            input.nextLine();
            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Tipo de ejercicio (Cardio, Fuerza, Estiramiento): ");
            tipoEjercicio = input.nextLine();
            System.out.print("Duración (minutos): ");
            duracion = input.nextInt();
            System.out.print("¿Completó la rutina? (true/false): ");
            completado = input.nextBoolean();

            gym.agregarCliente(new Problema5_Cliente(nombre, tipoEjercicio, duracion, completado));
        }

        System.out.println("\nEstadísticas ");
        gym.mostrarEstadisticas();
    }
}
