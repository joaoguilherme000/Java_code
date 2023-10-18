

package main;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        while(true){
            String x = JOptionPane.showInputDialog(null, "Escolha \n 1 - Quina \n 2 - Sena \n 3 - Duplasena \n 4 - Lotofacil \n 5 - Sair");
            int escolhaInt = Integer.parseInt(x);
            
            switch(escolhaInt){
                case 1:
                    Menu.quina();
                    break;
                case 2:
                    Menu.megasena();
                    break;
                case 3:
                    Menu.duplasena();
                    break;
                case 4:
                    Menu.lotofacil();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    return; // Sai do método e encerra o programa
                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma opção valida !");
            }
        }
    }
}

// A outra classe 


package main;

import java.util.Random;
import javax.swing.JOptionPane;


public class Menu {
    
    public static void quina(){
        Random random = new Random();
        String mensagem = "";
        int[] vetor = new int[5];

        for(int i =0; i < 5; i++){
          vetor[i] = random.nextInt(80) + 1; 
          mensagem += vetor[i] + " | ";
        }

        JOptionPane.showMessageDialog(null, "Seu jogo: \n" + mensagem);

    }
    
    public static void megasena(){
        String mensagem = "";
        Random random = new Random();
        int[] vetor = new int[5];

        for(int i =0; i < 5; i++){
          vetor[i] = random.nextInt(80) + 1; 
          mensagem += vetor[i] + " | ";
        }
        
        JOptionPane.showMessageDialog(null, "Seu jogo: \n" + mensagem);
        
    }
    
    public static void duplasena(){
        Random random = new Random();
        int[] vetor = new int[12]; // 12 números no total

        for (int i = 0; i < 12; i++) {
            vetor[i] = random.nextInt(50) + 1;
        }

        String mensagem = "Seu jogo:\n";
        for (int i = 0; i < 12; i++) {
            mensagem += vetor[i] + " | ";
            if (i == 5) {
                mensagem += "\n"; // Quebra a linha após cada conjunto de 6 números
            }
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static void lotofacil(){
        Random random = new Random();
        int[] vetor = new int[15];
        
        for (int i = 0; i < 15; i++) {
            vetor[i] = random.nextInt(25) + 1; // O sorteio é de 1 a 25 para a Lotofácil
        }

        String mensagem = "";

        for (int i = 0; i < 15; i++) {
            mensagem += vetor[i] + " | ";
            if ((i + 1) % 15 == 0) {
                mensagem += "\n"; // Quebra a linha após cada conjunto de 5 números
            }
        }

        JOptionPane.showMessageDialog(null, "Seu jogo:\n" + mensagem);
    }
    
}
