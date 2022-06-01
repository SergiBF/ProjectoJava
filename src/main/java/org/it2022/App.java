package org.it2022;

import org.it2022.modelo.*;
import org.it2022.persistencia.PersistenciaTarea;

import java.util.ArrayList;


public class App 
{
    public static void main( String[] args )
    {

        Calendario ca = new Calendario("Calendario Trabajo");
        ArrayList<Calendario> listaCalendario= new ArrayList();
        listaCalendario.add(ca);
        Agenda agenda = new Agenda("Personal", listaCalendario);

        Persona persona = new Persona("Juan", "Rodríguez", "calle 1", "email@email.com");
        ArrayList<PersistenciaTarea> pTarea = new ArrayList<PersistenciaTarea>();
        ArrayList<Participante> participante = new ArrayList<Participante>();
        participante.add(new Participante(00, "Pedro", "Martinez", "calle Font", "participante@email.com"));
        Tarea tarea = new Tarea(agenda, persona, pTarea, participante, "17/07/2022" );


        System.out.println("Nombre de la Agenda: "+tarea.getAgenda().getNombre());
        System.out.println("Nombre de Calendario: "+ tarea.getAgenda().getListaCalendario().get(0).getNombreCalendario());
        System.out.println("Propietario de la Agenda: "+ tarea.getPersona().getNombre());
        System.out.println("Tarea 0: " + tarea.getListaPersistenciaTarea().get(0).getTarea().get(0) );
        System.out.println("Tarea 1: " + tarea.getListaPersistenciaTarea().get(0).getTarea().get(0) );

    }
}
