/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosclase;

/**
 *
 * @author alumno
 */
public class MostrarConsola extends Thread{

    @Override
    public void run() {
         for (int i = 0; i <5; i++) {
            try{
                //en milesegundos 10            
                consola();
                Thread.sleep(5000);
            }catch (InterruptedException nomerror){
                nomerror.printStackTrace();
            }
            
        }
    }
        
    public void consola(){
        long mem0 = Runtime.getRuntime().totalMemory();
        long mem1 = Runtime.getRuntime().freeMemory();
        long mem2 = Runtime.getRuntime().availableProcessors();
        long mem3 = Runtime.getRuntime().maxMemory();
        
        System.out.println("El total de la Memoria es: "+mem0);
        System.out.println("El Espacio libre de Memoria es: "+mem1);
        System.out.println("Los procesadores disponibles: "+mem2);
        System.out.println("El Máximo de Memoria es: "+mem3);
    }
    
}
