/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author alumno
 */
public class Serializacion {

    public static void main(String[] args) {
        //Serializacion.serializarPersona();
        Serializacion.deserializarPersona();
    }

    public static void serializarPersona() {
        //    FileOutputStream archivo = null;
        ObjectOutputStream salida = null;

        Persona p1 = new Persona("Alonso", 23);

        try {
            FileOutputStream archivo = null;
            archivo = new FileOutputStream("c:\\objetoo.txt");
            salida = new ObjectOutputStream(archivo);
            salida.writeObject(p1);
            salida.flush();
        } catch (IOException e) {
            System.out.println("Imposible crear el archivo o escribir en él");
        } finally {
            try {
                salida.close();
            } catch (IOException e) {
                System.out.println("No pudo cerrarse el canal");
            }
        }
    }
//guardando un objeto como tal en deserializar
    public static void deserializarPersona() {
        File archivo = new File("c:\\objetoo.txt");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona p1 = (Persona) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Persona recuperada: " + p1.toString());
        } catch (IOException e) {
            System.err.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }
    }
}
