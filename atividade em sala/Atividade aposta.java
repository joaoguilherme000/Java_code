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
                    JOptionPane.showMessageDialog(null, "Saindo...6"
                            + ""
                            + "");
                    return; // Sai do método e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


// A OUTRA CLASSE


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
        String mensagem = "";
        Random random = new Random();
        int[] vetor = new int[6];

        for(int i =0; i < 6; i++){
          vetor[i] = random.nextInt(50) + 1; 
          mensagem += vetor[i] + " | ";
        }
        
        JOptionPane.showMessageDialog(null, "Seu jogo: \n" + mensagem);
    }
    
    public static void lotofacil(){
        String mensagem = "";
        Random random = new Random();
        int[] vetor = new int[15];
        int[] vetor2 = new int[15];
        String mensagem2 = "";

        for(int i =0; i < 15; i++){
          vetor[i] = random.nextInt(25) + 1; 
          mensagem += vetor[i] + " | ";
          vetor2[i] = random.nextInt(25) + 1; 
          mensagem2 += vetor2[i] + " | ";
        }
        
        JOptionPane.showMessageDialog(null, "Seu jogo: \n\n" + mensagem +"\n" + mensagem2);
    }
    
}
