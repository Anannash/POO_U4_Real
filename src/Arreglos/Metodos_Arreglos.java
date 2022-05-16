/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Arrays;

/**
 *
 * @author ANDY
 */
public class Metodos_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se define y asigna valores tipo numerico al arreglo
        //  tipo []  nombre = {valores}
        double [] arregloDouble = {8.4,9.3,0.2,7.9,3.4};
        //se concatena Metodo .sort (orden ascendentes 
        Arrays.sort(arregloDouble);//todos los elementos los ordene de manera acedentes
        System.out.printf("\nArregloDouble: ");
        //se recorre y muestra los valores de cada uno de los elementos del arreglo 
        for(double valor:arregloDouble){
            System.out.printf("%.1f",valor);
        }
        //llenar arreglo definir tamano (10) con el numero 10
        int [] arreglo2= new int [10];
        //agregar elementos como el .add
        //(nombre, cuanto quieres que se muestre  )
        Arrays.fill(arreglo2, 10);
        mostrarArreglo (arreglo2,"arreglo2");
        
        //COPIAR el arreglo INT en el arreglo copiaArregloINT
        int[]ArregloInt = {1,2,3,4,5,6};
        int[] copiaArreglo2int = new int [ArregloInt.length];
        System.arraycopy(ArregloInt,0,copiaArreglo2int,0,ArregloInt.length);
        mostrarArreglo(copiaArreglo2int,"Copia de copiaArreglo2int");
        //comparar si arreglo2Int y copiaArreglo2int son o no iguales
        boolean b = Arrays.equals(ArregloInt, copiaArreglo2int);
        //                                                          true  false
        System.out.printf("\n\nArregloInt%s copiaArreglo2int\n",(b?"==":"!="));
        
        //comparar si arreglo2Int y arreglo2 son iguales
        b=Arrays.equals(ArregloInt, arreglo2);
        System.out.printf("ArregloInt%s arreglo2\n",(b?"==":"!="));
        //buscar en el arreglo el valor 5
        
        int ubicacion = Arrays.binarySearch(ArregloInt, 5);
        if(ubicacion>=0){
            System.out.printf("Se encontro elemento 5 en la posicion %d del arreglo ArregloInt\n",ubicacion);  
        }else{
            System.out.println("No se encontro el elemento 5");
        }
        //buscar el arregloInt el valor 8763
        ubicacion =Arrays.binarySearch(ArregloInt,8763);
        if(ubicacion>=0){
            System.out.printf("Se encontro el 8763 en la posicion %d de ArregloInt\n",ubicacion);
        }else{
            System.err.println("No se encontro el 8763 en ArregloInt:(");
        }
    }
    public static void mostrarArreglo (int[]arreglo,String descripcion){
        System.out.printf("\n%s: ",descripcion);
        for(int valor:arreglo){
            System.out.printf("%d", valor);
        }
    }
    
}
