/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesmultiples;

/**
 *
 * @author Juana García
 */
public class EdificioDeOficinas implements Edificio {
    private int numeroDeOficinas;
    private double ancho;
    private double largo;
    private int numeroDePisos;
   
    public  EdificioDeOficinas () {
        numeroDeOficinas = 0;
        ancho = 0;
        largo = 0;
        numeroDePisos = 0;
    }

    public EdificioDeOficinas(int numeroDeOficinas, double ancho, double largo, int numeroDePisos) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.ancho = ancho;
        this.largo = largo;
        this.numeroDePisos = numeroDePisos;
    }

   
    public void setNumeroDeOficinas (int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }
   
    public void setAncho (double ancho) {
        this.ancho = ancho;
    }
   
    public void setLargo (double largo) {
        this.largo = largo;
    }
   
    public void setNumeroDePisos (int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }
   
    public int getNumeroDeOficinas () {
        return numeroDeOficinas;
    }
   
    public double getLargo () {
        return largo;
    }
   
    public double getAncho () {
        return ancho;
    }
   
    public int getNumeroDePisos () {
        return numeroDePisos;
    }
      @Override
    public double getSuperficieEdificio () {
        return ancho * largo * numeroDePisos;
    }
      @Override
    public String toString () {
        return "\n"+"Edificio de " + getSuperficieEdificio() + "\n"+" metros de superficie, con " + getNumeroDePisos() +"\n"+ " pisos, que alojan a " + getNumeroDeOficinas() + " oficinas"+"\n";
    }
}
