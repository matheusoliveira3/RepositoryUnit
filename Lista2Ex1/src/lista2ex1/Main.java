/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        int numero, idade;
        char sexo;
        double valorAutomovel;
       
        //criando objeto
        Apolice apolice = null;
        
        int opc = 0;
        
        while(opc !=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1 -  Criar Apólice\n2 - Mostrar Apólice\n3 - Sair")); 
            
            switch (opc){
                case 1: 
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                    sexo = JOptionPane.showInputDialog("Sexo: ").toUpperCase().charAt(0);
                    valorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Valor Automovel: "));
                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    break;
                case 2: 
                    JOptionPane.showMessageDialog(null, apolice.imprimir());
                    break;
                case 3: 
                    
                    break;
                default: break;
            }
            
        }
    }
    
}
