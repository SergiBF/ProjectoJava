package org.it2022.modelo;

public class Participante extends Persona{

    private int id;


    public Participante(int id, String nombre, String apellidos, String direccion, String email) {
        super(nombre, apellidos, direccion, email);
        this.id=id;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                '}';
    }
}
