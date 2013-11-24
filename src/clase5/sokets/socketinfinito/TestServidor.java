/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.sokets.socketinfinito;

import clase5.sokets.ejemplo1.*;

/**
 *
 * @author alumno
 */
public class TestServidor {
    public static void main(String[] args) {
        Servidor server =  new Servidor(9999);
        server.ejecutar();
    }

}
