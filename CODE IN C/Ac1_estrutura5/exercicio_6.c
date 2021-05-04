// EXERCICIO 6 DA LISTA AC1




#include <stdio.h>
#include <stdlib.h>


int retorno(void)
{
    int numero;
    int resultado;

        printf("\n Ola, por favor digite um numero: ");
        scanf("%d", &numero);

        resultado = numero * 10 / 100;

        printf("Dez porcento do valor informado sera: %d", resultado);
}


    int main()
{
    retorno();
}
