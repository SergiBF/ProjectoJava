package org.it2022;

import org.it2022.configuracion.ConfigProyecto;
import org.it2022.modelo.*;
import org.it2022.persistencia.PersistenciaTarea;
import org.it2022.persistencia.PersistenciaTareaInf;
import org.it2022.servicios.GestorTareasInf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigProyecto.class);
        GestorTareasInf nuevasTareas = context.getBean(GestorTareasInf.class);
        System.out.println(nuevasTareas.addTarea(context.getBean(PersistenciaTareaInf.class).buscadorDeTareas("20/06/2022", 00)));


        //Patrón Singleton
       /* PersistenciaTarea persi = PersistenciaTarea.getInstance();

        System.out.println(persi.getTarea().get(0).toString());
        System.out.println(persi.getTarea().get(1).toString());
        */
    }
}
