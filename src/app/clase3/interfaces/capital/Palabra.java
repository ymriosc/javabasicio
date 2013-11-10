/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfaces.capital;

/**
 *
 * @author alumno
 */
public class Palabra implements Capitalizable{
    private String texto;

    public Palabra(String texto) {
        this.texto = texto;
    }
    

    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
         return texto.toLowerCase();
    }
    
}
