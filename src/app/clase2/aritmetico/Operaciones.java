/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.aritmetico;

/**
 *
 * @author alumno
 */
public class Operaciones {

  

    public double suma(double a, double b) {
        double resultado = a + b;
        return resultado;
    }

    public int getMax(int a, int b) {
        int mayor = a;
        if (a > b) {
            mayor = a;
        } else if (a == b) {
            mayor = 0; //por ser iguales
        } else {
            mayor = b;
        }
        return mayor;
    }

    public float getMax(float a, float b) {
        float mayor = a;
        if (a > b) {
            mayor = a;
        } else if (a == b) {
            mayor = 0; //por ser iguales
        } else {
            mayor = b;
        }
        return mayor;
    }
    public int getMax(String mensaje){
        return 0;
    }
}
