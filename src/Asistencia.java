import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
public class Asistencia {
    public static void main(String[] args) {
        List<String> listaAsistencia = new ArrayList<>();

        listaAsistencia.add("Juan Pérez");
        listaAsistencia.add("María García");
        listaAsistencia.add("Carlos Ruiz");
        listaAsistencia.add("Juan Pérez");
        listaAsistencia.add("Ana López");
        listaAsistencia.add("María García");
        listaAsistencia.add("Luis Torres");
        listaAsistencia.add("Juan Pérez");
        listaAsistencia.add("Elena Gómez");
        listaAsistencia.add("Carlos Ruiz");

        System.out.println("Lista con el problema: " + listaAsistencia);
//Cambiamos la lista a HashSet para eliminar los elementos duplicados
        HashSet<String> listaSinDuplicados = new HashSet<>(listaAsistencia);

        System.out.println("Lista sin el problema: " + listaSinDuplicados);

    }
}