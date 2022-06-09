package org.it2022;

import org.it2022.modelo.*;
import org.it2022.persistencia.PersistenciaTarea;


public class App {
    public static void main(String[] args) {

        //Patrón Singleton
        PersistenciaTarea persi = PersistenciaTarea.getInstance();

        System.out.println(persi.getTarea().get(0).toString());
        System.out.println(persi.getTarea().get(1).toString());

    }
}
