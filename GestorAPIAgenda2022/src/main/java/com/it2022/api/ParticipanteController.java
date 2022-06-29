package com.it2022.api;


import com.it2022.modelo.Message;
import com.it2022.modelo.Participante;
import com.it2022.servicios.GestorParticipantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    //Inject servicio
    @Autowired
    GestorParticipantes gtrPart;

    //GET/api/participantes

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Participante> mostrarTodosParticipantes() {
        return gtrPart.getAll();
    }

    //POST/api/participantes -d {newParticipante}
    @PostMapping(
            value = "",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> postNuevoParticipante(@Valid @RequestBody Participante newParticipante) {
        System.out.println(newParticipante);
        gtrPart.addParticipante(newParticipante);
        System.out.println(gtrPart.getAll());
        return new ResponseEntity<>(new Message("Participante añadido con éxito"), HttpStatus.CREATED);
    }

    //DELETE/api/participantes({id}
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> participanteABorrar(@PathVariable int id) {
        System.out.println(id);
        Boolean isDeleted = gtrPart.removeParticipante(id);
        if (isDeleted) return new ResponseEntity(new Message("Participante Borrado"), HttpStatus.ACCEPTED);
        else return new ResponseEntity(new Message("Participante NO existe"), HttpStatus.NOT_FOUND);

    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> edicionParticipante(@PathVariable int id, @RequestBody Participante nuevosDatosParticipante) {
        System.out.println(id + "::" + nuevosDatosParticipante);
        Participante edicionParticipante = gtrPart.edicionParticipante(id, nuevosDatosParticipante);
        return new ResponseEntity<>(new Message("Edición de Participante realizada correctamente"), HttpStatus.ACCEPTED);
    }


}
