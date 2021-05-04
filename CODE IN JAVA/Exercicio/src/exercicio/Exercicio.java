package exercicio;
public class Exercicio {

    public static void main(String[] args) {
           
        int linha = 3;
        int coluna = 3;
        int matriz [][] = new int [linha][coluna];
        int numero = 5;
        
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                matriz [linha][coluna] = numero;
                numero++;
            }
            
        }
          for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.println("[" + linha + "]" + "[" + coluna + "]" + matriz[linha][coluna]);
            }
            
        }
       
    }
}
