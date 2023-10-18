

package main;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        while(true){
            String x = JOptionPane.showInputDialog(null, "Escolha \n 1 - Cem vezes \n 2 - Expoente \n 5 - Sair");
            int escolhaInt = Integer.parseInt(x);
            
            switch(escolhaInt){
                case 1:
                    Menu.primeiro();
                    break;
                case 2:
                    Menu.segundo();
                    break;
                case 3:
                    Menu.terceiro();
                    break;
                case 4:
                    Menu.quarto();
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

// A OUTRA CLASSE


package main;

import java.util.Random;
import javax.swing.JOptionPane;


public class Menu {
    public static String meuNome = "nome ";
    
    public static void primeiro(){
       while(true){
            String x = JOptionPane.showInputDialog(null, "Escolha \n 1 - while \n 2 - do while \n 3 - for \n 5 - Sair");
            int escolhaInt = Integer.parseInt(x);
            int nome = 0;
            
            switch(escolhaInt){
                case 1:
                    while(true){
                        nome ++;
                        System.out.println(meuNome + nome);
                        if(nome == 100){
                            break;
                        }
                    }
                    break;
                case 2:
                    do{
                        nome ++;
                        System.out.println(meuNome + nome);
                    }while(nome < 100);
                    break;
                case 3:
                    for(int i =0; i < 100; i++){
                        System.out.println(meuNome + i);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    return; // Sai do método e encerra o programa
                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma opção valida !");
            }
        }
    }

    public static void segundo(){
        while(true){
            String x = JOptionPane.showInputDialog(null, "Escolha \n 1 - while \n 2 - do while \n 3 - for \n 5 - Sair");
            int escolhaInt = Integer.parseInt(x);
            int cont = 0;
            
            switch(escolhaInt){
                case 1:
                    while(true){
                        cont ++;
                        System.out.println(meuNome + cont);
                        if(cont == 100){
                            break;
                        }
                    }
                    break;
                case 2:
                    do{
                        cont ++;
                        System.out.println(meuNome + cont);
                    }while(cont < 100);
                    break;
                case 3:
                    for(int i =0; i < 100; i++){
                        System.out.println(meuNome + i);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    return; // Sai do método e encerra o programa
                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma opção valida !");
            }
        }
    }
    
    public static void terceiro(){
        
    }
    
    public static void quarto(){
       
    }
    
}
