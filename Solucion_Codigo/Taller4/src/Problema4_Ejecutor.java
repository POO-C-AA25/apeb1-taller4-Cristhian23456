
import java.util.Scanner;
public class Problema4_Ejecutor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Problema4_ParqueDiversiones parque = new Problema4_ParqueDiversiones();
        int numVist, edad;
        double altura;
        String nombre;
        System.out.print("¿Cuantos visitantes desea registrar?: ");
        numVist = input.nextInt();

        for (int i = 0; i < numVist; i++) {
            System.out.println("\nVisitante #" + (i + 1));
            input.nextLine();
            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Edad: ");
            edad = input.nextInt();
            System.out.print("Altura (en metros): ");
            altura = input.nextDouble();

            parque.agregarVisitante(new Problema4_Visitante(nombre, edad, altura));
        }

        System.out.println("\n--- Resultados ---");
        parque.verResumen();
    }
}
