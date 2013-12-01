/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.practica.excepcion;

/**
 *
 * @author alumno
 */
public class VerificarRango {
    double desde;
    double hasta;

    public VerificarRango(double desde, double hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }
    
    

    public double getDesde() {
        return desde;
    }

    public void setDesde(double desde) {
        this.desde = desde;
    }

    public double getHasta() {
        return hasta;
    }

    public void setHasta(double hasta) {
        this.hasta = hasta;
    }

           
    
    public double verificandorango(double valor) throws FueradeRangoExcepcion{
        if ((valor >= hasta) || (valor <= desde)){
            throw new FueradeRangoExcepcion(valor,desde, hasta);
        }else { System.out.println("El valor ingresado esta dentro del rango");
        }
        return valor;
    }
}
