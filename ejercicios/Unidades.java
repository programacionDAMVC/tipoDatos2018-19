/**
 * Clase Unidades, que nos sirve para 
 * convertir distinto tipos de unidas
 * @author Manuel Molino
 * @version 1.0
 * */

public class Unidades {

	/**Constante para convetir de libras a kilogramos */
	public static final double LIBRAS_A_KILOGRAMO = 0.453592;
	/**Constante para convetir de acres a hectáreas */
	public static final float  ACRES_A_HECTARES   = 0.404686f;

	/**Método convertirLibrasAkilogramos que convierte
	 * las libras a kilogramos
	 * @param libras a convertir
	 * @return operación de convertir libras a kilogramos*/
	public static double convertirLibrasAKilogramos( double libras ){

		return libras * LIBRAS_A_KILOGRAMO;	

	}
	
	/**Método convertirAcreaAHectares que convierte
         * las acres a hectares
         * @param acres a convertir
         * @return operación de convertir acres a hectáreas*/

	public static double convertirAcresAHectareas( int acres ){

		return acres * ACRES_A_HECTARES;

	}

}
