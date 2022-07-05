package com.it2022.modelo;

import javax.persistence.*;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "personaID")
public class Participante extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String email;


    public Participante(Long id, String nombre, String apellidos, String email) {
        super(nombre, apellidos, email);
        this.id=id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public boolean isValid(){
        if(nombre!=null && nombre.length()>0
                && apellidos!=null && apellidos.length()>0
                && email.indexOf("@")>0) return true;
        else return false;
    }

    public Participante() {

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
