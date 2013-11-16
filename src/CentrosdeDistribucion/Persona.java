/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CentrosdeDistribucion;

/**
 *
 * @author mrios
 */
public abstract class Persona {
    private String nombre;
       
    public void printNombrePersona() {
        System.out.println("NombrePersona: +"+this.nombre);
    } 
    
}
