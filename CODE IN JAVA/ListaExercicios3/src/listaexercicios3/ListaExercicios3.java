/*
Crie um programa que calcule a média de um aluno para a matéria de matemática. 
O aluno deve informar seu nome e as quatro notas da matéria.
 */
package listaexercicios3;

import java.util.Scanner;

public class ListaExercicios3 {

  
    public static void main(String[] args) {
        // Declarando variavel
        float n1, n2, n3, n4;
        float media;
        String nome1;
        Scanner nome = new Scanner (System.in);
        
            System.out.println("Qual o nome do aluno?");
            nome1 = nome.nextLine();
        
            Scanner notas = new Scanner (System.in);
            
            System.out.println("Digite a primeira nota");
            n1 = notas.nextFloat();
            
            System.out.println("Digite a segunda nota");
            n2 = notas.nextFloat();
          
            System.out.println("Digite a terceira nota");
            n3 = notas.nextFloat();
           
            System.out.println("Digite a quarta nota");
            n4 = notas.nextFloat();
            
            media = (n1 + n2 + n3 + n4) / 4;
            System.out.println("A media do " +nome1+ " é: " + media);
    }
    
}
