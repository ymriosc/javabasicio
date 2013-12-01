/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author alumno
 */
public class ServidorHilo {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {
// Crear los canales de lectura y escritura
            // Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));
// COMUNICACION 1
            out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");
// COMUNICACION 2
                
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
    public void calculadora(PrintWriter out, BufferedReader in) throws IOException {
        
        out.println("Servidor Bienvenido");
        
        String nombre=in.readLine();
        System.out.println(nombre);
        
        String operacion = in.readLine();
        Double operador1=Double.parseDouble(in.readLine());
        Double operador2=Double.parseDouble(in.readLine());
                     
            if (operacion.equals("m")){
                out.println("Servidor Multiplicacion");
                out.println(operador1 * operador2);
                
            }else if(operacion.equals("s")){
                out.println("Servidor Suma");
                out.println(operador1 + operador2);
            }
             
    }
}
