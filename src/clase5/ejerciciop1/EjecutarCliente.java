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
        Cliente clientee = new Cliente("192.168.14.23", 9999);
        OperacionesMatematicas operaciones=new OperacionesMatematicas();
        operaciones.resta(50, 60);
        clientee.doConectar();
        
        
        Cliente clientee2 = new Cliente("192.168.14.47", 9999);
        OperacionesMatematicas operaciones2=new OperacionesMatematicas();
        operaciones2.suma(50, 60);
        clientee2.doConectar();
               
        
        Cliente clientee3 = new Cliente("192.168.14.100", 9999);
        OperacionesMatematicas operaciones3=new OperacionesMatematicas();
        clientee3.doConectar();
        operaciones3.multiplicacion(50, 60);
        
        
        
    }
        
}
