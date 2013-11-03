/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.persona;

/**
 *
 * @author alumno
 */
public class AppPersona {
    public static void main(String[] args) {
        Persona jose=new Persona("Monica","Rios",28);
        System.out.println("Atributos del objeto");
        System.out.println("NOmbres: "+jose.getNombre());
        System.out.println("Apellidos: "+jose.getApellidos());
        System.out.println("Edad: "+jose.getEdad());
        
        Persona luis=new Persona();
        luis.nombresapellidos("MM","RR");
        luis.imprimirnombapell();
        
        
    }
}
