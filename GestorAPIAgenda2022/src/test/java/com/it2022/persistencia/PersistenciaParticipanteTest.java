package com.it2022.persistencia;

import com.it2022.modelo.Participante;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@ComponentScan("com.it2022.persistencia")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PersistenciaParticipanteTest {

    @Autowired
    private PersistenciaParticipante repoP;

    @Test
    void getListaParticipantes() {
        List<Participante>  listaP = repoP.getListaParticipantes();
        System.out.println(listaP);
    }

    @Test
    void almacenParticipantes() {
    }

    @Test
    void deleteParticipante() {
    }

    @Test
    void ediciónParticipanteAModificar() {
    }

    @Test
    void cargarParticipante() {
    }
}