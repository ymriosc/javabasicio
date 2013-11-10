/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.universo;

import app.clase3.universo.abstractas.Alienigena;

/**
 *
 * @author alumno
 */
public class Melmakiano extends Alienigena{

    @Override
    public void comer() {
        System.out.println("comiendo gatos");
    }

    @Override
    public void comunicarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sentir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
