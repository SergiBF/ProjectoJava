package org.it2022;

import org.it2022.modelo.*;
import org.it2022.persistencia.PersistenciaTarea;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        Tarea tarea = new Tarea();

        System.out.println(tarea.getListaPersistenciaTarea().get(0).getTarea().get(0));
        System.out.println(tarea.getListaPersistenciaTarea().get(0).getTarea().get(1));

    }
}
