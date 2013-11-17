/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.manejoexcepciones;

/**
 *
 * @author alumno
 */
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(double saldo, double cuantodesea){
        //super ejecuta el constructor de la clase padre en el ejemplo de exception
        super("En su cuenta tiene: " +saldo +" No puedes retirar: "+cuantodesea);
    }
    
}
