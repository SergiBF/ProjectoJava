package com.it2022.modelo;

import javax.persistence.*;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDusuario;

    @Column
    private String nombre, apellidos, email;

    public Usuario() {
    }

    public Usuario(int IDusuario, String nombre, String apellidos, String email) {
        this.IDusuario = IDusuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public Usuario(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    // Getter y Setter
    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }


    // Metodo ToString
    @Override
    public String toString() {
        return "Usuario{" +
                "IDusuario=" + IDusuario +
                '}';
    }


}
