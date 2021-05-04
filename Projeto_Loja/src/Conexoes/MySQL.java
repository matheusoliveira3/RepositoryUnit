
package Conexoes;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class MySQL {
    private Connection conn = null; //Variavel de conexão com o banco
    private Statement statement; //Variavel de manipulação do SQL (pode usar os códigos SQL no netbeans)
    
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "banco_loja";
    private String usuario = "root";
    private String senha = "Mineiroo1!";
    
    //Construtor - um vazio para pode usar as informações (atributos) que ja defini

    public MySQL(){}

    // GETTER AND SETTER - Só pega o connection e o statement por que os outros atributos, são sensiveis e não podem ser alterado, entao não há necessidade de set e dar get!
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
    
    //Duas funcões, uma para abrir o banco e outra para fechar
    //Pois não é seguro deixar sempre aberto o banco

    public void conectaBanco(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco, usuario, senha);
            if (conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }
        } catch (Exception e){
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
    

}
