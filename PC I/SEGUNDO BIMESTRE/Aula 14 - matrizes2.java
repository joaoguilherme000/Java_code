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
                    exercicio4();
                    break;
                case 5:
                    System.out.println("5. Faça um algoritmo que leia uma matriz 50x50 de números reais. A seguir, multiplique cada linha pelo elemento da diagonal principal daquela linha. Mostre a matriz após as multiplicações. \n");
                    exercicio5();
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
        Random random =new Random();
         int [][] m = new int[15][15];
         double soma = 0;
         
         System.out.println("Matriz original: \n");
         for (int i = 0; i < 15; i++) {
    		for (int j = 0; j < 15; j++) {
        	m[i][j] = random.nextInt(19) -10;
        	System.out.print(m[i][j] + " ");
    		}
    		System.out.println();
         }

    	System.out.println("\nDiagonal Secundária: ");
    	
    	for (int i = 0; i < 15; i++) {
        	System.out.print(m[i][15 - i - 1]+" ");
    	}
    	
    	System.out.println();
    	
    	System.out.println("\nTotal: ");
    	
    	for (int i = 0; i < 15; i++) {
    	   soma += m[i][15 - i - 1];
        	System.out.print(" +"+ m[i][15 - i - 1]);
    	}
    	System.out.print(" = " + soma +" / 15 " +"\n média = " + soma / 15 +"\n") ;
    }

    public static void exercicio2() {
        Random random =new Random();
         int [][] m = new int[20][15];
         double soma = 0;
         
         System.out.println("Matriz original: \n");
         
         for (int i = 0; i < 20; i++) {
    		for (int j = 0; j < 15; j++) {
        	m[i][j] = random.nextInt(3)+1;
        	System.out.print(m[i][j] + " ");
    		}
    		System.out.println();
		}
		
		System.out.println("\nTotal: ");
		
		for (int i = 0; i < 20; i++) {
    		for (int j = 0; j < 15; j++) {
    			if (i %2 ==0){
    			soma += m[i][j];
				System.out.print(" +"+ m[i][j]);
    			}
    		}
    		System.out.println();
		}
		
		System.out.print(" = " + soma +" / 20 " +"\n média = " + soma / 20 +"\n") ;
    }

    public static void exercicio3() {
         Random random =new Random();
         int [][] m = new int[20][20];
         int [][] n = new int [20][20];
         int soma = 0;
         int[] resultado = new int [20];
         
         System.out.println("Matriz original: \n");
         
         for (int i = 0; i < 20; i++) {
    		for (int j = 0; j < 20; j++) {
        	m[i][j] = random.nextInt(3)+1;
        	System.out.print(m[i][j] + " ");
        	soma += m[i][j];
        	resultado[i] = soma;
    		}
    		soma = 0;
    		System.out.println();
		}
		
		System.out.println("\nVetor resultado:");
		
		for (int i = 0; i < 20; i++) {
    		System.out.print(resultado[i] + " ");
		}
		System.out.println();
		
		System.out.println("\nMatriz resultado:");
         
         for (int i = 0; i < 20; i++) {
    		for (int j = 0; j < 20; j++) {
        	n[i][j] = m[i][j] * resultado[i];
        	System.out.print(n[i][j] + " ");
    		}
    		System.out.println();
		}
		
    }

    public static void exercicio4() {
      Random random =new Random();
      int [][] m = new int[50][50];
      int maiorValor = m[0][0];
      
      System.out.println("\nMatriz original:");
      
      for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                m[i][j] = random.nextInt(21)-10;
        		System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nDiagonal Principal: ");
		
    	for (int i = 0; i < 50; i++) {
        	System.out.print(m[i][i] +" ");
    	}
    	System.out.println();
    	
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (m[i][j] > maiorValor) {
                    maiorValor = m[i][j];
                }
            }
        }
        System.out.println("\nO maior valor na matriz é: " + maiorValor);
       
        System.out.println("\nMatriz trocada: ");
        
        for (int i = 0; i < 50; i++) {
        	m[i][i] = m[i][i] * maiorValor;
    	}
        
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
        		System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exercicio5() {
    	Random random =new Random();
    	int [][] m = new int[50][50];
    	int diagonalPrincipal;
    	
    	System.out.println("\nMatriz original:");
      
     	for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                m[i][j] = random.nextInt(20)-10;
        		System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nDiagonal Principal: ");
		
    	for (int i = 0; i < 50; i++) {
        	System.out.print(m[i][i] +" ");
    	}
    	System.out.println();
        
        System.out.println("\nMatriz após multiplicação:");
    	for (int i = 0; i < 50; i++) {
        	diagonalPrincipal = m[i][i];
        	for (int j = 0; j < 50; j++) {
            	m[i][j] = diagonalPrincipal * m[i][j];
            	System.out.print(m[i][j] + " ");
        	}
        System.out.println();
    	}
    }
  }
