/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CentrosdeDistribucion;

/**
 *
 * @author mrios
 */
public class Medico extends Persona{
    private int nro_licencia;
    private int ano_graduado;

    public int getNro_licencia() {
        return nro_licencia;
    }

    public void setNro_licencia(int nro_licencia) {
        this.nro_licencia = nro_licencia;
    }

    public int getAno_graduado() {
        return ano_graduado;
    }

    public void setAno_graduado(int ano_graduado) {
        this.ano_graduado = ano_graduado;
    }
    
}
