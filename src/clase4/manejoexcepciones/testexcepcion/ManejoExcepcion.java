/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.manejoexcepciones.testexcepcion;

/**
 *
 * @author alumno
 */
public class ManejoExcepcion {
    // en la clase main se ejecuta los metodos, esta se ejecuta siempre 
//cuando se ejecuta la clase

    public static void main(String[] args) {
        ManejoExcepcion.testExcepcion3();
    }
//declaro el metodo siempre con ()

    public static void testExcepcion() {
        int dividendo = 0;
        int divisor = 0;
        int resultado;

        resultado = dividendo / divisor;
    }

    public static void testExcepcion2() {
//dentro del try el primer error que se detecte es el que se va a mostrar        
        try {
            int dividendo = 0;
            int divisor = 0;
            int resultado;
            //resultado = dividendo / divisor;
            
            int[] array = new int[2];
            array[10]=100;
            
        }catch(ArrayIndexOutOfBoundsException nomerror){
            System.out.println("Hubo un error de Array ");            
        }catch(ArithmeticException nomerror ){
            System.out.println("Error Matematico");
        }finally{
            System.out.println("Fin del Programa");
        }
    }
    public static void testExcepcion3() {
        try{
            //int [] numeros = null;
            int [] numeros = {1,2,3,4};
            for (int i = 0; i < 11; i++) {
            int j = numeros[i];            
            }
            
        }catch(NullPointerException nomerror){
            System.out.println("Error Array Nulo");
            nomerror.printStackTrace(); //imprime la traza de error en desarrollo
        }finally{
            System.out.println("Aplicacion Terminada");
        }
     }
}
