package org.it2022.persistencia;

import org.it2022.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public interface PersistenciaTareaInf {

    List<Tarea> tarea = new ArrayList();

    public Tarea buscadorDeTareas(String fecha, int IDparticipante);

}
