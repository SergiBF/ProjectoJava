package org.it2022.config;


import org.it2022.modelo.Tarea;
import org.it2022.persistencia.PersistenciaTarea;
import org.it2022.persistencia.PersistenciaTareaInf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;
import java.util.ArrayList;

@Configuration
@ComponentScan({"org.it2022.persistencia","org.it2022.servicios"})
public class ConfigProyecto {


}
