package com.it2022.modelo;

import javax.persistence.*;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "AgendaID")
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


    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                '}';
    }
}
