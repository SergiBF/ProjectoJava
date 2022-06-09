package org.it2022.servicios;

import org.it2022.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public interface GestorTareasInf {

    public  final List<Tarea> almacenDeTareas = new ArrayList<>();

    public void addTarea(Tarea tarea);

}
