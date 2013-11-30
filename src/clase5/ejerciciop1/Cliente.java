/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase5.ejerciciop1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author mrios
 */
public class Cliente {

    private String host;
    private int port;

    public Cliente(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);
// Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
// COMUNICACION 1
            String msg = in.readLine();
            System.out.println(msg);
// COMUNICACION 2
            out.println("CLIENTE: Monica Rios");
// Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}