/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfaces.capital;

/**
 *
 * @author alumno
 */
public class Imprenta {
    public static void main(String[] args) {
        Capitalizable[] array= new Capitalizable[3];
        
        array[0]= new Palabra("hola");
        array[1]= new Oracion("EL Mejor Equipo ");
        array[2]= new Palabra("java");
        
        for (int i=0;i<array.length;i++){
            System.out.println(array[i].cambiaMayuscula());
        }
    }
    
}
