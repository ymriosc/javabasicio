/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfaces.posicion;

/**
 *
 * @author alumno
 */
public class Persona implements Posicion {
    //dos atributos
    private String nombre;
    private String sexo;
    //variables 
    private double longitud;
    private double latitud;
    
    //creando constructor
     public Persona(double longitud,double latitud){
        this.longitud=longitud;
        this.latitud=latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

   

    @Override
    public double getLongitud() {
         return this.longitud;
    }

    @Override
    public double getLatitud() {
         return this.latitud;
    }

}

