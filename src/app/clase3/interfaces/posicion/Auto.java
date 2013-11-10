/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfaces.posicion;

/**
 *
 * @author alumno
 */
public class Auto implements Posicion{
//dos atributos
    private int nroPuertas;
    private String color;
//declarar variables de posicion
    private double longitud;
    private double latitud;
    
    public Auto(double longitud,double latitud){
        //this.longitud=20d;
        //this.latitud=10d;
        this.longitud=longitud;
        this.latitud=latitud;
    }
    
    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
