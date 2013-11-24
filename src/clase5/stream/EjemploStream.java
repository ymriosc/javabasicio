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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EjemploStream {
    
    private List<String> lineas;
    private String filename;
    //definimos el constructor e indicamos el archivo
    //definimos una listae
    public EjemploStream(String filee){
        this.lineas = new ArrayList<String>();
        this.filename = filee;
    }
    // se va a leer y guardar lo nuevo
    public void actualizarArchivo(){
        leerarchivo();
        guardarArchivo();
    }
    //leemos cada linea del archivo y lo agregamos en la lista del array
    public void leerarchivo(){
       
        try {
           String line;
           FileReader fr = new FileReader(this.filename);
           BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                this.lineas.add(line);
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarArchivo(){
         try {
            FileWriter fw = new FileWriter(this.filename);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String line:lineas){
                bw.write(line);
                bw.newLine();
            }
            bw.write("Nuevo mensaje");
            bw.newLine();
            bw.write("Bienvenido Mes de Diciembre");
            bw.newLine();
            bw.write("Bienvenida Navidad");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
