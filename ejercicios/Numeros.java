/**
* Esta clase define objetos que contienen
* un atributo denominado número
* y posee un método para devolver
* el valor doble
* @author Manuel Molino
* @version 1.0
*/
public class Numeros{
	private int numero; //propiedad de los objetos.
	/**
	* Constructor: es un método que tiene
	* el mismo nombre que la clase y se
	* usa para crear objetos
	* @param n parámetro para inicializar el objeto
	* se usa para inicializar los objetos
	* de tipo número
	*/
	public Numeros(int numero){
		this.numero = numero;
	}
	/**
	* método que devuelve el valor doble
	* @return el valor doble del atributo
	* numero de dicho objeto.
	*/
	public int calcularDoble(){
		return numero * 2;
	}
	/**
	* método que devuelve el valor triple
	* @return el valor triple del atributo
	* numero de dicho objeto.
	*/
	public int calcularTriple(){
		return numero * 3;
	}
	/**
	* método que devuelve el valor mitad 
	* @return el valor mitad del atributo
	* numero de dicho objeto.
	*/
	public double calcularMitad(){
		return numero / 2.0;
	}
}

//clase para comprobar el funcionamiento de la
//clase anterior
class TestNumeros {
	public static void main(String[] arg){
		//Creo uno objeto de tipo Número
		Numeros n1 = new Numeros(5);
		//Imprimo su valor doble
		System.out.println("Valor doble: "+n1.calcularDoble());
		System.out.println("Valor triple: "+n1.calcularTriple());
		System.out.println("Valor mitad: "+n1.calcularMitad());
	}
}
