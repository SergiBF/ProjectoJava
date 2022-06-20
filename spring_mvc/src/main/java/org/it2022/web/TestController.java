package org.it2022.web;

import org.it2022.servicios.GestorTareas;
import org.it2022.servicios.GestorTareasInf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

@Controller
@RequestMapping("/test")

public class TestController {
    @Inject
    GestorTareasInf gestorTareas;
    

    @RequestMapping(method = RequestMethod.GET, value = "")
   public ModelAndView getTest(){
        
       ModelAndView mvn = new ModelAndView("test");
       mvn.addObject("tareas", gestorTareas.buscaTareasPorUsuarioYFecha("20/06/2022", 01));
       return mvn;
   }

   
}
