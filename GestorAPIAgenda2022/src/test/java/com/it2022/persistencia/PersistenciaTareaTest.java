package com.it2022.persistencia;

import com.it2022.modelo.Tarea;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@ComponentScan("com.it2022.persistencia")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PersistenciaTareaTest {

    @Autowired
    private PersistenciaTarea pt;

    @Test
    void getRepoTarea() {
        List<Tarea> lista= pt.getRepoTarea();
        System.out.println(lista);
    }
}