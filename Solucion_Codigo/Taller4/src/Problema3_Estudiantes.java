public class Problema3_Estudiantes {
    public String nombre;
    public String grado;
    public boolean permisoVigente;

    public Problema3_Estudiantes() {
    }

    public Problema3_Estudiantes(String nombre, String grado, boolean permisoVigente) {
        this.nombre = nombre;
        this.grado = grado;
        this.permisoVigente = permisoVigente;
    }

    public boolean observarPermisoVigente() {
        return permisoVigente;
    }

    @Override
    public String toString() {
        return "Problema3 " + "Nombre: " + nombre + ", Grado: " + grado + ", Permiso Vigente: " + (observarPermisoVigente()?"Si":"No" );
    }
    
    
    
    
}
