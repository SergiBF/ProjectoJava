package com.it2022.api;
import com.it2022.modelo.Tarea;
import com.it2022.servicios.GestorTareasInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public class TareaController {



    @RestController
    @RequestMapping("/tarea")
    public class TestController {

        @Autowired
        private GestorTareasInf gtiServ;



        @RequestMapping(value = "",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                method = RequestMethod.GET
        )
        public ResponseEntity<List<Tarea>> getTareasAPI() {

            List<Tarea> getAllTareas = gtiServ.getRepo();
            return new ResponseEntity<>(getAllTareas, HttpStatus.OK);
        }

        @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity getTarea(@PathVariable Long id) {
            Tarea tarea = gtiServ.obtenerTarea(id);
            if (tarea != null) return new ResponseEntity(tarea, HttpStatus.OK);
            else
                return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        @RequestMapping(value = "",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                method = RequestMethod.POST,
                produces = MediaType.APPLICATION_JSON_VALUE
        )

        //Solo hago pruebas con el id, el detalle, la fecha y la hora.
        public ResponseEntity postTareasAPI(@RequestBody Tarea newTarea) { // int id, String detalle, String fecha, String hora
            System.out.println(newTarea);
            if(newTarea.isValid() && newTarea!=null) {
                gtiServ.addTarea(newTarea);
                return new ResponseEntity(newTarea, HttpStatus.CREATED);}

            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
        }

        @RequestMapping(
                method = RequestMethod.PUT,
                consumes = MediaType.APPLICATION_JSON_VALUE,
                value = "/{id}"
        )
        public ResponseEntity putTareasAPI(@PathVariable Long id,
                                   @RequestBody Tarea modTarea){
            System.out.println(id+"::"+modTarea);
            Tarea tareaActualizada = gtiServ.actualizarTarea(id, modTarea);
            if(tareaActualizada != null){
                return new ResponseEntity(tareaActualizada, HttpStatus.OK);
            }else return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);


        }

        @RequestMapping(
                value = "/{id}",
                produces = MediaType.APPLICATION_JSON_VALUE,
                method = RequestMethod.DELETE
        )

        public ResponseEntity deleteTareasAPI(@PathVariable Long id){
            System.out.println("id:"+id);

            if(gtiServ.deleteTarea(id)){

                return new ResponseEntity(HttpStatus.OK);
            }

            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
        }

    }
}
