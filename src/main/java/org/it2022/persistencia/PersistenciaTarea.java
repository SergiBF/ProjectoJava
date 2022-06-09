package org.it2022.persistencia;

import org.it2022.modelo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersistenciaTarea {

    //Patrón Singleton
    private static PersistenciaTarea persi = new PersistenciaTarea();

    private List<Tarea> tarea = new ArrayList();

    //Patrón Singleton creando el constructor de forma privada
    private PersistenciaTarea() {
        Calendario ca = new Calendario("Trabajo");
        ArrayList<Calendario> listaCalendario = new ArrayList();
        listaCalendario.add(ca);
        Agenda agenda = new Agenda("Personal", listaCalendario);
        Persona persona = new Persona("Juan", "Rodríguez", "calle 1", "email@email.com");
        ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
        listaParticipantes.add(new Participante(00, "Pedro", "Martinez", "calle Font", "participante@email.com"));

        this.tarea.add(new Tarea(00, "Cita con el dentista", "20/06/2022", "17:30", agenda, persona, listaParticipantes ));
        this.tarea.add(new Tarea(01, "Llevar el coche al taller", "16/06/2022", "18:00", agenda, persona, listaParticipantes));
    }

    //Patrón Singleton
    public static PersistenciaTarea getInstance(){
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


    public Tarea buscadorDeTareas(String fecha, int IDparticipante){
        for (Tarea t : tarea) {
            if (t.getFecha().equals(fecha) && t.getId() == IDparticipante) {
                System.out.println(t);
                return t;
            }
        }return null;
    }

    /**
     * Método para obtener la tarea mediante su ID
     * @param IDparticipante recibe un integer
     * @return devuelve un objeto tarea
     */
    public Tarea buscadorDeTareas(int IDparticipante){
        for (Tarea t : tarea) {
            if (t.getId() == IDparticipante) {
                System.out.println(t);
                return t;
            }
        }return null;
    }

}
