package com.it2022.persistencia;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ComponentScan("com.it2022.persistencia")
class UsuarioManagerTest {


    @Test
    void getUsuarios() {

    }
}