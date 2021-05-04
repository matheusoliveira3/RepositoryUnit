/*
Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre; 
a quantidade de pessoas com mais de 90 quilos; 
a media das idades das sete pessoas
 */
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {
    
public static void main(String[] args) {
       
//DECLARAÇÃO VARIAVEL
        int idade1, peso1, qntdpessoas, media, count1 = 0, count = 0, count2 = 0, soma = 0;
    
//SCANNER
        Scanner ler = new Scanner (System.in);
 
//DO
do  {
        System.out.print("Digite a idade: ");
        idade1 = ler.nextInt();
        count2++;
        soma = soma + idade1;
        System.out.print("Digite seu peso: ");
        peso1 = ler.nextInt();
        count1++;
        qntdpessoas = count1;

        
        if(peso1 > 90){           
            count++;
            System.out.print("São: " + count);
            System.out.println(" pessoas pesando mais que 90kg"); 
        }
       
    }while (qntdpessoas < 7);
          
           media = soma/7;
           System.out.println("Media: " + media);
} 
}


