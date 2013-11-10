/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author mrios
 */
public class Libro extends Soporte {

    private int npaginas;
    private int nisbn;
   

    public Libro() {

    }

    public Libro(int npaginas, int nisbn) {
        super();
        this.npaginas = npaginas;
        this.nisbn = nisbn;
 
    }

}
