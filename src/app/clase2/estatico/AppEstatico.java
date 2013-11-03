/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.estatico;

/**
 *
 * @author alumno
 */
public class AppEstatico {
    public static void main(String[] args) {
        
        AppEstatico.atributoEstatico();
        AppEstatico.metodoEstatico();
        
    }
    public static void metodoEstatico() {
        double euro=Estatico.dolaraEuro(100d);
        System.out.println(euro);
    }
    public static void atributoEstatico() {
        System.out.println(Estatico.contador);
        Estatico estaUno=new Estatico();
        Estatico estaDo=new Estatico();
        Estatico estaTre=new Estatico();
        System.out.println(Estatico.contador);
    }
}
