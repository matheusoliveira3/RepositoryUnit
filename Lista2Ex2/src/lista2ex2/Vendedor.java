/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex2;

/**
 *
 * @author mathe
 */
public class Vendedor {
   private int codigo;
   private String nome;
   private double percComissao;
   private double desconto;
   private double valorVenda;
   
   
   public Vendedor(){}
   
   public Vendedor(int codigo, String nome, double percComissao){}
   
   public double calcularPagamentoComissao(double valorVenda){
        return valorVenda * percComissao / 100;
   }
   
   public double calcularPagamentoComissao (){
        return calcularPagamentoComissao (valorVenda) - desconto;
   }
   
   public String imprimir( ){
       return   "Código: "             + codigo +          "\n"
               + "Nome: "              + nome   +          "\n"
               + "Valor Venda: "       + valorVenda +      "\n"
               + "% Comissão: "        + percComissao +    "\n"
               + "Valor a Pagar: "     + calcularPagamentoComissao();
       
   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
   
   
}
