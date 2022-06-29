package com.it2022.servicios;
import com.it2022.modelo.Participante;
import com.it2022.persistencia.PersistenciaParticipante;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class GestorParticipantes {
    @Inject
    PersistenciaParticipante persPart;

    public List<Participante> getAll() {
        return persPart.getAll();
    }

    public Participante getParticipantePerId(int id) {
        if (id > 0) return persPart.cargarParticipante(id);
        else return null;
    }

    public void addParticipante(Participante newParticipante) {
        if (newParticipante != null && newParticipante.isValid()){
            System.out.println("Hola desde Servicio");
            persPart.almacenParticipantes(newParticipante);}
    }

    public Boolean removeParticipante(int id) {
        if (id > 0) {
            return persPart.deleteParticipante(id);
        }
        return false;

    }

    public Participante edicionParticipante(int id, Participante nuevosDatosParticipante) {
        if (id > 0) {
            Participante participanteAModificar = getParticipantePerId(id);
            if (participanteAModificar != null) {
                if (nuevosDatosParticipante.getNombre() != null && participanteAModificar.getNombre().length() > 0)
                    //establece nuevo nombre de la variante de los datos que el usuario nos ha dado para cambiar
                    participanteAModificar.setNombre(nuevosDatosParticipante.getNombre());
                if (nuevosDatosParticipante.getApellidos() != null)
                    //establece nuevo Apellido de la variante de los datos que el usuario nos ha dado para cambiar
                    participanteAModificar.setApellidos(nuevosDatosParticipante.getApellidos());
                    if (nuevosDatosParticipante.getEmail() != null)
                        //establece nuevo email de la variante de los datos que el usuario nos ha dado para cambiar
                        participanteAModificar.setEmail(nuevosDatosParticipante.getEmail());
                        return persPart.ediciónParticipanteAModificar(participanteAModificar);
                    } else return null;
                } else return null;
            }

        }





