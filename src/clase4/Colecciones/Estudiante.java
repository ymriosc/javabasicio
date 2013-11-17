/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.Colecciones;

/**
 *
 * @author alumno
 */
public class Estudiante implements Comparable<Estudiante>{
//se va a comparar con el mismo estudiante
    private String nombres;
    private String apellidos;
    private String direccion;
    private int codMatricula;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    @Override
    public int compareTo(Estudiante o) {
        String apellidosExterno=o.getApellidos().toLowerCase();
        String apellidosLocal=this.getApellidos().toLowerCase();
        return  apellidosLocal.compareTo(apellidosExterno);
    }

    public Estudiante(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    public void printEstudiante(){
        System.out.println(this.apellidos+", " +this.nombres);
    }
        
}
