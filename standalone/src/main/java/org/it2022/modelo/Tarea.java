package org.it2022.modelo;

import org.it2022.persistencia.PersistenciaTarea;

import java.util.ArrayList;

public class Tarea {

    private int id;
    private String detalle;
    private String fecha;
    private String hora;
    private String participante;
    private Agenda agenda;
    private Usuario usuario;
    private ArrayList<Participante> listaParticipantes;

    public Tarea(int id, String detalle, String fecha, String hora, Agenda agenda, Usuario usuario, ArrayList<Participante> listaParticipantes) {
        this.id = id;
        this.detalle = detalle;
        this.fecha = fecha;
        this.hora = hora;
        this.agenda = agenda;
        this.usuario = usuario;
        this.listaParticipantes = listaParticipantes;
    }

    public String getParticipante() {
        return participante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", detalle='" + detalle + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", participante='" + participante + '\'' +
                ", agenda=" + agenda +
                ", usuario=" + usuario +
                ", litaPerContacto=" + listaParticipantes +
                '}';
    }
}


