package org.it2022.web;

import org.it2022.modelo.Tarea;
import org.it2022.servicios.GestorTareasInf;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/tareas")

public class TareaController {

    @Inject
    GestorTareasInf gestorTareas;


    @RequestMapping(method = RequestMethod.GET, value = "/formtareas")
    public ModelAndView mostrar_ModificadorDescrip() {
        ModelAndView mvn = new ModelAndView("ModificarTareas");
        //gestorTareas.obtenerTarea(1); // pedirlo como un request despues
        mvn.addObject("latarea", gestorTareas.obtenerTarea(1));
        return mvn;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/formtareas")
    public ModelAndView recibir_ModificadorDescrip(HttpServletRequest req) throws ServletException, IOException { {
        System.out.println("Estoy en el POST");
        String detalleMod = req.getParameter("detalle");


        System.out.println(detalleMod);
        if(detalleMod != null ){
            ModelAndView mvn = new ModelAndView("ModificarTareas");
            Tarea tarMod = new Tarea(detalleMod);
            gestorTareas.actualizarTarea(tarMod);
            mvn = new ModelAndView("redirect:/web/test");

        }

        }

        return mvn;
    }


}