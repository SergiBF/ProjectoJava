package com.it2022.modelo;

public class Usuario extends Persona{
    private int IDusuario;

<<<<<<< HEAD
    public Usuario(String nombre, String apellidos, String direccion, String email, int id ) {
        super(nombre, apellidos, direccion, email);
=======
    public Usuario(String nombre, String apellidos, String email, int id ) {
        super(nombre, apellidos, email);
>>>>>>> origin/api
        this.IDusuario=id;

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
