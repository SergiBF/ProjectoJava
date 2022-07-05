package com.it2022.persistencia;

import com.it2022.modelo.*;
import com.it2022.modelo.*;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class PersistenciaTarea implements PersistenciaTareaInf {

    //Patrón Singleton
    // private static PersistenciaTarea persi = new PersistenciaTarea();

    private ArrayList<Tarea> repoTarea = new ArrayList();

    //Patrón Singleton creando el constructor de forma privada
    public PersistenciaTarea() {
        Calendario ca = new Calendario("Trabajo");
        ArrayList<Calendario> listaCalendario = new ArrayList();
        listaCalendario.add(ca);
        Agenda agenda = new Agenda("Personal", listaCalendario);
        Usuario usuario = new Usuario(1, "Juan", "Rodríguez", "email@email.com");
        ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
        listaParticipantes.add(new Participante(0, "Pedro", "Martinez", "participante@email.com"));

        this.repoTarea.add(new Tarea(0, "Cita con el dentista", "20/06/2022", "17:30", agenda, usuario, listaParticipantes, "Cita dentista"));
        this.repoTarea.add(new Tarea(1, "Llevar el coche al taller", "16/06/2022", "18:00", agenda, usuario, listaParticipantes, "Reparacion coche"));

    }

    //Patrón Singleton

    public List<Tarea> getRepoTarea() {
        return repoTarea;
    }

    public void setRepoTarea(List<Tarea> repoTarea) {
        repoTarea = repoTarea;
    }


    /**
     * Metodo para ontener una tarea a partir de la fecha y el ID del participante
     *
     * @param fecha   le llega un string de fecha
     * @param idTarea le llega el ID de un participante
     * @return devuelve un objeto tipo tarea si la encuentra o un null si no
     */

    public Tarea buscadorDeTareas(String fecha, int idTarea) {
        for (Tarea t : repoTarea) {
            if (t.getFecha().equals(fecha) && t.getId() == idTarea) {
                System.out.println(t);
                return t;
            }
        }
        return null;
    }

    /**
     * Método para obtener la tarea mediante su ID
     *
     * @param idTarea recibe un integer
     * @return devuelve un objeto tarea si la encuentra, si no devuelve un nulo
     */

    public Tarea buscadorDeTareas(int idTarea) {
        for (Tarea t : repoTarea) {
            if (t.getId() == idTarea) {
                System.out.println(t);
                return t;
            }
        }
        return null;
    }

    /**
     * Metodo para encontrar todas las tareas donde participa un usuario en una fecha indicada
     *
     * @param idUser Recibe el ID del usuario
     * @param fecha  Recibe la fecha de las tareas
     * @return devuelve una lista de tareas o un null
     */

    public List<Tarea> buscarTareasPorUsuario(int idUser, String fecha) {
        List<Tarea> listaEncontrados = new ArrayList();
        for (Tarea t : repoTarea) {
            if (t.getUsuario().getIDusuario() == idUser) {
                listaEncontrados.add(t);
            }
        }
        if (listaEncontrados.isEmpty()) {
            return null;
        } else {
            return listaEncontrados;
        }
    }

    /**
     * Esta funciona le pasan un objeto Tarea para añadirlo al repositorio repoTarea, tambien si esta nueva tarea tiene el mismo ID que otra
     * lo cambia si es el caso.
     *
     * @param tarea Esto és el objto Tarea que se añade a la lista
     */
    public void addTarea(Tarea tarea) {
        for (Tarea t : this.repoTarea) {
            if (t.getId() == tarea.getId()) {
                tarea.setId(repoTarea.size() + 1);
            }
        }
        this.repoTarea.add(tarea);
    }


    /**
     * @param tarNuevosDatos
     */

    public Tarea actualizarTarea(Tarea tarNuevosDatos) {
        for (Tarea tr : repoTarea) {
            if (tr.getId() == tarNuevosDatos.getId()) {
                repoTarea.remove(tr);
                repoTarea.add(tarNuevosDatos);
                return tarNuevosDatos;
            }
        }
        return null;

    }

    /**
     * Esta funcion solo devuelve el repositorio de Tareas
     *
     * @return
     */
    public List<Tarea> getRepos() {
        return repoTarea;

    }

    public boolean deleteTarea(int id) {
        for (Tarea tr : repoTarea) {
            if (tr.getId() == id) {
                repoTarea.remove(tr);
                return true;
            }
        }

        return false;


    }

}
