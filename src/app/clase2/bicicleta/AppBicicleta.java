/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.bicicleta;

/**
 *
 * @author alumno
 */
public class AppBicicleta {
        public static void main(String[] args){
            Bicicleta bicicleta=new Bicicleta();
            bicicleta.setMarca("Monark");
            bicicleta.setModelo("123");
            
            bicicleta.cambiarLlantas();
            System.out.println(bicicleta.getMarca());
        }
    
}
