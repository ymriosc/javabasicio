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
public class Test_SimpleDelayThread2 {

    public static void main(String[] args) {
        int delay1 = (int) (Math.random() * 2000);
        int delay2 = (int) (Math.random() * 2000);
        int delay3 = (int) (Math.random() * 2000);
        
        SimpleDelayThread2 thread1 = new SimpleDelayThread2("thread1", delay1);
        SimpleDelayThread2 thread2 = new SimpleDelayThread2("thread2", delay2);
        SimpleDelayThread2 thread3 = new SimpleDelayThread2("thread3", delay3);
        
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
