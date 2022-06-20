package org.it2022.modelo;

public class Usuario extends Persona{
    private int IDusuario;

    public Usuario(String nombre, String apellidos, String direccion, String email, int id ) {
        super(nombre, apellidos, direccion, email);
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
