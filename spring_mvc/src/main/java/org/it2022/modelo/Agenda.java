package org.it2022.modelo;

import org.it2022.persistencia.PersistenciaTarea;

import java.util.ArrayList;
import java.util.Date;

public class Agenda {

    private String nombre;
    private ArrayList<Calendario> listaCalendario;

    public Agenda() {
    }

    public Agenda(String nombre, ArrayList<Calendario> listaCalendario) {
        this.nombre = nombre;
        this.listaCalendario = listaCalendario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Calendario> getListaCalendario() {
        return listaCalendario;
    }

    public void setListaCalendario(ArrayList<Calendario> listaCalendario) {
        this.listaCalendario = listaCalendario;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nombre='" + nombre + '\'' +
                ", listaCalendario=" + listaCalendario +
                '}';
    }
}
