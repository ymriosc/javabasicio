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
public class SimpleDelayThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                //1000 ms
                Thread.sleep(1000);
            }catch (InterruptedException nomerror){
                nomerror.printStackTrace();
            }
            System.out.println(i);
        }
    }
    
}
