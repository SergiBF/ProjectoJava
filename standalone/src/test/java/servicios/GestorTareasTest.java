package servicios;

import org.it2022.modelo.Tarea;
import org.it2022.persistencia.PersistenciaTarea;
import org.it2022.servicios.GestorTareas;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GestorTareasTest {

    //Crear gestor tarea
    GestorTareas gt= new GestorTareas();

    //Crear Repo tarea
    PersistenciaTarea pt= new PersistenciaTarea();

    @Before
    public void before(){
        //asignar repo a gestor de tareas
        gt.setRepoTareas(pt);
    }


    @Test
    public void testBuscarTarea(){
        //llamar a gestor.buscaTareasPorUsuarioYFecha("xxxx", 01);
        List<Tarea> tareas = gt.buscaTareasPorUsuarioYFecha("20/06/2022", 01);

        System.out.println(tareas);

        assertNotNull(tareas);
        assertEquals(tareas.size(),2);
    }

    @Test
    public void testAddTarea(){
    }
}

