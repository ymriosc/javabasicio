/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public abstract class Hymenopteros {
    private String tipoespecie;
    
    public abstract void comer();


    public String getTipoespecie() {
        return tipoespecie;
    }

    public void setTipoespecie(String tipoespecie) {
        this.tipoespecie = tipoespecie;
    }
    
    
}
