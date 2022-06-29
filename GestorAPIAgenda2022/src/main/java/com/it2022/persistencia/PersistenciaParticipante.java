package com.it2022.persistencia;

import com.it2022.modelo.Participante;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class PersistenciaParticipante {
    //Patrón Singleton

    private ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();

    //Patrón Singleton creando el constructor de forma privada
    private PersistenciaParticipante() {

        listaParticipantes.add(new Participante(0, "Pedro", "Martinez", "participante@email.com"));
        listaParticipantes.add(new Participante(1, "María", "Gómez", "mariaGomez@terra.es"));
        listaParticipantes.add(new Participante(2, "Héctor", "Olivares", "HOliv@yahoo.es"));

    }


    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }


    public List<Participante> getAll() {
        return listaParticipantes;
    }


    public void almacenParticipantes(Participante newParticipante) {
        int newId = listaParticipantes.size() + 1;
        newParticipante.setId(newId);
        listaParticipantes.add(newParticipante);
        System.out.println("Hola desde Persistencia");
    }

    public Boolean deleteParticipante(int id) {
        for (Participante unPart : listaParticipantes) {
            if (unPart.getId() == id) {
                listaParticipantes.remove(unPart);
                return true;
            }
        }
        return false;
    }

    public Participante ediciónParticipanteAModificar(Participante participanteAModificar) {
        //recorremos el repositorio
        for (Participante unPart : listaParticipantes) {
            //Si el Id se encuentra en el repo
            if (unPart.getId() == participanteAModificar.getId()) {
                listaParticipantes.remove(unPart);
                listaParticipantes.add(participanteAModificar);
                return participanteAModificar;
            }
        }
        return null;
    }

    public Participante cargarParticipante(int id) {
        for (Participante unPart : listaParticipantes) {
            if (unPart.getId() == id) return unPart;
        }
        return null;
    }
}


