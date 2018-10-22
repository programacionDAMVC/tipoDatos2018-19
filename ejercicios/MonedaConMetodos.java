public class MonedaConMetodos {
		
	private static final double EUROS_A_DOLARES = 1.15;
	private static final double DOLARES_A_EUROS = 0.86;

	public static void main(String[] args){

		double monedaACambiar1 = 7.999999999999;
		double monedaACambiar2 = 117.5;
		double monedaACambiar3 = 677.5;

		convertirEurosADolares(monedaACambiar1);
		convertirEurosADolares(monedaACambiar2);
		convertirEurosADolares(monedaACambiar3);
		convertirEurosADolares(100);
		convertirDolaresAEuros(100);
		convertirDolaresAEuros( (int) monedaACambiar1 );

	
	}

	public static void convertirEurosADolares(double euros){

		double dolares = euros * EUROS_A_DOLARES;
		System.out.println(euros + "€: " + dolares + "$");

	}

	public static void convertirDolaresAEuros(int dolares) {

		double euros = dolares * DOLARES_A_EUROS;
		System.out.println(dolares + "$: " + euros + "€");

	}


}
