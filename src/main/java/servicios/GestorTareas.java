package servicios;

import org.it2022.modelo.Tarea;
import org.it2022.persistencia.PersistenciaTarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GestorTareas {

    private final List<Tarea> almacenDeTareas = new List<Tarea>();

    private ArrayList<PersistenciaTarea> getAlmacenDeTareas() {
        return almacenDeTareas;
    }

    private void imprimirTareasDia(String fecha) {

        PersistenciaTarea tareasDia = getAlmacenDeTareas().get();

        Scanner fechaTareasDia = new Scanner(System.in);

        while (almacenDeTareas > 0) {
            System.out.println("Ingrese la fecha cuyas tareas quiere visualizar, siguiendo el siguiente formato: dd/mm/aaaa, por favor");
            String dia = fechaTareasDia.next();

            if (!Objects.equals(dia, tareasDia)) {
                System.out.println("No tiene tareas para mostrar en esa fecha");
            } else {
                System.out.println(getAlmacenDeTareas());
            }
        }


    }

}

    @Override
    public String toString() {
        return "GestorTareas{}";
    }
}