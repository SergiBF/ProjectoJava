package org.it2022.persistencia;

import org.it2022.modelo.Tarea;

import java.util.ArrayList;
import java.util.Date;

public class PersistenciaTarea {

    ArrayList<Tarea> tarea = new ArrayList();

    public PersistenciaTarea(ArrayList<String> tarea) {
        this.tarea.add(new Tarea(00, "Cita con el dentista", "20/06/2022", "17:30", "Pedro Martinez"));
        this.tarea.add(new Tarea(01, "Llevar el coche al taller", "16/06/2022", "18:00", "Luis Caballero"));
    }

    public ArrayList<Tarea> getTarea() {
        return tarea;
    }

    public void setTarea(ArrayList<Tarea> tarea) {
        this.tarea = tarea;
    }
}
