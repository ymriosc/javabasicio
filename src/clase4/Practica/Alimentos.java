/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.Practica;

/**
 *
 * @author alumno
 */
public abstract class Alimentos {
    private String tipo_alimento;
    private String nom_alimento;
    private int unidad_medida;
    private double costo_unidad;
    private int valor_nutricional;
    private Nutrientes[] nutrientes;
    
    public Alimentos(String tipo_alimento,String nom_alimento){
        this.tipo_alimento=tipo_alimento;
        this.nom_alimento=nom_alimento;
        
    }
    
    public String getTipo_alimento() {
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    public String getNom_alimento() {
        return nom_alimento;
    }

    public void setNom_alimento(String nom_alimento) {
        this.nom_alimento = nom_alimento;
    }

    public int getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(int unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public double getCosto_unidad() {
        return costo_unidad;
    }

    public void setCosto_unidad(double costo_unidad) {
        this.costo_unidad = costo_unidad;
    }

    public int getValor_nutricional() {
        return valor_nutricional;
    }

    public void setValor_nutricional(int valor_nutricional) {
        this.valor_nutricional = valor_nutricional;
    }
   
    public void printDetalle(){
        System.out.println(this.tipo_alimento+" - "+this.nom_alimento);
    }
    
}
