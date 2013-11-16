/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.Practica;

import java.util.Date;

/**
 *
 * @author alumno
 */
public abstract class Animales {
    private String cod_animal;
    private String nom_animal;
    private String tipo_especie;
    private int peso_animal;
    private Date fecha_nac_animal;
    private String observaciones;

    public String getCod_animal() {
        return cod_animal;
    }

    public void setCod_animal(String cod_animal) {
        this.cod_animal = cod_animal;
    }

    public String getNom_animal() {
        return nom_animal;
    }

    public void setNom_animal(String nom_animal) {
        this.nom_animal = nom_animal;
    }

    public String getTipo_especie() {
        return tipo_especie;
    }

    public void setTipo_especie(String tipo_especie) {
        this.tipo_especie = tipo_especie;
    }

    public int getPeso_animal() {
        return peso_animal;
    }

    public void setPeso_animal(int peso_animal) {
        this.peso_animal = peso_animal;
    }

    public Date getFecha_nac_animal() {
        return fecha_nac_animal;
    }

    public void setFecha_nac_animal(Date fecha_nac_animal) {
        this.fecha_nac_animal = fecha_nac_animal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
   
    
   
            
}
