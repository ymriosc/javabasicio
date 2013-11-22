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
public class Test_HiloporInterfase {
    public static void main(String[] args) {
        HiloporInterfase hilointerfase = new HiloporInterfase();
        Thread th = new Thread(hilointerfase);
        th.start();
    }
}
