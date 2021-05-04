/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1ex2;

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
       
        String ra;
        String nome;
        float ac1, ac2,  ag, af;
        Aluno aluno1 = null;
        int opc = 0;
       
       while (opc !=3){
           opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: \n1- Criar Aluno \n2- Consultar Aluno \n3- Sair"));
           
           switch (opc){
               case 1:
                   ra   =   JOptionPane.showInputDialog(null, "Ra: ");
                   nome =   JOptionPane.showInputDialog(null, "Nome: ");
                   ac1  =   Float.parseFloat (JOptionPane.showInputDialog(null, "Nota AC1: "));
                   ac2  =   Float.parseFloat (JOptionPane.showInputDialog(null, "Nota AC2: "));
                   ag   =   Float.parseFloat (JOptionPane.showInputDialog(null, "Nota AG: "));
                   af   =   Float.parseFloat (JOptionPane.showInputDialog(null, "Nota AF: "));                 
                   aluno1 = new Aluno();
                   aluno1.setRa(ra);
                   aluno1.setNome(nome);
                   aluno1.setAC1(ac1);
                   aluno1.setAC2(ac2);
                   aluno1.setAG(ag);
                   aluno1.setAF(af);
                   aluno1.calcularMedia();
                   break;
               case 2:
                   JOptionPane.showMessageDialog(null, aluno1.Imprimir());
                   break;
               case 3:
                   
                   break;
                   
               default: break;
               
           }
           
       }
    }
    
}
