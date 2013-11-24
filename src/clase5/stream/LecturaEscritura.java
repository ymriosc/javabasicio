/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class LecturaEscritura {
    public static void main(String[] args) {
        LecturaEscritura.escribirArchivo();
        LecturaEscritura.leerArchivo();
    }

    public static void escribirArchivo() {
        try {
            FileWriter fw = new FileWriter("c:\\javatecsup\\javatecsup");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Buenas Nochesssssss");
            bw.newLine();
            bw.write("Somos el programa JAVA");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo() {
        String sInput;
        try {
           FileReader fr = new FileReader("c:\\javatecsup\\javatecsup");
           BufferedReader br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
