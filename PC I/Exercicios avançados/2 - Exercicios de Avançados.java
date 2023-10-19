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
                        String entradaNumero = JOptionPane.showInputDialog(null, "Numero :");
                        double numero = Integer.parseInt(entradaNumero);
                        
                        String entradaExpoente = JOptionPane.showInputDialog(null, "Expoente :");
                        double expoente = Integer.parseInt(entradaExpoente);

                        double resultado = Math.pow(numero, expoente);

                        JOptionPane.showMessageDialog(null, numero + " elevado a " + expoente + " é igual a " + resultado);
                        break;
                    }
                    break;
                case 2:
                    do{
                        String entradaNumero = JOptionPane.showInputDialog(null, "Numero :");
                        int numero = Integer.parseInt(entradaNumero);
                        
                        String entradaExpoente = JOptionPane.showInputDialog(null, "Expoente :");
                        int expoente = Integer.parseInt(entradaExpoente);

                        double resultado = Math.pow(numero, expoente);

                        JOptionPane.showMessageDialog(null, numero + " elevado a " + expoente + " é igual a " + resultado);
                        cont++;
                    }while(cont < 1);
                    break;
                case 3:
                    String entradaNumero = JOptionPane.showInputDialog(null, "Numero :");
                    int numero = Integer.parseInt(entradaNumero);

                    String entradaExpoente = JOptionPane.showInputDialog(null, "Expoente :");
                    int expoente = Integer.parseInt(entradaExpoente);

                    int resultado = 1;

                    for (int i = 0; i < expoente; i++) {
                        resultado *= numero;
                    }

                    JOptionPane.showMessageDialog(null, numero + " elevado a " + expoente + " é igual a " + resultado);
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
        String entrada = JOptionPane.showInputDialog(null, "Digite sua mensagem");
        String mensagem = "";
        
        for (int i = 0; i < entrada.length(); i++) { // o for pega o tamanho do que a pessoa escreveu
            char caractere = entrada.charAt(i);  // coloca numa variavel que foi criada

            if (caractere == ' ') { // se ele receber nada
                mensagem += "\n";
            } else {
                mensagem += caractere;
            }
        }
        
        JOptionPane.showMessageDialog(null,"Sua mensagem: \n" + mensagem);
    }
    
    public static void quarto(){
       
    }
    
}
