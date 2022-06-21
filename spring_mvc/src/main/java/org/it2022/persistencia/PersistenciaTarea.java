package org.it2022.persistencia;

import org.it2022.modelo.*;

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
        Usuario usuario = new Usuario("Juan", "Rodríguez", "calle 1", "email@email.com", 01);
        Usuario usuario2 = new Usuario("Sergi", "Boronat", "calle 2", "Sergi@email.com", 02);
        ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
        ArrayList<Participante> listaParticipantes2 = new ArrayList<Participante>();
        listaParticipantes.add(new Participante(00, "Pedro", "Martinez", "calle Font", "participante@email.com"));
        listaParticipantes2.add(new Participante(00, "Pepe", "Pozo", "calle Roc Boronat", "participante123@email.com"));
        listaParticipantes2.add(new Participante(00, "Luis", "Perez", "Calle Nueva del río", "participante444@email.com"));

        this.repoTarea.add(new Tarea(00, "Cita con el dentista", "20/06/2022", "17:30", agenda, usuario, listaParticipantes, "Cita dentista"));
        this.repoTarea.add(new Tarea(01, "Llevar el coche al taller", "16/06/2022", "18:00", agenda, usuario, listaParticipantes, "Reparacion coche"));
        this.repoTarea.add(new Tarea(04, "hacer la compra del mes", "16/05/2022", "19:00", agenda, usuario2, listaParticipantes, "Ir a comprar"));
        this.repoTarea.add(new Tarea(05, "Cine", "16/10/2022", "22:00", agenda, usuario, listaParticipantes2, "ir al cine"));
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
     * @param fecha          le llega un string de fecha
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
     *  Metodo para encontrar todas las tareas donde participa un usuario en una fecha indicada
     * @param idUser  Recibe el ID del usuario
     * @param fecha   Recibe la fecha de las tareas
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
     * @param tarea Esto és el objto Tarea que se añade a la lista
     */
    public void addTarea(Tarea tarea){
        for(Tarea t : this.repoTarea){
            if(t.getId()==tarea.getId()){
                tarea.setId(repoTarea.size()+1);
            }
        }
        this.repoTarea.add(tarea);
    }

    public void modificarTarea(String fecha, String descrip){
        for(Tarea t : this.repoTarea){
            if(t.getFecha().equals(fecha)){
                t.setDetalle(descrip);
            }
        }
    }

    /**
     * Método que te devuevle las tareas de un mes dado el usuario y el mes
     *
     * @param idUser recibe un integer como identificador de usuario
     * @param fecha  recibe un String como fecha
     * @return devuelve el listado de tareas por mes para el usuario
     */
    public List<Tarea> buscarTareasPorMes(int idUser, String fecha) {
        List<Tarea> listaEncontrados = new ArrayList();
        for (Tarea t : repoTarea) {
            if (t.getFecha().substring(03, 05).equals(fecha.substring(03, 05)) && t.getUsuario().getIDusuario() == idUser) {
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