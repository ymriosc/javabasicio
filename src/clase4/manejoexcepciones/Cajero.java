/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.manejoexcepciones;

/**
 *
 * @author alumno
 */
public class Cajero {
    public static void main(String[] args) {
        try{
        Cuenta cuentaJose=new Cuenta("Jose",5000);
        System.out.println("Saldo " +cuentaJose.retirarCajero(3000));
        System.out.println("Saldo " +cuentaJose.retirarCajero(4000));    
        }catch(SaldoInsuficienteException nomerror){
            System.out.println(nomerror.getMessage());
        }
        
    }
}
