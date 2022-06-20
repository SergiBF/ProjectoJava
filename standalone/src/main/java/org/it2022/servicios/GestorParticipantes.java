package org.it2022.servicios;

import org.it2022.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;


public class GestorParticipantes {

    private final ArrayList<Tarea> almacenDeParticipantes = new ArrayList<>();

    public void addTarea(Tarea tarea) { //Permite añadir tareas a la lista del GestorTareas
        this.almacenDeParticipantes.add(tarea);
    }
}
