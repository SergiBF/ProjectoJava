package org.it2022.persistencia;

import org.it2022.modelo.Tarea;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersistenciaTarea {

    private List<Tarea> tarea = new ArrayList();

    public PersistenciaTarea() {
        this.tarea.add(new Tarea(00, "Cita con el dentista", "20/06/2022", "17:30", "Pedro Martinez"));
        this.tarea.add(new Tarea(01, "Llevar el coche al taller", "16/06/2022", "18:00", "Luis Caballero"));
    }

    public List<Tarea> getTarea() {
        return tarea;
    }

    public void setTarea(List<Tarea> tarea) {
        tarea = tarea;
    }
}
