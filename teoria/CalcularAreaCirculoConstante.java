/******************************
 * Clase que calcula el valor 
 * del área de un círculo     
 * dado el radio 
 * declaramos constante PI             
 * @author  Manuel M.         
 * @version 1.0               
 * ***************************/

public class CalcularAreaCirculoConstante {
   
   public static void main( String[] args ) {
	final double PI = 3.14;
	/* declaro  e inicializo dos variables
	para albergar nº decimales (tipo double) */
	//PI = 3.1416; no se puede cambiar el valor de una constante
	double radio = 17.7;
	double area  = PI * radio * radio;
	//mostrar en consola el valor del resultado
   	System.out.println( "El área del circulo de radio " + radio + " vale " + area );

   }

}
