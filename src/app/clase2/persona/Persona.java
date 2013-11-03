/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.persona;

/**
 *
 * @author alumno
 */
public class Persona {
    public String nombre;
    public String apellidos;
    public int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public Persona(){}
     
    public void nombresapellidos(String nombre,String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;       
        
    }
    
    public void imprimirnombapell(){
        System.out.println(this.nombre+" "+ this.apellidos);
        
    }
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
            
}
