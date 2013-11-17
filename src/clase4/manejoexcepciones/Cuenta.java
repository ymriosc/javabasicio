/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.manejoexcepciones;

public class Cuenta {
    String nombre;
    double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    //metodo para obtener dinero
    public double retirarCajero(double montoRetiro) throws SaldoInsuficienteException{
        //primero se valida
        if(montoRetiro > saldo){
            //se esta generando un nuevo throw
            throw new SaldoInsuficienteException(saldo,montoRetiro);
        }
        this.saldo= saldo - montoRetiro;
        return saldo;
        
    }
}
