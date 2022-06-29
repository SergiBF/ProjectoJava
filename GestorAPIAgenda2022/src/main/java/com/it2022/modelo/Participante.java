package com.it2022.modelo;

public class Participante extends Persona{

    private int id;


<<<<<<< HEAD
    public Participante(int id, String nombre, String apellidos, String direccion, String email) {
        super(nombre, apellidos, direccion, email);
=======
    public Participante(int id, String nombre, String apellidos, String email) {
        super(nombre, apellidos, email);
>>>>>>> origin/api
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

<<<<<<< HEAD
=======
    public boolean isValid(){
        if(nombre!=null && nombre.length()>0
                && apellidos!=null && apellidos.length()>0
                && email.indexOf("@")>0) return true;
        else return false;
    }

>>>>>>> origin/api
    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                '}';
    }
}
