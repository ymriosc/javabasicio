/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Colecciones {

    public static void main(String[] args) {
        //Colecciones.ejemploEstudiantes();
        Colecciones.ejemploMap();
    }

    public static void ejemploHashSet() {
        // hashset es un listado codificado que evita que la lista tenga repetidos
        Estudiante monica = new Estudiante("monica", "rios castro");
        Estudiante ofelia = new Estudiante("ofelia", "cordero zanabria");
        Estudiante carmen = new Estudiante("carmen", "galvez canales");
        Estudiante yovana = new Estudiante("yovana", "castro guerreo");
        Estudiante ivette = new Estudiante("ivette", "niquen sayan");
        //usamos interface Lista como tipo de una lista de estudiante
        Set<Estudiante> listado = new HashSet<Estudiante>();
        //para llenar con add
        listado.add(monica);
        listado.add(monica);
        listado.add(ofelia);
        listado.add(ofelia);
        listado.add(carmen);
        listado.add(carmen);
        listado.add(carmen);
        listado.add(yovana);
        listado.add(yovana);
        listado.add(yovana);
        listado.add(ivette);
        listado.add(ivette);
        //no se puede usar collections
        // Collections.sort(listado);

        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
        System.out.println(listado.size());
    }

    public static void ejemploLinkedlist() {
        Estudiante monica = new Estudiante("monica", "rios castro");
        Estudiante ofelia = new Estudiante("ofelia", "cordero zanabria");
        Estudiante carmen = new Estudiante("carmen", "galvez canales");
        //linklist funciona como una pila 
        LinkedList<Estudiante> listado = new LinkedList<Estudiante>();

        listado.add(monica);
        listado.add(carmen);
        listado.add(ofelia);


        ListIterator<Estudiante> ite = listado.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) listado.poll();
            e.printEstudiante();
        }
        System.out.println(listado.size());

    }

    public static void ejemploEstudiantes() {
        //instanciamos Estudiante
        Estudiante monica = new Estudiante("monica", "rios castro");
        Estudiante ofelia = new Estudiante("ofelia", "cordero zanabria");
        Estudiante carmen = new Estudiante("carmen", "galvez canales");
        Estudiante yovana = new Estudiante("yovana", "castro guerreo");
        Estudiante ivette = new Estudiante("ivette", "niquen sayan");
        //usamos interface Lista como tipo de una lista de estudiante
        List<Estudiante> listado = new ArrayList<Estudiante>();
        //para llenar con add
        listado.add(monica);
        listado.add(carmen);
        listado.add(ofelia);
        listado.add(yovana);
        listado.add(ivette);

        //ordenando Clase Collection

        //Collections.sort(listado);

        //implementado metodo para llenar
        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
        System.out.println(listado.size());

        //para acceder a una posicion
        Estudiante luis = listado.get(1);
        luis.printEstudiante();
    }

    public static void ejemploMap() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");
        HashMap<String, Estudiante> listado=new HashMap<String,Estudiante>();
        //esta compuesto por un id y un valor, el id lo defines manualmente
        listado.put("123", e3);
        listado.put("124", e1);
        listado.put("125", e2);
        //get accedes a un valor
        listado.get("124").printEstudiante();
       //instanciando        
        //Collection<Estudiante> listadoMap= listado.values();
        //for (Estudiante estudiante : listadoMap) {
          //  estudiante.printEstudiante();
        //}
        
        //haciendo directamente        
        for (Estudiante estudiante : listado.values()) {
            estudiante.printEstudiante();
        }
    }
}
