/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public abstract class AbejasEusociales extends Hymenopteros{
    private String sexo;
    private int ciclodesarrollo;
    private String tipoabejas;

    public int getCiclodesarrollo() {
        return ciclodesarrollo;
    }

    public void setCiclodesarrollo(int ciclodesarrollo) {
        this.ciclodesarrollo = ciclodesarrollo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoabejas() {
        return tipoabejas;
    }

    public void setTipoabejas(String tipoabejas) {
        this.tipoabejas = tipoabejas;
    }
    
    public abstract void desarrollartrabajo();
}
