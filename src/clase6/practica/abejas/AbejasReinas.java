/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public class AbejasReinas extends AbejasEusociales{

    @Override
    public void desarrollartrabajo() {
        System.out.println("Esta Especie deben de ser Hembras y su período de desarrollo es de 16 días");
    }

    @Override
    public void comer() {
        System.out.println("Esta especie de Abejas deben de haber comido mucha MIEL");;
    }
    
}
