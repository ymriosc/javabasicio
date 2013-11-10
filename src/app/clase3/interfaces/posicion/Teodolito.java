/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfaces.posicion;

/**
 *
 * @author alumno
 */
public class Teodolito {
    // clase que va permite comparar la distancia entre dos objetos 

    public static void main(String[] args) {
        Posicion carro = new Auto(20, 30);
        Posicion monica = new Persona(50, 20);
        Teodolito.getDistancia(carro, monica);
    }

    public static void getDistancia(Posicion p1, Posicion p2) {
        //double resultado=p2.getLongitud() - p1.getLongitud();
        double d1 = p1.getLatitud() - p2.getLatitud();
        double d2 = p1.getLongitud() - p2.getLongitud();
        System.out.println(Math.sqrt(d1 * d1 + d2 * d2));
    }
}
