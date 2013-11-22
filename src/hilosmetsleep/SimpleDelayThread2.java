/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilosmetsleep;

/**
 *
 * @author mrios
 */
public class SimpleDelayThread2 extends Thread {
    public String name= null;
    public int delay= 0;
    
    public SimpleDelayThread2(String str, int d){
        this.name=str;
        this.delay=d;        
    }
    @Override
    public void run(){
        try{
            Thread.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Nombre: "+name+ " | delay: "+delay);
    }
}
