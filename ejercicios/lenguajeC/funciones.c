#include<stdio.h>


double doblar(double);

int main(void) {

	double valor = 2.52623556;
	double valor_doble = doblar(valor);
	printf("El valor doble de %.2f es %.2f\n", valor, valor_doble);
	return 0;

}

double doblar(double numero){
	return numero * 2;
}
