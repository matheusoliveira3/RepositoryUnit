/*
Crie um programa que exiba a tabuada de um número informado pelo usuário.
 */
package listaexercicios1;

import java.util.Scanner;

public class ListaExercicios1 {

    public static void main(String[] args) {
       //Declaração das variaveis
       int n;
       int resultado;
       Scanner ler = new Scanner (System.in);
       
        System.out.println("Digite o número que deseja saber a tabuada");
        n = ler.nextInt();
        
        System.out.println("Certo, irei lhe mostrar tabuada deste numero");
        
        System.out.println(n+ " * 1 = " +(n * 1));
        System.out.println(n+ " * 2 = " +(n * 2));
        System.out.println(n+ " * 3 = " +(n * 3));
        System.out.println(n+ " * 4 = " +(n * 4));
        System.out.println(n+ " * 5 = " +(n * 5));
        System.out.println(n+ " * 6 = " +(n * 6));
        System.out.println(n+ " * 7 = " +(n * 7));
        System.out.println(n+ " * 8 = " +(n * 8));
        System.out.println(n+ " * 9 = " +(n * 9));
        System.out.println(n+ " * 10 = " +(n * 10));
    }
    
}
