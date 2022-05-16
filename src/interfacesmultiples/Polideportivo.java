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
public class Polideportivo  implements InstalacionDeportiva, Edificio{
    private double largo;
    private double ancho;
    private String nombre;
    private String tipoInstalacion;
   
    public Polideportivo () {
        largo = 0;
        ancho = 0;
        nombre = "";
        tipoInstalacion = "";
    }
   
    public Polideportivo (double largo, double ancho, String nombre, String tipoInstalacion) {
        this.largo = largo;
        this.ancho = ancho;
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }
   
    public void setLargo (double largo) {
        this.largo = largo;
    }
   
    public void setAncho (double ancho) {
        this.ancho = ancho;
    }
   
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
   
    public void setTipoInstalacion (String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
   
    public double getLargo () {
        return largo;
    }
   
    public double getAncho () {
        return ancho;
    }
   
    public String getNombre () {
        return nombre;
    }
    @Override
    public double getSuperficieEdificio () {
        return ancho * largo;
    }
   
    @Override
    public int getTipoInstalacion () {
        if (tipoInstalacion.equals("Techado")) {
            return 1;
        } else if (tipoInstalacion.equals("Abierto")) {
            return 2;
        } else {
            return 3;
        }
    }
   @Override
    public String toString () {
        return "\n"+"Polideportivo " + getNombre() + "\n"+": Posee una superficie de " + getSuperficieEdificio() + " metros, y es de tipo " + tipoInstalacion+"\n";
    }
}
