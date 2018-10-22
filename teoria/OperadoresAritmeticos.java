public class OperadoresAritmeticos {
	public static void main(String[] args){
				
		int variable = 5;
		System.out.println(variable++ + " debe salir 5");
		System.out.println(variable + " debe salir 6");

		int otraVariable = variable++ + variable++;
		System.out.println(--otraVariable + " debe salir 12");
		System.out.println(variable + " debe salir 8");


	}
}
