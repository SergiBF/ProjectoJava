package org.it2022.web;

import org.it2022.modelo.Tarea;
import org.it2022.servicios.GestorTareasInf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tareas")
public class TareaController {

    @Inject
    GestorTareasInf gestorTareas;


    @RequestMapping(method = RequestMethod.GET, value = "/tareas_dia")
    public ModelAndView get_tareasPorDia(
            @RequestParam(required = false) Long idUsuario,
            @RequestParam(required = false) String fecha
    ) {

        ModelAndView mav = new ModelAndView("tareasXDia");
        if (idUsuario != null) {
            mav.addObject("tareasXDia", gestorTareas.buscaTareasPorUsuarioYFecha(fecha, idUsuario.intValue()));
        }
        return mav;
    }


}




