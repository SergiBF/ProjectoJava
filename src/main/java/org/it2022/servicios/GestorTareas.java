package org.it2022.servicios;

import org.it2022.modelo.Tarea;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
@Named
public class GestorTareas implements GestorTareasInf {

    // private final List<Tarea> almacenDeTareas = new ArrayList<>();
    //private repo;

    public void addTarea(Tarea tarea) { //Permite añadir tareas a la lista del GestorTareas
        // this.almacenDeTareas.add(tarea);
    }

    public List<Tarea> buscaTareasPorUsuarioYFecha(String fecha, int idUsuario){
        //return repo.buscarTareasPorUsuario(idUsuario,fecha);
        return null;
    }


    @Override
    public String toString() {
        return "GestorTareas{}";
    }
}








