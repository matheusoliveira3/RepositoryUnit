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
public class Funcionario {
    
//Atributos do Funcionário
    private int Cracha;
    private String Nome;
    private char TipoVinculo;
    private float ValorHora;
    private float QtdHora;
    private float Salario;
    private float ValorDesconto;
   
//Métodos para poder ser acessado e modifica os atributos
    public int getCracha() {
        return Cracha;
    }

    public void setCracha(int Cracha) {
        this.Cracha = Cracha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getTipoVinculo() {
        return TipoVinculo;
    }

    public void setTipoVinculo(char TipoVinculo) {
        this.TipoVinculo = TipoVinculo;
    }

    public float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(float ValorHora) {
        this.ValorHora = ValorHora;
    }

    public float getQtdHora() {
        return QtdHora;
    }

    public void setQtdHora(float QtdHora) {
        this.QtdHora = QtdHora;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto(float ValorDesconto) {
        this.ValorDesconto = ValorDesconto;
    }
    
//Cálculo do Salário 
    public float calcularSalario(){
       if(TipoVinculo == 'H'){
           return ValorHora * QtdHora - Salario;   
       } else {
           return Salario - ValorDesconto;
       }
}    
//Método de Impressão
    public String imprimir(){
        float salarioVerificado;
        if (TipoVinculo == 'H') {
            salarioVerificado = ValorHora * QtdHora;
        }else{
            salarioVerificado = Salario;
        }
        return "Crachá: " + Cracha + "\nNome: " + Nome + "\nTipo Vículo: " + TipoVinculo + 
                "\nSalário: " + salarioVerificado + 
                "\nDesconto: " + ValorDesconto + "\nValor a Receber: " + calcularSalario(); 
    }
}

