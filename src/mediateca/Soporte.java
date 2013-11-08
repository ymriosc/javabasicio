/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author mrios
 */
public abstract class Soporte {

    private String titulo;
    private int dias;

    public Soporte() {

    }

    public Soporte(String titulo, int dias) {
        super();
        this.titulo = titulo;
        this.dias = dias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

}
