/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.bicicleta;

/**
 *
 * @author alumno
 */
public class Bicicleta {

    private int velocidadActual;
    private int velocidadMaxima;
    private int engrenajeActual;
    private String nroAro;
    private String marca;
    private String modelo;

    public void cambiarLlantas() {
        System.out.println("Cambiandoooo llantas");
    }

    public void frenar() {
        System.out.println("Frenando");
    }

    public void cambiarVelocidad(int engranajeActual) {
        this.engrenajeActual = engranajeActual;
        System.out.println("Cambiando velocidad a " + engranajeActual);
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getEngrenajeActual() {
        return engrenajeActual;
    }

    public void setEngrenajeActual(int engrenajeActual) {
        this.engrenajeActual = engrenajeActual;
    }

    public String getNroAro() {
        return nroAro;
    }

    public void setNroAro(String nroAro) {
        this.nroAro = nroAro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

    
}
