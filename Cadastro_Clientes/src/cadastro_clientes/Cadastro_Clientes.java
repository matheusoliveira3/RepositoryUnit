//Olá, nessa atividade iremos realizar o Ciclo de Desenvolvimento (Começo, meio e fim) de uma aplicação Java de forma bem simplificada. Iremos codificar, criar telas e realizar controle de versão em repositório, essas habilidades são parte presente no dia-a-dia do desenvolvedor.

//1 - Criar o diagrama de classe para um Cadastro de Clientes (loja). [2,5 pontos]

//2 - Códificar em Java o diagrama de classes criado (Classes, atributos e métodos). [2,5 pontos]

//3 - Desenvolver a Interface do Usuário para o Cadastro de Clientes (loja). [2,5 pontos]

//4 - Versionar o Cadastrado Cliente no Github (comitar). [2,5 pontos]

//Deverá ser enviado o link do projeto no Github contendo o código Java e o print da Tela desenvolvida.

//Material de suporte:

//Exemplo de cadastro de cliente em Java (tutorial): https://pinhatadev.wordpress.com/2016/04/12/sistema-basico-de-cadastro-usando-java-em-netbeans-e-mysql-parte-1/ (Links para um site externo.)

//Exemplo de Classes, métodos e atributos em Java para cadastro de clientes: https://issuu.com/arturguitelar/docs/trabalho-java-sistema-vers__o-web (Links para um site externo.)

//Git para iniciantes: https://rogerdudler.github.io/git-guide/index.pt_BR.html


package cadastro_clientes;
public class Cadastro_Clientes {
    
    public static void main(String[] args) {
       TelaUI formulario = new TelaUI();
       
        //Objeto
        pessoas cliente = new pessoas(formulario.nome, formulario.cpf, "Sorocaba", "Rua Jemima Luiza", "SP");
        
        
        
        
        
        
        
        
    }
    
}
