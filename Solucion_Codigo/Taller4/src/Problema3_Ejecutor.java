
import java.util.Scanner;
public class Problema3_Ejecutor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Problema3_Autobus autobus= new Problema3_Autobus();
        int numEst;
        boolean permiso;
        String nombre, grado;
        System.out.print("Ingrese el numero de pasajeros a registrar: ");
        numEst=input.nextInt();
        for (int i = 0; i < numEst; i++) {
            System.out.println("\n Estudiante #"+(i+1));
            input.nextLine();
            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Grado: ");
            grado = input.nextLine();
            System.out.print("¿Tiene permiso vigente? (true/false): ");
            permiso = input.nextBoolean();
        
            autobus.agregarEstudiante(new Problema3_Estudiantes(nombre,grado, permiso));
        }
        System.out.println("Verificacion");
        autobus.verificarIngreso();
        
    }
}
