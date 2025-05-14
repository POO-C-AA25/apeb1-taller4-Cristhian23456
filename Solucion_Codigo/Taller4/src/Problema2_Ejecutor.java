
import java.util.Scanner;
import java.util.ArrayList;

public class Problema2_Ejecutor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Problema2_Empleados> empleado = new ArrayList<>();

        int numEmpleados, edad;
        double salario, suma = 0, promedio, nuevoSalario, porcentaje;

        System.out.print("Ingrese el numero de empleados a ingresar: ");
        numEmpleados = input.nextInt();

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.print("Nombre: ");
            input.nextLine();
            String nombre = input.nextLine();

            System.out.print("Salario: ");
            salario = input.nextDouble();

            System.out.print("Edad: ");
            edad = input.nextInt();

            empleado.add(new Problema2_Empleados(salario, edad, nombre));
        }
        System.out.println("\n--- Información de Empleados ---");
        for (Problema2_Empleados emp : empleado) {
            System.out.println(emp.toString());
            System.out.println();
        }

        for (Problema2_Empleados emp : empleado) {
            suma += emp.getSalario();
        }
        promedio = suma / empleado.size();

        System.out.print("Ingrese el porcentaje de aumento salarial: ");
        porcentaje = input.nextDouble();

        System.out.println("\n--- Aplicando aumento ---");
        for (Problema2_Empleados empl : empleado) {
            if (empl.getSalario() < promedio) {
                nuevoSalario = empl.getSalario() * (1 + porcentaje / 100);
                empl.setSalario(nuevoSalario);
            }
            System.out.println(empl.toString());
            System.out.println();
        }
    }
}
