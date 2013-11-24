/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.sokets.socketinfinito;

import clase5.sokets.ejemplo1.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author alumno
 */
public class Servidor {

    private int port;

    public Servidor(int port) {
        this.port = port;
    }

    public void ejecutar() {
        try {
// Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
//agregando while para que no se pare el servidor            
          while  (true) {  
            Socket cliente = server.accept();
            
// Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
// COMUNICACION 1
            out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");
// COMUNICACION 2
            String resp2 = in.readLine();
            System.out.println(resp2);
            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();
          }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
