package com.it2022.persistencia;

import com.it2022.modelo.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UsuarioManager {
    @PersistenceContext
    private EntityManager em;

    public UsuarioManager() {
    }

    public List<Usuario> getUsuarios() throws Exception {
        List<Usuario> listaU = em.createQuery("FROM Usuario").getResultList();
        return listaU;
    }

}
