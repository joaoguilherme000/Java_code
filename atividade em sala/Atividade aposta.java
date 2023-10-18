

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
