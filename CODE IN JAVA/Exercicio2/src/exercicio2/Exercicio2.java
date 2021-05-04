/*
Crie um programa que troque os valores que estão armazenados nas variáveis nome1 e nome2. 
A variável nome1 armazenara o valor “mestre do universo”. 
A variável nome2 receberá um valor informado pelo usuário. 
Altere os valores das variáveis e exiba a soma da variável nome1 com o valor da variável nome2.
 */
package exercicio2;

import java.util.Scanner;


public class Exercicio2 {

   
    public static void main(String[] args) {
        String nome1;
        String nome2;
        String aux;
        Scanner ler = new Scanner (System.in);
        
        nome1 = " é o mestre da porra toda!!";
        nome2 = "";
        System.out.println("Digite seu nome!");
        nome2 = ler.nextLine();
        
        aux = nome2;
        nome2 = nome1;
        nome1 = aux;
        System.out.println(nome1+nome2);
    } 
}
    
    
