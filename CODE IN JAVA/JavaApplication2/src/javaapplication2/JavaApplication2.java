/*
 Escreva um algoritmo que calcule a média dos números digitados pelo usuário
se eles forem pares. Termine a leitura se o usuário digitar zero (0).


 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0, media = 0, count = 0;
        int nota1 = 0, nota2 = 0, nota3 = 0, codigo = 0;
        Scanner ler = new Scanner (System.in);
        
        
        System.out.println("DIGITE A NOTA 1");
        nota1 = ler.nextInt();
        soma = soma + nota1;
        
        System.out.println("DIGITE A NOTA 2");
        nota2 = ler.nextInt();
        soma = soma + nota2;
        
        System.out.println("DIGITE A NOTA 3");
        nota3 = ler.nextInt();
        soma = soma + nota3;
        
        System.out.println("DIGITE O CODIGO DO ALUNO");
        codigo = ler.nextInt();
        
        
        while(codigo > 0){
        System.out.println("DIGITE A NOTA 1");
        nota1 = ler.nextInt();
        soma = soma + nota1;
        
        System.out.println("DIGITE A NOTA 2");
        nota2 = ler.nextInt();
        soma = soma + nota2;
        
        System.out.println("DIGITE A NOTA 3");
        nota3 = ler.nextInt();
        soma = soma + nota3;
        count++;
        
        System.out.println("DIGITE O CODIGO DO ALUNO");
        codigo = ler.nextInt();
        
        soma = nota1 + nota2 + nota3;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Count: " + count);
        media = soma/count;
        System.out.println("Média: " + media);
        
}
}


     

