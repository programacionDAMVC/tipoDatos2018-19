public class TestUnidades {

	public static void main ( String[] args ) {

		double libras = 130.32;
		double acres  = 3;

		double kilogramos = Unidades.convertirLibrasAKilogramos( libras );
		double hectareas  = Unidades.convertirAcresAHectareas( (int) acres );

		System.out.println(libras + " libras son " + kilogramos + " kg");
		System.out.println(acres  + " acres  son " + hectareas   + " hectareas");

	}

}
