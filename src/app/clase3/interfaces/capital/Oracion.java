/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfaces.capital;

/**
 *
 * @author alumno
 */
public class Oracion  implements Capitalizable{
    private String texto;

    public Oracion(String texto) {
        this.texto = texto;
    }
    
 
    @Override
    public String cambiaMayuscula() {
        return texto.toLowerCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
    
}
