// EXERCICIO 2 DA LISTA AC1







//Fa�a um programa para avaliar a conce��o de um financiamento pessoal. O programa deve receber o
//sal�rio, o valor do financiamento e a quantidade de parcelas. A financeira oferece juros a 0% e
//parcelas fixas de igual valor.
//a. Se o valor da parcela exceder a um ter�o do sal�rio, o programa dever� exibir a mensagem
//"Financiamento negado", caso contr�rio, deveria exibir a mensagem "Financiamento
//concedido".
//b. Ao final, independente do resultado, o programa dever� encerrar com a mensagem "Obrigado
//pela consulta".

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int salario;
    int valorfi;
    int qntparc;
    int valorparc;
    int umterc;

        printf("\n Digite qual e o seu salario: ");
            scanf("%d", &salario);

        printf("\n Qual o valor do financiamento: ");
            scanf("%d", &valorfi);

        printf("\n Qual a quantidade de parcelas que desejas?: ");
            scanf("%d", &qntparc);

        valorparc = valorfi / qntparc;

        umterc = salario / 3;


    if (valorparc > umterc)
       {
          printf("\n Financiamento Negado");
       }

    else
       {
         printf("\n Financiamento Aprovado");
       }

            printf("\n Obrigado por nos consultar");



}
