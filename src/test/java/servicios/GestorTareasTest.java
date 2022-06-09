package servicios;

import org.junit.Test;

import static org.junit.Assert.*;

public class GestorTareasTest {


    @Test
    public void testBuscarTarea(){
        //Crear gestor tarea
        GestorTareas gt= new GestorTareas();

        //Crear Repo tarea
        PersistenciaTarea pt= new PersistenciaTarea();

        //asignar repo a gestor de tareas
        gt.setRepo(pt);

        //llamar a gestor.buscaTareasPorUsuarioYFecha("xxxx", 01);
        List<Tarea> tareas = gt.buscaTareasPorUsuarioYFecha("20/06/2022", 01);

        System.out.println(tareas);

        assertNotNull(tareas);
    }

}

