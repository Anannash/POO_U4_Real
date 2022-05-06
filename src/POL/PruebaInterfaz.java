/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POL;

/**
 *
 * @author ANDY
 */
public class PruebaInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PorPagar[] objetosPorPagar = new PorPagar[4];
       
       objetosPorPagar[0]=new Factura ("123","Laptop",5,12000.00);
       objetosPorPagar[1]=new Factura ("456","Tablet",2,85.00);
       objetosPorPagar[2]=new EmpleadoAsalariado ("Rodrigo","Diaz","1111",550.00);
       objetosPorPagar[3]=new EmpleadoAsalariado ("Veronica","Gallardo","2222",1555.00);
        System.out.println("Se muestra informacion de facturas y empelados procesados de maneras polimorfica");
        
        for(PorPagar porPagarActual: objetosPorPagar){
            System.out.printf("%s\n%s: $%,.2f\n\n",porPagarActual.toString(),"Pago VENCIDO",porPagarActual.obtenerMontoPago());
        }
    }
    
}
