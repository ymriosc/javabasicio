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
public class Medicamentos extends Productos{
    private String Posologia;
    private String Contraindicaciones;
    

    public Medicamentos(int codigoproducto,String descripcionproducto,double precio ){
        this.setCodigoproducto(codigoproducto);
        this.setDescripcionproducto(descripcionproducto);
        this.setPrecio(precio);
    }
            

    public String getPosologia() {
        return Posologia;
    }

    public void setPosologia(String Posologia) {
        this.Posologia = Posologia;
    }

    public String getContraindicaciones() {
        return Contraindicaciones;
    }

    public void setContraindicaciones(String Contraindicaciones) {
        this.Contraindicaciones = Contraindicaciones;
    }
    
}
