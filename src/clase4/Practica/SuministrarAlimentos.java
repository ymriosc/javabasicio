/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.Practica;

/**
 *
 * @author alumno
 */
public class SuministrarAlimentos extends Animales implements Dieta {
    private Animales[] codanimal;
    private String tipo_dieta;
    
    public SuministrarAlimentos(String tipo_dieta){
        this.tipo_dieta=tipo_dieta;
        this.codanimal=new Animales['1'];
    }
    
    
    @Override
    public void establecer_dieta() {
        System.out.println("Se establece dieta de acuerdo al tipo de animal");
    }
    
}
