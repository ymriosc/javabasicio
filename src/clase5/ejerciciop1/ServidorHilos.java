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
            String operacion = in.readLine();
            double op1 = Double.parseDouble(in.readLine());
            double op2 = Double.parseDouble(in.readLine());
           
             if (operacion.equals("m")){
                out.println("Servidor Multiplicacion");
                out.println(op1 * op2);
                
            }
             if(operacion.equals("s")){
                out.println("Servidor Suma");
                out.println(op1 + op2);
            }
             if(operacion.equals("d")){
                try{
                out.println("Servidor Division");
                out.println(op1 / op2);
                 }catch (ArithmeticException nomerror ){
                      System.out.println("Error Matematico");
                 }finally{
                     System.out.println("Fin del Programa");
                 }            
            }
            if(operacion.equals("r")){
                out.println("Servidor Resta");
                out.println(op1 - op2);
            }
            
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
