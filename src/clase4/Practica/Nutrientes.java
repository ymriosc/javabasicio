/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.Practica;

/**
 *
 * @author alumno
 */
public class Nutrientes extends Alimentos{
    private Long cod_nutriente;
    private String nom_nutriente;
    private int unidad_nutriente;
    private String estado_nutriente;

    public Nutrientes(Long cod_nutriente, String tipo_alimento, String nom_alimento) {
        super(tipo_alimento, nom_alimento);
        this.cod_nutriente = cod_nutriente;
    }
    
    

    public Long getCod_nutriente() {
        return cod_nutriente;
    }

    public void setCod_nutriente(Long cod_nutriente) {
        this.cod_nutriente = cod_nutriente;
    }

    public String getNom_nutriente() {
        return nom_nutriente;
    }

    public void setNom_nutriente(String nom_nutriente) {
        this.nom_nutriente = nom_nutriente;
    }

    public int getUnidad_nutriente() {
        return unidad_nutriente;
    }

    public void setUnidad_nutriente(int unidad_nutriente) {
        this.unidad_nutriente = unidad_nutriente;
    }

    public String getEstado_nutriente() {
        return estado_nutriente;
    }

    public void setEstado_nutriente(String estado_nutriente) {
        this.estado_nutriente = estado_nutriente;
    }
    
    
    
}
