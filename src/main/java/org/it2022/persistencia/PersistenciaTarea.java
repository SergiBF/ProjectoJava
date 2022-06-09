package org.it2022.persistencia;

import org.it2022.modelo.*;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named
public class PersistenciaTarea implements PersistenciaTareaInf {

    //Patrón Singleton
    private static PersistenciaTarea persi = new PersistenciaTarea();

    private ArrayList<Tarea> tarea = new ArrayList();

    //Patrón Singleton creando el constructor de forma privada
    private PersistenciaTarea() {
        Calendario ca = new Calendario("Trabajo");
        ArrayList<Calendario> listaCalendario = new ArrayList();
        listaCalendario.add(ca);
        Agenda agenda = new Agenda("Personal", listaCalendario);
        Usuario usuario = new Usuario("Juan", "Rodríguez", "calle 1", "email@email.com", 01);
        ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
        listaParticipantes.add(new Participante(00, "Pedro", "Martinez", "calle Font", "participante@email.com"));

        this.tarea.add(new Tarea(00, "Cita con el dentista", "20/06/2022", "17:30", agenda, usuario, listaParticipantes));
        this.tarea.add(new Tarea(01, "Llevar el coche al taller", "16/06/2022", "18:00", agenda, usuario, listaParticipantes));
    }

    //Patrón Singleton
    public static PersistenciaTarea getInstance() {
        return persi;
    }

    public List<Tarea> getTarea() {
        return tarea;
    }

    public void setTarea(List<Tarea> tarea) {
        tarea = tarea;
    }

    public static PersistenciaTarea getPersi() {
        return persi;
    }

    public static void setPersi(PersistenciaTarea persi) {
        PersistenciaTarea.persi = persi;
    }

    /**
     * Metodo para ontener una tarea a partir de la fecha y el ID del participante
     *
     * @param fecha          le llega un string de fecha
     * @param idTarea le llega el ID de un participante
     * @return devuelve un objeto tipo tarea si la encuentra o un null si no
     */

    public Tarea buscadorDeTareas(String fecha, int idTarea) {
        for (Tarea t : tarea) {
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
        for (Tarea t : tarea) {
            if (t.getId() == idTarea) {
                System.out.println(t);
                return t;
            }
        }
        return null;
    }

    /**
     *  Metodo para encontrar todas las tareas donde participa un usuario en una fecha indicada
     * @param idUser  Recibe el ID del usuario
     * @param fecha   Recibe la fecha de las tareas
     * @return devuelve una lista de tareas o un null
     */

    public List<Tarea> buscarTareasPorUsuario(int idUser, String fecha) {
        List<Tarea> listaEncontrados = new ArrayList();
        for (Tarea t : tarea) {
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
}
