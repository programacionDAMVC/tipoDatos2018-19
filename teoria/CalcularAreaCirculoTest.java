/******************************
 * Clase que calcula el valor 
 * del área de un círculo     
 * dado el radio              
 * @author  Manuel M.         
 * @version 1.0               
 * ***************************/

public class CalcularAreaCirculoTest {
   
   public static void main( String[] args ) {

	/* declaro  e inicializo dos variables
	para albergar nº decimales (tipo double) */
	double radio = 17.7;
	double area  = 3.14 * radio * radio;
	//mostrar en consola el valor del resultado
   	System.out.println( "El área del circulo de radio " + radio + " vale " + area );

   }

}
