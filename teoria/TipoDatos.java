public class TipoDatos {

	public static void main( String[] args ){

		byte variableTipoByte = 127;
		//int variableTipoByte  = 128; no puede haber dos variable con el mismo nombre
		short variableTipoShort = 30_000 + 3;
		int variableTipoInt = 300_000_000;
		long variableTipoLong = 30_000_000_000l;
		
		float variableFloat = 2.5f;
		double variableDouble = 25555.2;
		double variableNotacionCientifica = 2.5e-7;
		double variableIniciadaEntera = 7;

		char variableChar = 'c';
		char variableCharUnicode = '\u0030';

		String cadena = "palabra";
		String cadenaConcatenada = cadena + " algo nuevo";

		boolean variableBoolean = true;
		boolean variableBooleanExpresion = 5 > 7;

		System.out.println(cadenaConcatenada);

	}

}
