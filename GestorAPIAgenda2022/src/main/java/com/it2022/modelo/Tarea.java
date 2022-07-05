package com.it2022.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String detalle;
    @Column

    private String titulo;
    @Column
    private String fecha;
    @Column
    private String hora;
    @Column
    private String participante;

    @ManyToOne
    @JoinColumn(name = "agenda", nullable = false)
    private Agenda agenda;

    @ManyToOne
    @JoinColumn(name = "usuario", nullable = false)
    private Usuario usuario;
    @ManyToMany
    @JoinTable(
            name = "tarea_participantes",
            joinColumns = @JoinColumn(name = "tarea", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "participante", nullable = false)
    )
    private List<Participante> listaParticipantes;

    public Tarea(Long id, String detalle, String fecha, String hora, Agenda agenda, Usuario usuario, ArrayList<Participante> listaParticipantes, String titulo) {
        this.id = id;
        this.detalle = detalle;
        this.fecha = fecha;
        this.hora = hora;
        this.agenda = agenda;
        this.usuario = usuario;
        this.listaParticipantes = listaParticipantes;
        this.titulo = titulo;
    }

    public Tarea() {

    }

    public Tarea(Long id, String detalle, String fecha, String hora) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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


    public List<Participante> getListaParticipantes() {
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
        return "Tarea{" + "id=" + id + ", detalle='" + detalle + '\'' + ", titulo='" + titulo + '\'' + ", fecha='" + fecha + '\'' + ", hora='" + hora + '\'' + ", participante='" + participante + '\'' + ", agenda=" + agenda + ", usuario=" + usuario + ", listaParticipantes=" + listaParticipantes + '}';
    }

    public boolean isValid() {
        if (this.detalle != null && this.detalle.length() > 3 && this.fecha != null && this.fecha.length() > 8 && this.usuario != null && this.hora != null && this.fecha.length() > 2 && this.titulo != null) {
            return true;
        }


        return false;

    }
}


