/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase5.ejerciciop1;

/**
 *
 * @author mrios
 */
public class EjecutarServidor {
    public static void main(String[] args) {
        Servidor serverr =  new Servidor(9999);
        serverr.ejecutar();
    }
}
