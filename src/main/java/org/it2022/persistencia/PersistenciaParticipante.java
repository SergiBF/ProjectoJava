package org.it2022.persistencia;

import org.it2022.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class PersistenciaParticipante {



        private static PersistenciaParticipante persiPart = new PersistenciaParticipante();

        private ArrayList<Participante> listaParticipantes = new Arraylist<Participante()>;


        private PersistenciaParticipante() {

            Persona persona = new Persona("Juan", "Rodríguez", "calle 1", "email@email.com");
            ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
            listaParticipantes.add(new Participante(00, "Pedro", "Martinez", "calle Font", "participante@email.com"));


        }

    public static PersistenciaParticipante getPersiPart() {
        return persiPart;
    }

    public static void setPersiPart(PersistenciaParticipante persiPart) {
        PersistenciaParticipante.persiPart = persiPart;
    }

    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }
}

