/**
Crie e exiba um  array com todos os números de 0 até 10.
 */
#include <stdio.h>
#include <stdlib.h>

int main()
{
   int a[11]; //um array de inteiros com 11 elementos
   int i=0; // indice

   //preenche o array
   while (i<=10){
    a[i] = i;
    i++;
   }

   //exibe o array
   i=0;
   while(i<=10){
    printf("%d\n", a[i]);
    i++;
   }

}


