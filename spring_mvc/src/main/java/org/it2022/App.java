package org.it2022;

import org.it2022.config.ConfigProyecto;
import org.it2022.servicios.GestorTareasInf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigProyecto.class);
        GestorTareasInf nuevasTareas = context.getBean(GestorTareasInf.class);
        System.out.println(nuevasTareas.buscaTareasPorUsuarioYFecha("20/06/2022", 01));

        System.out.println("Tareas para Juan mes junio: "+nuevasTareas.buscarTareasPorMes(01,"01/06/2022"));
        System.out.println("Tareas para Juan mes octubre: "+nuevasTareas.buscarTareasPorMes(01,"01/10/2022"));
        System.out.println("Tareas para Sergi de junio: "+nuevasTareas.buscarTareasPorMes(02,"01/06/2022"));
    }
}
