
public class Problema4_Visitante {
    public String nombre;
    public int edad;
    public double altura;
    public boolean cumpleRequisitos;

    public Problema4_Visitante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        verificarRequisitos();
    }

    private void verificarRequisitos() {
        cumpleRequisitos = (edad >= 12 && altura >= 1.50); 
    }

    public boolean cumpleRequisitos() {
        return cumpleRequisitos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nAltura: " + altura + " m" +
               "\nAcceso: " + (cumpleRequisitos ? "Acceso_Completo" : "Acceso_Limitado");
    }
}
