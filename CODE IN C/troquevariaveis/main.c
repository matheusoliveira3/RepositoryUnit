/** Escreva um programa que recebe dois n�meros e os armazena em vari�veis. Em seguida, usando ponteiros, troque as vari�veis de valor.
 */
#include <stdio.h>
#include <stdlib.h>

int main()
{
   int a, b, x;

   printf("digite um n�mero: ");
   scanf("d", &a);

   printf("digite um outro n�mero: ");
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
