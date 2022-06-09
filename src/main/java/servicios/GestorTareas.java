package servicios;

import org.it2022.modelo.Tarea;
import org.it2022.persistencia.PersistenciaTarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GestorTareas {

    private final List<Tarea> almacenDeTareas = new ArrayList<>();

    public void addTarea(Tarea tarea) { //Permite añadir tareas a la lista del GestorTareas
        this.almacenDeTareas.add(tarea);
    }


    @Override
    public String toString() {
        return "GestorTareas{}";
    }
}








