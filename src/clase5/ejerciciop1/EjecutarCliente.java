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
public class EjecutarCliente {
        public static void main(String[] args) {
        // la ip del servidor con el puerto que habilito dicho servidor
        Cliente clientee = new Cliente("localhost", 9999);
        OperacionesMatematicas operaciones=new OperacionesMatematicas();
        operaciones.resta(50, 60);
        clientee.doConectar();
        
    }
        
}
