package com.it2022.servicios;

import com.it2022.modelo.Tarea;
import com.it2022.persistencia.PersistenciaTareaInf;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
@Named
public class GestorTareas implements GestorTareasInf {

    @Inject
    private  PersistenciaTareaInf repoTareas;

    public void addTarea(Tarea tarea) { //Permite añadir tareas a la lista del GestorTareas
        this.repoTareas.addTarea(tarea);
    }

    public List<Tarea> buscaTareasPorUsuarioYFecha(String fecha, int idUsuario){
        return repoTareas.buscarTareasPorUsuario(idUsuario,fecha);
    }



    public void actualizarTarea(Tarea tarNuevosDatos){
        repoTareas.actualizarTarea(tarNuevosDatos);
    }

    public Tarea obtenerTarea(int id){

        return repoTareas.buscadorDeTareas(id);

    }



    @Override
    public String toString() {
        return "GestorTareas{}";
    }

    public PersistenciaTareaInf getRepoTareas() {
        return repoTareas;
    }

    public void setRepoTareas(PersistenciaTareaInf repoTareas) {
        this.repoTareas = repoTareas;
    }
}








