package com.it2022.modelo;

public class Participante extends Persona{

    private int id;


    public Participante(int id, String nombre, String apellidos, String email) {
        super(nombre, apellidos, email);
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
