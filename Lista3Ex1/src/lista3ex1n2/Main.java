/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex1n2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import lista3ex1n2.Aluno;
import lista3ex1n2.Curso;

/**
 *
 * @author Moreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 6;
        String ra;
        String nome;
        int cargaHoraria;
        int codigo;
        ArrayList<Curso> listCurso = new ArrayList<>();
        Curso cursoSelecionado = null;
        
        Curso curso1 = null;
        Aluno aluno1 = null;
        
        while(opc !=6){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1 -  Criar Curso\n2 - Criar Aluno\n3 -  Remover Aluno\n4 -  Remover Aluno\n5 -  Mostrar alunos do curso\n6 - Sair"));
            if (opc == 2 || opc == 3 || opc == 5){
                cursoSelecionado = null;
                codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código: "));
                for(Curso c : listCurso){
                    if(c.getCodigo() == codigo)
                        cursoSelecionado = c;
                }
                if(cursoSelecionado == null)
                    continue;
            }
            switch (opc){
                case 1:
                    nome = JOptionPane.showInputDialog(null, "Nome do Curso: ");
                    codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Código do Curso: "));
                    cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog(null, "Carga Horária: "));
                    listCurso.add(new Curso(codigo, nome, cargaHoraria));
                    
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog(null, "Nome do Aluno: ");
                    ra = JOptionPane.showInputDialog(null, "Ra do Aluno: ");
                    cursoSelecionado.inserirAluno(new Aluno(ra, nome));
                    break;
                case 3:
                    ra = JOptionPane.showInputDialog("Digite o RA");
                    int index = -1;
                    for(Aluno a : cursoSelecionado.getAlunos()){
                        if(a.getRa().equals(ra))
                            index = cursoSelecionado.getAlunos().indexOf(a);
                    }
                    if(index >= 0)
                        cursoSelecionado.removerAluno(index);
                    break;
                case 4:
                    String msg = "";
                    for (Curso c : listCurso){
                        msg += c.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, cursoSelecionado.imprimirCompleto());
                    break;
                case 6:
                    break;    
        }
    }
    
}
}