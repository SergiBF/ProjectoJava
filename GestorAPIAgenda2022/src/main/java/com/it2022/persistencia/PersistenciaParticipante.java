package com.it2022.persistencia;

import com.it2022.modelo.Participante;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
public class PersistenciaParticipante {
    //Patrón Singleton
    @PersistenceContext
    private EntityManager em;


    public List<Participante> getListaParticipantes() {
        List<Participante> listaParticipantes = em.createQuery("SELECT P FROM Participante P").getResultList();
        return listaParticipantes;
    }

    @Transactional
    public void almacenParticipantes(Participante newParticipante) {

        em.persist(newParticipante);

    }

    @Transactional
    public Boolean deleteParticipante(Long id) {
        Participante participanteABorrar = cargarParticipante(id);
        em.remove(participanteABorrar);
        return true;
    }
    @Transactional
    public Participante ediciónParticipanteAModificar(Participante participanteAModificar) {
        //recorremos el repositorio
        em.merge(participanteAModificar);
        return participanteAModificar;

    }

    public Participante cargarParticipante(Long id) {
        return em.find(Participante.class, id);

    }
}


