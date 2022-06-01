package org.it2022.modelo;

import java.util.ArrayList;
import java.util.Date;

public class FichaDia {

    private ArrayList<Tarea> listaTarea;
    private Date hora;

    public FichaDia(ArrayList<Tarea> listaTarea, Date hora) {
        this.listaTarea = listaTarea;
        this.hora = hora;
    }

    public ArrayList<Tarea> getListaTarea() {
        return listaTarea;
    }

    public void setListaTarea(ArrayList<Tarea> listaTarea) {
        this.listaTarea = listaTarea;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
}
