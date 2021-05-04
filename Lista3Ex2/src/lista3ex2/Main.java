/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, int codigoR, Object marcaR) {
        // TODO code application logic here
        
        int opc = 0;
        int codigo;
        String nome, marca, modelo;
        ArrayList<Pessoa> listPessoa = new ArrayList<>();
        Pessoa pessoaSelecionada = null;
        
        
        
        while (opc != 6){
            opc = Integer.parseInt(JOptionPane.showInputDialog
                    ("1 - Criar Pessoa" 
                    + "\n2 - Criar Automovel" 
                    + "\n3 - Transferir Automóvel" 
                    + "\n4 - Mostrar Todas Pessoas" 
                    + "\n5 - Mostrar Automóvel da Pessoa" 
                    + "\n6 - Sair"));
            
            if(opc == 2 || opc == 3 || opc == 5){
               codigo = JOptionPane.showInternalConfirmDialog(null,  "Digite o nome da Pessoa");
           for(Pessoa p : listPessoa){
               if(p.getCodigo() == codigo)
                   pessoaSelecionada = p;
               }
           if(pessoaSelecionada == null)
               continue;
            }
            
            switch(opc){
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Código: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    listPessoa.add(new Pessoa(codigo, nome));
                    break;
                    
                case 2:
                    marca = JOptionPane.showInputDialog("Marca do Carro: ");
                    modelo = JOptionPane.showInputDialog("Modelo: ");
                    pessoaSelecionada.inserirAutomovel(new Automovel(marca, modelo));
                    break;
                    
                case 3:
                 Pessoa pessoaReferencia = null;
                 Pessoa pessoaDestino = null;
                 
                     codigoR = Integer.parseInt(JOptionPane.showInputDialog("Código de pessoa referencia: "));
                     for (Pessoa p : listPessoa) {
                        if (p.getCodigo() == codigoR) {
                                pessoaReferencia = p;
                    }
                        }
                     int index = -1;
                    for (Automovel a : pessoaReferencia.getAutomoveis()){
                              if(a.getMarca().equals(marcaR)){
                        pessoaDestino.inserirAutomovel(a);
                    index = pessoaReferencia.getAutomoveis().index0f(a);
                            }
                        }
                    if (index >= 0) {
                    pessoaReferencia.removerAutomovel(index);
                            }
 
                    break;

                    
                case 4:
                    String msg = "";
                    for (Pessoa p : listPessoa){
                        msg += p.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, pessoaSelecionada.imprimirCompleto());
                    break;
                    
                case 6:
                    break;
                    
                default:
                    break;
            }
        }
    }
    
}
