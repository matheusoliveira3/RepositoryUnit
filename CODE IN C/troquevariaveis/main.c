/** Escreva um programa que recebe dois números e os armazena em variáveis. Em seguida, usando ponteiros, troque as variáveis de valor.
 */
#include <stdio.h>
#include <stdlib.h>

int main()
{
   int a, b, x;

   printf("digite um número: ");
   scanf("d", &a);

   printf("digite um outro número: ");
   scanf("d", &b);

   printf("a=%d\n", a);
   printf("b=%d\n", b);

  //criando ponteiros
  int *pa = &a;
  int *pb = &b;
  int *px = &x;

  *px = *pa;
  *pa = *pb;
  *pb = *px;

   printf("Trocando ...  \n");

   printf("a=%d\n", a);
   printf("b=%d\n", b);


}
