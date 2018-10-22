public class Ambito {

  static final int CONSTANTE = 5; //es constante por el modificador final

  public static void main(String[] args){

    int variableDeMetodo = 12;
    variableDeMetodo++;
    System.out.println("Valor de la constante: " + CONSTANTE + ", valor de la variable: " + variableDeMetodo);    

      {

	int variableDeAmbito = 14;
        System.out.println("Valor de la constante: " + CONSTANTE + ", valor de la variable: " + variableDeMetodo + ", valor de la variable de ámbito: " + variableDeAmbito);    
        {
 
          variableDeAmbito = 15;
          System.out.println("Valor de la constante: " + CONSTANTE + ", valor de la variable: " + variableDeMetodo + ", valor de la variable de ámbito: " + variableDeAmbito);    

        }

      }
      {

	int variableDeAmbito = 16;
        System.out.println("Valor de la constante: " + CONSTANTE + ", valor de la variable: " + variableDeMetodo + ", valor de la variable de ámbito: " + variableDeAmbito);    

      }

      //  System.out.println("Valor de la constante: " + CONSTANTE + ", valor de la variable: " + variableDeMetodo + ", valor de la variable de ámbito: " + variableDeAmbito);    no visible variablDeAmbito

  }


}
