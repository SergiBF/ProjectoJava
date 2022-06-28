package com.it2022.servicios;

import com.it2022.modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public interface GestorTareasInf {

    public List<Tarea> almacenDeTareas = new ArrayList<>();

    public void addTarea(Tarea tarea);

    public List<Tarea> buscaTareasPorUsuarioYFecha(String fecha, int idUsuario);


    public Tarea obtenerTarea(int id);

    public void actualizarTarea(Tarea tarNuevosDatos);

}
