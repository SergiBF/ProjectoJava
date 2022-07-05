package com.it2022.modelo;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column

    private String nombre;
    @Transient
    private ArrayList<Calendario> listaCalendario;

    public Agenda() {
    }

    public Agenda(String nombre, ArrayList<Calendario> listaCalendario) {
        this.nombre = nombre;
        this.listaCalendario = listaCalendario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
