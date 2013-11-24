/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosclase;

/**
 *
 * @author alumno
 */
public class Hilos {
    public static void main(String[] args) {
        Hilos.testListaProcess();
    }
    
    public static void testListaProcess() {
       ProcesosSistema listapro= new ProcesosSistema();
       listapro.start();
     
    }
    public static void testHiloHerenciaa() {
        HiloHerencia hilo= new HiloHerencia();
        hilo.start();
        
    }
    public static void tesHiloInterfase() {
        HiloImplementacion hilo= new HiloImplementacion();
        Thread runner = new Thread(hilo);
        runner.start();
        
    }
}
