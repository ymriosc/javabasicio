/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public class AbejasZanganos extends AbejasEusociales{

    @Override
    public void desarrollartrabajo() {
        System.out.println("Esta Especie deben de ser Machos y su período de desarrollo es de 23 días");
    }

    @Override
    public void comer() {
        System.out.println("Las Obejas Zanganos come lo que le corresponde");
    }
    
}
