/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//DECLARANDO AS VARIAVEIS.
        int cpf = 123456789;
        int senha = 123456;
        int senha1;
        int cont = 0;
        int menu;
        double saldo = 1000;
        double deposito = 0;
        double valortotal = 0;
        double valortotal2;
        double saque = 0;
        int a = 10;
//SCANNER
        Scanner ler = new Scanner (System.in);
        do {
//BOAS VINDAS
        System.out.println("Olá seja bem vindo!");
       
//INSERINDO DADOS
        System.out.println("Insira seu cpf");
        int cpf1 = ler.nextInt();
        
//VERIFICANDO CPF
        do{
        if(cpf1 == cpf){
            System.out.println("CPF CORRETO!");      
}       else {
            System.out.println("CPF INCORRETO, DIGITE NOVAMENTE");
            cpf1 = ler.nextInt();
            cont++;
} 
}       while (cpf1 != cpf);
        
           
//INSERINDO SENHA
        System.out.println("Insira sua senha");
        senha1 = ler.nextInt();

//VERIFICANDO SENHA        
        
        if(senha1 == senha){
            System.out.println("SENHA CORRETA!");      
}       else {
            System.out.println("SENHA INCORRETA, DIGITE NOVAMENTE");
            senha1 = ler.nextInt();
            cont++;
}           if (senha1 == senha){
            System.out.println();
}       else if (cont < 3){
            System.out.println("CONTA BLOQUEADA");
            System.exit(0);
}
       


//MENU DE OPÇÕES   
do {
            
            System.out.println("Sr(a) PORTADOR DO CPF: 123456789");
            System.out.println ("DIGITE 1 PARA MOSTRAR SALDO, 2 PARA DEPOSITAR, 3 PARA SACAR E 0 PARA SAIR");
            menu = ler.nextInt();
         
            switch (menu) {
                case 1:
                    System.out.println("SALDO");
                    System.out.println("VOCÊ SELECIONOU SALDO, E SEU SALDO ATUAL É: " + saldo);
                    break;
                case 2:
                    System.out.println("VOCÊ SELECIONOU DEPOSITO");
                    System.out.println("QUAL VALOR DO DEPÓSITO?");
                    deposito = ler.nextDouble();
                    System.out.println ("VOCÊ DEPOSITOU: " + deposito);                   
                    valortotal = saldo + deposito;
                    System.out.println("VALOR TOTAL PÓS DEPÓSITO: " + valortotal);
                    break;
                case 3:
                    System.out.println("VOCÊ SELECIONOU SACAR");
                    System.out.println("QUAL VALOR DESEJA SACAR?");
                    saque = ler.nextDouble();
                    System.out.println ("VOCÊ SACOU: " + saque);
                    valortotal2 = valortotal - saque;
                    System.out.println("VALOR TOTAL PÓS SAQUE: " + valortotal2);
                    break;
                case 0:
                    System.out.println("SAIR");
                    break;
                    
                default:
                    System.out.println("OPÇÃO INVALIDA, TENTE NOVAMENTE");
                    break; }
                        
        }while (menu != 0);
        }while (a != 0);
          
    }
}