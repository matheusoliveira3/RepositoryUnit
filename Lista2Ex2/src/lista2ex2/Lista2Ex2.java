/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Lista2Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int codigo;
        double percComissao, valorVenda;
       
        //criando objeto
        Vendedor vendedor = null;
        
        int opc = 0;
        
        while(opc !=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1 -  Cadastrar Vendedor\n2 - Calcular venda\n3 - Sair"));
            
            switch (opc){
                case 1: 
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Código: "));
                    nome =   JOptionPane.showInputDialog("Nome: ");                                  
                    percComissao = Double.parseDouble(JOptionPane.showInputDialog("Percentual da Comissao: "));
                    valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Valor da Venda: "));
                    vendedor = new Vendedor(codigo, nome, percComissao);
                    
                    
                    vendedor.setCodigo(codigo);
                    vendedor.setNome(nome);
                    vendedor.setPercComissao(percComissao);
                    vendedor.setValorVenda(valorVenda);
                   
                    break;
                
                case 2: 
                    
                    JOptionPane.showMessageDialog(null, vendedor.imprimir());
                    break;
                
                case 3:  break;
                default: break;
            }
    }
    
}
}
