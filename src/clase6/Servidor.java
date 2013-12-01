/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

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
       /* try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
            while (true) {
                System.out.println("Esperando ...");
                Socket cliente = server.accept();
                ServidorHilo ts = new ServidorHilo(cliente);
                ts.start();
            }
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }*/
    }
}