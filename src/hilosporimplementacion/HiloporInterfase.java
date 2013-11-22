/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilosporimplementacion;

/**
 *
 * @author mrios
 */
public class HiloporInterfase implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);            
        }
    }    
}
