package com.it2022.modelo;

public class Persona {

<<<<<<< HEAD
    private String nombre, apellidos, direccion, email;

    public Persona(String nombre, String apellidos, String direccion, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
=======
    protected String nombre, apellidos, email;

    public Persona(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
>>>>>>> origin/api
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

<<<<<<< HEAD
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

=======
>>>>>>> origin/api
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
<<<<<<< HEAD
                ", direccion='" + direccion + '\'' +
=======
>>>>>>> origin/api
                ", email='" + email + '\'' +
                '}';
    }
}
