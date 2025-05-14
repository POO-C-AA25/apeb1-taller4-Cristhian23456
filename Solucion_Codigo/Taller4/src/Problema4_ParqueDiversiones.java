import java.util.ArrayList;
public class Problema4_ParqueDiversiones {
      public  ArrayList<Problema4_Visitante> visitantes;
    
    public void agregarVisitante(Problema4_Visitante vist) {
        visitantes.add(vist);
    }

    public void verResumen() {
        int permitidos = 0;

        for (Problema4_Visitante vist : visitantes) {
            System.out.println(vist.toString());
            System.out.println();
            if (vist.cumpleRequisitos()) {
                permitidos++;
            }
        }

        System.out.println(" Resumen ");
        System.out.println("-- Total visitantes: " + visitantes.size());
        System.out.println("-- Acceso Completo: " + permitidos);
        System.out.println("-- Acceso Limitado: " + (visitantes.size() - permitidos));
     }
}
