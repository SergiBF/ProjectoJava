package com.it2022.modelo;

import java.util.ArrayList;

public class Tarea {

    private int id;
    private String detalle;

    private String titulo;
    private String fecha;
    private String hora;
    private String participante;
    private Agenda agenda;
    private Usuario usuario;
    private ArrayList<Participante> listaParticipantes;

    public Tarea(int id, String detalle, String fecha, String hora, Agenda agenda, Usuario usuario, ArrayList<Participante> listaParticipantes, String titulo) {
        this.id = id;
        this.detalle = detalle;
        this.fecha = fecha;
        this.hora = hora;
        this.agenda = agenda;
        this.usuario = usuario;
        this.listaParticipantes = listaParticipantes;
        this.titulo = titulo;
    }

    public Tarea(){

    }
    public Tarea(int id, String detalle, String fecha, String hora){
        this.id = id;
        this.detalle = detalle;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Tarea(String detalleMod) {
        this.detalle = detalleMod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
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
                ", titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", participante='" + participante + '\'' +
                ", agenda=" + agenda +
                ", usuario=" + usuario +
                ", listaParticipantes=" + listaParticipantes +
                '}';
    }

    public boolean isValid() {
        if(this.detalle!=null && this.detalle.length()>3 && this.fecha!=null && this.fecha.length()>8
                && this.usuario!=null && this.hora!=null && this.fecha.length()>2
                && this.titulo!=null){
            return true;
        }


        return false;

    }
}


