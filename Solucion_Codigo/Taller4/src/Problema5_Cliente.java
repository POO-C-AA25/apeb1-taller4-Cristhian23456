public class Problema5_Cliente {
    public String nombre;
    public String tipoEjercicio;
    public int duracion;
    public boolean completado;

    public Problema5_Cliente(String nombre, String tipoEjercicio, int duracion, boolean completado) {
        this.nombre = nombre;
        this.tipoEjercicio = tipoEjercicio;
        this.duracion = duracion;
        this.completado = completado;
    }

    public boolean rutinaCompletada() {
        return completado;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nEjercicio: " + tipoEjercicio +
               "\nDuración: " + duracion + " min" +
               "\n¿Completado?: " + (completado ? "✔ Sí" : "❌ No");
    }
}
