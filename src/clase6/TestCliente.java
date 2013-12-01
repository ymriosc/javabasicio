/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

public class TestCliente {
    public static void main(String[] args) {
        // la ip del servidor con el puerto que habilito dicho servidor
        Cliente cliente = new Cliente("192.168.14.23", 9999);
        cliente.doConectar();
    }
 
}
