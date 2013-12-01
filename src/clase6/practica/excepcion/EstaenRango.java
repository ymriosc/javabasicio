/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.practica.excepcion;

/**
 *
 * @author alumno
 */
public class EstaenRango {
    public static void main(String[] args) {
        try{
          VerificarRango verifica=new VerificarRango(1,9);
            System.out.println("Verificando Rango "+verifica.verificandorango(2));
            
        }catch(FueradeRangoExcepcion nombreerror){
            System.out.println(nombreerror.getMessage());
        }
    }
    
    
}
