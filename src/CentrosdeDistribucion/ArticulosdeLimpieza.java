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
public class ArticulosdeLimpieza extends Productos{
    private int tipo_articulo;
    private int porcentajedescuento;
    
    public ArticulosdeLimpieza(int codigoproducto,String descripcionproducto,double precio ){
        this.setCodigoproducto(codigoproducto);
        this.setDescripcionproducto(descripcionproducto);
        this.setPrecio(precio);
    }

    public int getTipo_articulo() {
        return tipo_articulo;
    }

    public void setTipo_articulo(int tipo_articulo) {
        this.tipo_articulo = tipo_articulo;
    }

    public int getPorcentajedescuento() {
        return porcentajedescuento;
    }

    public void setPorcentajedescuento(int porcentajedescuento) {
        this.porcentajedescuento = porcentajedescuento;
    }
    
}
