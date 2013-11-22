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
public class Prioridades {
    public static void main(String[] args) {
        SimpleDelayThread2 thread1 = new SimpleDelayThread2("tread1",0);
        SimpleDelayThread2 thread2 = new SimpleDelayThread2("tread2",0);
        SimpleDelayThread2 thread3 = new SimpleDelayThread2("tread3",0);
        
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
    }
}
