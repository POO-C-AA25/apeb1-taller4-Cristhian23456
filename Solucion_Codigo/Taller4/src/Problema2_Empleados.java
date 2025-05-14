public class Problema2_Empleados {
    public double salario;
    public int edad;
    public String nombre;

    public Problema2_Empleados() {
    }

    public Problema2_Empleados(double salario, int edad, String nombre) {
        this.salario = salario;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    @Override
    public String toString() {
        return "Problema2_Empleados{" + "salario=" + salario + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
    
}
