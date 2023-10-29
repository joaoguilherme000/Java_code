package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
		int exe =1;
		
		System.out.println("\nEscolha um exercicio:");
		
        while(true){
            exe = 1;
            while(exe < 6){
            	System.out.println(" "+exe+ " - exercicio " + exe);
            	exe++;
            }
            System.out.println("ou "+ exe + " para sair");
            
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
                    System.out.println("1. Faça um algoritmo que leia uma matriz 15 X 15 de reais e calcule a soma dos elementos da diagonal secundária. \n");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("2. Faça um algoritmo que leia uma matriz 20x15 de inteiros. calcule e mostre a soma das linhas pares da matriz. \n");
                    exercicio2();
                    break;
                case 3:
                    System.out.println("3. Faça um algoritmo que leia uma matriz 20x20 de reais e some cada uma das linhas, armazenando o resultado da soma em um vetor. A seguir,  multiplique cada elemento pela soma da sua linha. Mostre a matriz resultante. \n");
                    exercicio3();
                    break;
                case 4:
                    System.out.println("4. Faça um algoritmo que leia uma matriz 50x50 de números reais e encontre o maior valor da matriz. A seguir, multiplique cada elemento da diagonal principal pelo maior valor. Mostre a matriz após as multiplicações. \n");
                    exercicio3();
                    break;
                case 5:
                    System.out.println("5. Faça um algoritmo que leia uma matriz 50x50 de números reais. A seguir, multiplique cada linha pelo elemento da diagonal principal daquela linha. Mostre a matriz após as multiplicações. \n");
                    exercicio3();
                    break;
                case 6:
                    System.out.println("\nSaindo do programa...");
                    return; // Sai do método e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void exercicio1() {
        
    }

    public static void exercicio2() {
        
    }

    public static void exercicio3() {
         
    }

    public static void exercicio4() {
      
    }

    public static void exercicio5() {
		
    }
    
  }
