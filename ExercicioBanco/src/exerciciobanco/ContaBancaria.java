/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciobanco;

/**
 *
 * @author mathe
 */
public class ContaBancaria {
    private String banco;
    private String conta;
    private String agencia;
    private String tipo;
    private double valorSaldo;
    private double valorLimite;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    public ContaBancaria(){}
    public ContaBancaria (String banco, String conta, String agencia, String tipo){
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.tipo = tipo;
    }
    
    public ContaBancaria (String banco, String agencia, String conta, String tipo, double valorSaldo, double valorLimite){
    this(banco, conta, agencia, tipo);
    this.valorLimite = valorLimite;
    this.valorSaldo = valorSaldo;
            }
    
    public void depositar (double valor){
    
    }
    }
}
