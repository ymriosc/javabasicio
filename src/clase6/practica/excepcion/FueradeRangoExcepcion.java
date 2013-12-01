/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.practica.excepcion;

/**
 *
 * @author alumno
 */
public class FueradeRangoExcepcion extends Exception {
    public FueradeRangoExcepcion(double valor1,double valor2,double valor3){
        super("El valor que esta ingresando: "+valor1+", se encuenta fuera del rango");
    }
}
