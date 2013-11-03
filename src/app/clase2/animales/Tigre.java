/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.animales;

/**
 *
 * @author alumno
 */
public class Tigre extends Animal {
    
    public Tigre(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);        
    }

    @Override
    public void hacerRuido() {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("Grrrrrrrrrrrr");
    }
    
     public void hacerRuido(boolen molestar) {
         //To change body of generated methods, choose Tools | Templates.
        System.out.println("Grrr");
    }
    
}
