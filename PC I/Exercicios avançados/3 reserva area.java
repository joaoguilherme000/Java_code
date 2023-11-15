package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
		
		System.out.println("\nEscolha: \n Consultar:  1\n Efetuar cadastro:  2\n Sair:  3.");
		
            do {
                if (scanner.hasNextInt()) {
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha <= 0) {
                        System.out.println("Escolha somente os numeros que aparecem no menu.");
                    }
                } else {
                    System.out.println("Invalido, deve ser um numero inteiro");
                    scanner.nextLine(); // pra nao dar erro
                    escolha = 0;
                }

            } while (escolha <= 0);
            
            switch(escolha){
                case 1:
                    System.out.println("Consultar\n");
                    consultar();
                    break;
                case 2:
                    System.out.println("Efetuar cadastro\n");
                    cadastrar();
                    break;
                case 3:
                    System.out.println("\nSaindo do programa...");
                    return; // Sai do método e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    
    public static void consultar () {
    	
    }
    
    public static void cadastrar () {
    	
    }
}
