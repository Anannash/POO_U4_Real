/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


/**
 *
 * @author Amdrea M
 */
import POL.*;
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //accediendo al poli
         System.out.println("Se procesan empleados por separado\n");
         //se llama la clase   -  se crear objeto-  se asigna memoria-   se repite el nombre de la case-  se asigna los argumentos
         EmpleadoAsalariado EA= new EmpleadoAsalariado("Andrea","Morales","QW8",5000000);
         System.out.printf("%s\n%s: $%, .2f\n\n",EA,"INGESOS",EA.ingresos());
        /////////////////////////////////////////////////////////////////////////////////////
        EmpleadoBaseMasComision EBMC= new EmpleadoBaseMasComision("Sandra","Chavez","WY0",50,.50,10000);
        System.out.printf("%s\n%s: $%, .2f\n\n",EBMC,"INGRERSOS",EBMC.ingresos());
         ////////////////////////////////////////////////////////////////////////////////
         EmpleadoPorHoras EH= new EmpleadoPorHoras("Mario","Gomez","J7D",5000000,6);
         System.out.printf("%s\n%s: $%, .2f\n\n",EH,"INGRESOS",EH.ingresos());
         ///////////////////////////////////////////////////////////////////////////////
         EmpleadoPorComision EC= new EmpleadoPorComision("Hector","Ramirez","DJ8",21.5,.5);
         System.out.printf("%s\n%s: $%, .2f\n\n",EC,"INGRESOS",EC.ingresos());
      
       //Se crea arreglo de tamano 4
       Empleado[] empleados = new Empleado[4];
       empleados[0]= EA;
       empleados[1]= EBMC;
       empleados[2]=EH;
       empleados[3]=EC;
        System.out.println("///////////////////////////////////////////////////////////");
       for(Empleado empeladoActual:empleados){
           //se invoca al metodo To String (me ayuda a obtener los valores de mi objeto)
           System.out.println(empeladoActual);//al colocar este objeto trae el ToString
           if(empeladoActual instanceof EmpleadoBaseMasComision){ 
           EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision)empeladoActual;
           empleado.establecerSalarioBase(1.10*empleado.obtenerSalarioBase());
       }
       }
       }
    }
    