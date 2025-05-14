import java.util.ArrayList;
public class Problema5_Gimnasio {
    private ArrayList<Problema5_Cliente> clientes;

    public Problema5_Gimnasio() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Problema5_Cliente clien) {
        clientes.add(clien);
    }

    public void mostrarEstadisticas() {
        int total = clientes.size();
        int completados = 0;
        int sumaTiempo = 0;

        for (Problema5_Cliente clien : clientes) {
            System.out.println(clien.toString());
            System.out.println();
            if (clien.rutinaCompletada()) {
                completados++;
            }
            sumaTiempo += clien.getDuracion();
        }

        double promedio = total > 0 ? (double) sumaTiempo / total : 0;

        System.out.println("--- Resumen Gimnasio ---");
        System.out.println("Total clientes: " + total);
        System.out.println("Rutinas completadas: " + completados);
        System.out.println("Promedio tiempo invertido: " + promedio + " min");
    }
}
