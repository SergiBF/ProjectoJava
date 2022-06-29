package com.it2022.modelo;

import java.util.ArrayList;

public class Calendario extends Agenda {

    private String nombreCalendario;

    public Calendario(String nombreCalendario) {
        this.nombreCalendario = nombreCalendario;
    }
    public Calendario(String nombre, ArrayList<Calendario> listaCalendario, String nombreCalendario) {
        super(nombre, listaCalendario);
        this.nombreCalendario = nombreCalendario;
    }

    public String getNombreCalendario() {
        return nombreCalendario;
    }

    public void setNombreCalendario(String nombreCalendario) {
        this.nombreCalendario = nombreCalendario;
    }

    @Override
    public String toString() {
        return "Calendario{" +
                "nombreCalendario='" + nombreCalendario + '\'' +
                '}';
    }
}
