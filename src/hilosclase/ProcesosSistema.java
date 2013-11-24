/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosclase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class ProcesosSistema extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            try{
                //en milesegundos 10            
                listProcess();
                Thread.sleep(10000);
            }catch (InterruptedException nomerror){
                nomerror.printStackTrace();
            }
            
        }
    }

    public void listProcess() {
        try {
            Process proceso = Runtime.getRuntime().exec("tasklist");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                    proceso.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(
                    proceso.getErrorStream()));
            
            String s = null;
            System.out.println("Here is the standard output of the command:\n");
            
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            System.out.println("Here is the standard error of the command (if any):\n");
            
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
          //  System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
