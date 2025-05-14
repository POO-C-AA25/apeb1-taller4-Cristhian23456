import java.util.ArrayList;
public class Problema3_Autobus {
    public ArrayList<Problema3_Estudiantes> estudiante;

    public Problema3_Autobus() {
        estudiante = new ArrayList<>();
    }

    public void agregarEstudiante(Problema3_Estudiantes estado){
        estudiante.add(estado);
    }
    
    public void verificarIngreso(){
        int vigente=0, noVigente=0;
        for (Problema3_Estudiantes estado : estudiante) {
            System.out.println(estado.toString());
            if (estado.permisoVigente) {
                System.out.println("Permiso aun Vigente");
                vigente++;
            }else{
                System.out.println("Permiso NO VIGENTE");
                noVigente++;
            }
        }
        System.out.println("Informe de Permisos");
        System.out.println("Con permisos Vigentes: "+ vigente);
        System.out.println("Con permisos NO ViGENTES: "+ noVigente);
    }
    
    
}
