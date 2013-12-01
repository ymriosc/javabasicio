/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public class AbejasObreras extends AbejasEusociales {

    @Override
    public void desarrollartrabajo() {
        System.out.println("Esta Especie deben de ser Hembras y su período de desarrollo es de 21 días");
    }

    @Override
    public void comer() {
        System.out.println("Las Obejas Obreras comen lo que les corresponde");
    }
    
}
