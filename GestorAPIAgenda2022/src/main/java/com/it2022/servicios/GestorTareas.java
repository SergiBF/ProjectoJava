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
        if(tarea.isValid()) {
            this.repoTareas.addTarea(tarea);
        }
    }

    public List<Tarea> buscaTareasPorUsuarioYFecha(String fecha, int idUsuario){
        return repoTareas.buscarTareasPorUsuario(idUsuario,fecha);
    }




    public Tarea obtenerTarea(Long id){

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


    public List<Tarea> getRepo(){
        return repoTareas.getRepos();
    }



    public Tarea actualizarTarea(Long id, Tarea modTarea){
        if (id>=0){
            Tarea tar = repoTareas.buscadorDeTareas(id);
            tar = modTarea;
            if(tar != null){
                if(modTarea.isValid()) {
                    tar.setDetalle(modTarea.getDetalle());
                    tar.setFecha(modTarea.getFecha());
                    tar.setHora(modTarea.getHora());
                    tar.setParticipante(modTarea.getParticipante());
                    tar.setTitulo(modTarea.getTitulo());
                    return repoTareas.actualizarTarea(tar);
                }
            }else return null;
        }
        return null;
    }

    public boolean deleteTarea(Long id){
        if(id>=0){
            return repoTareas.deleteTarea(id);
        }
        return false;
    }



}








