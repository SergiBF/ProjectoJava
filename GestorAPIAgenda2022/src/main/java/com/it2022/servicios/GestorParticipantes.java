package com.it2022.servicios;

import com.it2022.modelo.Tarea;

import java.util.ArrayList;


public class GestorParticipantes {

    private final ArrayList<Tarea> almacenDeParticipantes = new ArrayList<>();

    public void addTarea(Tarea tarea) { //Permite añadir tareas a la lista del GestorTareas
        this.almacenDeParticipantes.add(tarea);
    }
}
