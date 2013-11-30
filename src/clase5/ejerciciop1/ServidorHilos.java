/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase5.ejerciciop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author mrios
 */
public class ServidorHilos extends Thread  {
    
    private Socket cliente;

    public ServidorHilos(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {
// Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));
// COMUNICACION 1
            out.println("SERVIDOR: Bienvenido, Ingrese Operacion  Matematica a realizar ");
// COMUNICACION 2
            String resp2 = in.readLine();
            System.out.println(resp2);
            OperacionesMatematicas operacion= new OperacionesMatematicas();
            double suma=operacion.suma(50,60);
            System.out.println(suma);
            
            double resta=operacion.resta(50,60);
            System.out.println(resta);
                       
            double multiplicacion=operacion.multiplicacion(50,60);
            System.out.println(multiplicacion);
            
            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
