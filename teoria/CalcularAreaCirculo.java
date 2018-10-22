public class CalcularAreaCirculo {

   public static void main( String[] args ) {

	//defino dos variables para albergar nº decimales (tipo double)
	double radio;
	double area;
	//inicializamos las variables 
	radio = 17.7;
	area  = 3.14 * radio * radio;
	//mostrar en consola el valor del resultado
	System.out.println( "El área del circulo de radio " + radio + " vale " + area );
   }

}
