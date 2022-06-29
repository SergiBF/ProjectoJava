package com.it2022.api;
import com.it2022.modelo.Tarea;
import com.it2022.servicios.GestorTareasInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class TareaController {



    @RestController
    @RequestMapping("/tarea")
    public class TestController {

        @Autowired
        private GestorTareasInf gtiServ;

        @GetMapping
        public String Hello() {

            return "Hey";
        }

        @RequestMapping(value = "",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                method = RequestMethod.GET
        )
        public List<Tarea> getTareasAPI() {
            return gtiServ.getRepo();
        }


        @RequestMapping(value = "",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                method = RequestMethod.POST,
                produces = MediaType.APPLICATION_JSON_VALUE
        )

        //Solo hago pruebas con el id, el detalle, la fecha y la hora.
        public String postTareasAPI(@RequestBody Tarea newTarea) { // int id, String detalle, String fecha, String hora
            System.out.println(newTarea);
            if(newTarea.isValid() && newTarea!=null) {
                gtiServ.addTarea(newTarea);
                return "todo OK";
            }
            return "Tarea no valida";
        }

        @RequestMapping(
                method = RequestMethod.PUT,
                consumes = MediaType.APPLICATION_JSON_VALUE,
                value = "/{id}"
        )
        public String putTareasAPI(@PathVariable int id,
                                   @RequestBody Tarea modTarea){
            System.out.println(id+"::"+modTarea);
            Tarea tareaActualizada = gtiServ.actualizarTarea(id, modTarea);
            if(tareaActualizada != null){
                return "todo ok";
            }else return "Error";


        }

        @RequestMapping(
                value = "/{id}",
                produces = MediaType.APPLICATION_JSON_VALUE,
                method = RequestMethod.DELETE
        )

        public String deleteTareasAPI(@PathVariable int id){
            System.out.println("id:"+id);

            if(gtiServ.deleteTarea(id)){
                System.out.println("hola desde tarea eliminada");
                return "Tarea eliminada";
            }
            System.out.println("hola des de tarea no eliminada");
            return "Error, no encontrado";
        };





    }
}
