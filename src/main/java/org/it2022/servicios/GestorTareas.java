package org.it2022.servicios;

import org.it2022.modelo.Tarea;
import org.it2022.persistencia.PersistenciaTareaInf;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
@Named
public class GestorTareas implements GestorTareasInf {

    @Inject
    private PersistenciaTareaInf repoTareas;

    public void addTarea(Tarea tarea) { //Permite añadir tareas a la lista del GestorTareas
        // this.almacenDeTareas.add(tarea);
    }

    public List<Tarea> buscaTareasPorUsuarioYFecha(String fecha, int idUsuario){
        return repoTareas.buscarTareasPorUsuario(idUsuario,fecha);
    }


    @Override
    public String toString() {
        return "GestorTareas{}";
    }
}








