package org.it2022.modelo;

import org.it2022.persistencia.PersistenciaTarea;

import java.util.ArrayList;
import java.util.Date;

public class Tarea {

    private int id;
    private String detalle;
    private String fecha;
    private String hora;
    private String participante;
    private Agenda agenda;
    private Persona persona;
    private ArrayList<PersistenciaTarea> listaPersistenciaTarea;
    private ArrayList<Participante> litaPerContacto;


    public Tarea(Agenda agenda, Persona persona, ArrayList<PersistenciaTarea> listaPersistenciaTarea, ArrayList<Participante> litaPerContacto, String fecha) {
        this.agenda = agenda;
        this.persona = persona;
        this.listaPersistenciaTarea = listaPersistenciaTarea;
        this.litaPerContacto = litaPerContacto;
        this.fecha = fecha;
    }


    public Tarea(int id, String detalle, String fecha, String hora, String participante) {
        this.id = id;
        this.detalle = detalle;
        this.fecha = fecha;
        this.hora = hora;
        this.participante = participante;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ArrayList<PersistenciaTarea> getListaPersistenciaTarea() {
        return listaPersistenciaTarea;
    }

    public void setListaPersistenciaTarea(ArrayList<PersistenciaTarea> listaPersistenciaTarea) {
        this.listaPersistenciaTarea = listaPersistenciaTarea;
    }

    public ArrayList<Participante> getLitaPerContacto() {
        return litaPerContacto;
    }

    public void setLitaPerContacto(ArrayList<Participante> litaPerContacto) {
        this.litaPerContacto = litaPerContacto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}


