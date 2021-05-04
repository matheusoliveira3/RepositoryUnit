/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1ex3;

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
        //Variavéis
        String nome; 
        int cracha; 
        char tipoVinculo;
        float valorHora, qtdHora, salario, valorDesconto;
        int opc = 0;
        
        Funcionario funcionario1 = null;
        
        while (opc != 4){
        
                   opc    = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: \n1- Inserir Funcionário \n2- Consultar Folha de Pagamento \n3- Alterar Remuneração \n4- Sair")) ;
            
            switch (opc){
                case 1:
                   
// Pede os valores 
                   nome   = JOptionPane.showInputDialog(null, "Nome: " );
                   cracha = Integer.parseInt(JOptionPane.showInputDialog(null, "Cracha: " ));
                   tipoVinculo = JOptionPane.showInputDialog("Tipo Vínculo: ").charAt(0);                                
                   qtdHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Quantidade de Horas Trabalhadas: "));
                   valorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor das Horas Trabalhadas: "));
                   valorDesconto = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do Desconto: "));     
                   salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Salário: "));
                  
// Coloca os valores recebidos nas váriaveis
                   funcionario1 = new Funcionario();
                   funcionario1.setNome(nome);
                   funcionario1.setCracha(cracha);
                   funcionario1.setTipoVinculo(tipoVinculo);
                   funcionario1.setQtdHora(qtdHora);
                   funcionario1.setValorHora(valorHora);
                   funcionario1.setValorDesconto(valorDesconto);
                   funcionario1.setSalario(salario);
                   break;
                    
                case 2: 
                    
                  JOptionPane.showMessageDialog(null, funcionario1.imprimir());
                   break;
                    
                case 3: 
                    
                   JOptionPane.showMessageDialog(null, "Alteração da Remuneração");
                   nome   = JOptionPane.showInputDialog(null, "Nome: " );
                   cracha = Integer.parseInt(JOptionPane.showInputDialog(null, "Cracha: " )) ;
                   tipoVinculo = JOptionPane.showInputDialog("Tipo Vínculo: ").charAt(0); 
                   qtdHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Quantidade de Horas Trabalhadas: "));
                   valorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor das Horas Trabalhadas: "));
                   valorDesconto = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do Desconto: "));
                   
                   funcionario1.setNome(nome);
                   funcionario1.setCracha(cracha);
                   funcionario1.setTipoVinculo(tipoVinculo);
                   funcionario1.setQtdHora(qtdHora);
                   funcionario1.setValorHora(valorHora);
                   funcionario1.setValorDesconto(valorDesconto);
                   funcionario1.calcularSalario();                    
                    break;
                    
                case 4:                    
                    break;
                    
                default:
                      JOptionPane.showMessageDialog(null, "Opção inválida!","Atenção",JOptionPane.ERROR_MESSAGE);
                    break;
                    
            }
        }
    }
    
}
