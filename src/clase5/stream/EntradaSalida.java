/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.stream;

import java.io.File;

/**
 *
 * @author alumno
 */
public class EntradaSalida {

    public static void main(String[] args) {
      //  EntradaSalida.verifyfile();
         //EntradaSalida.listardirectorio();
         EntradaSalida.createDirectorio();
    }

    public static void createDirectorio() {
        File dir = new File("c:\\javatecsup");
        
        if (!dir.isDirectory()&& !dir.exists()){
            dir.mkdir();
        }
        
    }
    public static void listardirectorio() {
        File directorio = new File("C:\\ ");
        if ((directorio.exists()) && (directorio.isDirectory())) {
          //  String[] lista = directorio.list();
           // for (int i = 0; i < lista.length; i++) {
            for (String subdir : directorio.list()){
                //System.out.println(lista[i]);
                System.out.println(subdir);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }

    public static void verifyfile() {
        File archivofile = new File("C:\\archivofile.txt");

        System.out.println("Nombre: " + archivofile.getName());
        System.out.println("Ruta : " + archivofile.getPath());
        System.out.println("Ruta Absoluta: " + archivofile.getAbsolutePath());

        if (archivofile.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((archivofile.canRead()) ? "Sí se puede leer" : "");
            System.out.println((archivofile.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + archivofile.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
        }

    }
}
