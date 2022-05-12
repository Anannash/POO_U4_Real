/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosp1;

/**
 *
 * @author ANDY
 */
public class Informacion {
    String nombre;
    String carrera;
    int semestre;

    public Informacion(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return "El nombre del alumno es: "+nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return "La carrera es: "+carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return "El numero del Semestre es: "+semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Carrera :"+carrera);
        System.out.println("Semestre: "+semestre);
    }
   
}
