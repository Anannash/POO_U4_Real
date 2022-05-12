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
public class Datosp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Informacion info = new Informacion("Hector","Informatica",2);
       //encapsular 
       String NumCon = info.getNombre()+" \n"+info.getCarrera()+" \n"+info.getSemestre()+"\n";
        System.out.println("Datos del alumno: \n"+NumCon);
       ////////////////////////////
        System.out.println("\n");
      info.setNombre("Elena");
      info.getNombre();
      info.setCarrera("Ing.Sistemas");
      info.setSemestre(2);
      info.MostrarDatos();
      /////////////////////////////////////////
        System.out.println("\n");
      Informacion info2= new Informacion("Sandra","Arquitectura",3);
      info2.MostrarDatos();
        System.out.println("TEC2");
        System.out.println("TEC2 / 7:34P.M.");
  
    }
    
}
    

