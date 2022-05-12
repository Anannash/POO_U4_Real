/*
Se desarrolla java class factura en la cual contendra el metodo principal mismo \
que se invocara en la interface ""
 */
package POL;

/**
 *
 * @author ANDY
 */
public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripacionPieza;
    private int cantidad;
    private double PrecioPorArticulo;

    public Factura(String Pieza, String descripcion, int cuenta, double precio) {
        this.numeroPieza = Pieza;
        this.descripacionPieza = descripcion;
        //invocar o asignar metodos para el manejo (asignacion de las variables cantidad/precioPorArticulo)
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);
    }
    public void establecerNumeroPieza(String Pieza){
    numeroPieza=Pieza;
    }
public String ObtenerNumeroPieza(){
    return numeroPieza;
}
    public void establecerDescripcionPieza(String descripcion){
        descripacionPieza=descripcion;
    }
    public String obtenerDescripcionPieza(){
        return descripacionPieza;
    }
    public void establecerCantidad(int cuenta){
        if(cuenta>=0){
            cantidad=cuenta;
        }else{
            throw new IllegalArgumentException ("La cantidad debe ser mayor o igual a 0");//ecepciones
        }
        }
    public int obtenerCantidad(){
        return cantidad;
    }
    public void establecerPrecioPorArticulo(double precio){
        if(precio>=0){
            PrecioPorArticulo=precio;
        }else{
            throw new IllegalArgumentException("El precio del articulo debe se4r mayor o igual a cero");
        }
    }
        public double obtenerPrecioPorArticulo(){
            return PrecioPorArticulo;
        }
        @Override//se sobreescribe los metodos
        
        //to String =recuperar o obtener todos los objetos de las java class
        public String toString (){
            //% marca    ----   
            //%s==espera un valor de retorno tipo String, pero tambien agregar un String---%s, d%---regrsar valor tipo entero int, .2f------ valor tipo de double
            return String.format("%s:\n%s:  %s(%s)\n%s: d% \n%s: $%,.2f","Factura", "Numero de pieza", ObtenerNumeroPieza(),"Cantidad",obtenerCantidad(),"Precio por Articulo",obtenerPrecioPorArticulo());
        }
        @Override
        public double obtenerMontoPago(){
            //se calculo o de3termina el costo Total
        return obtenerCantidad()*obtenerPrecioPorArticulo();
        }
    }    
        

