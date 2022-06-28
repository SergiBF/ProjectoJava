package com.it2022.persistencia;

import com.it2022.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public interface PersistenciaTareaInf {

    List<Tarea> tarea = new ArrayList();

    public Tarea buscadorDeTareas(String fecha, int IDparticipante);

    public List<Tarea> buscarTareasPorUsuario(int idUser, String fecha);

    public void addTarea(Tarea addTarea);

    public void actualizarTarea(Tarea tarNuevosDatos);

    public Tarea buscadorDeTareas(int idTarea);
}
