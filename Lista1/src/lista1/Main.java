/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Main {

    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = null;
        String nome, cpf, sexo;
        int idade;
        
        int opc = 0;
        while (opc != 3){
           opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n 1- Inserir\n 2- Consultar\n 3- Sair ")) ;
            
            switch (opc){
                case 1: 
                   nome =  JOptionPane.showInputDialog(null,"Nome: ");
                   cpf =   JOptionPane.showInputDialog(null,"CPF: ");
                   sexo =  JOptionPane.showInputDialog(null,"Sexo: ");
                   idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Idade: "));
                   pessoa1 = new Pessoa();
                   pessoa1.setNome(nome);
                   pessoa1.setCPF(cpf);
                   pessoa1.setSexo(sexo);
                   pessoa1.setIdade(idade);
                    break;
                case 2: 
                    JOptionPane.showMessageDialog(null, pessoa1.Imprimir());
                    break;
                case 3: 
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opção Inválida","Atenção", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    
}
