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
            while(exe < 10){
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
                    System.out.println("1. Faça um programa que carregue uma matriz 5 X 5 de números reais. A seguir, multiplique cada linha pelo elemento da diagonal principal daquela linha. Mostre a matriz após as multiplicações. \n");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("2. Faça um programa que carregue: \numa matriz 5 X 4 com os preços dos cinco produtos em 4 lojas diferentes \n um outro vetor com o custo do transporte dos 5 produtos \nCalcule uma segunda matriz 5 X 4 com os valores dos impostos de cada produto, sendo que estes obedecem a tabela abaixo:\n\n Preço % de imposto \n até 50 5\n entre 50 e 100 (inclusive) 10 \n Acima de 100 15\n \n Imprima um relatório com o número do produto, o número da loja onde o produto se encontra, o valor do imposto a pagar, o custo de transporte, o preço e o preço final (preço mais imposto mais custo do transporte) \n");
                    exercicio2();
                    break;
                case 3:
                    System.out.println("3. Faça um programa que receba as vendas de 5 produtos, em 3 lojas diferentes e em dois meses consecutivos, armazenar estas vendas em duas matrizes 5 x 3. O bimestre é uma matriz 5 x 3, resultado a soma das duas matrizes anteriores. Calcule e imprima:\n \n • as vendas de cada produto em cada loja no bimestre; \n• a maior venda do bimestre; \n• o total vendido por cada loja no bimestre; \n • o total vendido de cada produto no bimestre. \n");
                    exercicio3();
                    break;
                case 4:
                    System.out.println("4. Na teoria dos sistemas define-se como elemento MAXMIN de uma matriz como sendo o maior elemento da linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 X 7 com números reais, calcule e imprima seu MAXMIN e sua posição. \n");
                    exercicio4();
                    break;
                case 5:
                    System.out.println("5. Faça um programa que carregue uma matriz 5 X 3 com as notas de 5 alunos em 3 provas. Mostre um relatório com o número do aluno (número da linha) e a prova que cada aluno obteve menor nota. Ao final do relatório mostrar quantos alunos tiveram menor nota na prova 1, quantos alunos tiveram menor nota na prova 2 e quantos alunos tiveram menor nota na prova 3.  \n");
                    exercicio5();
                    break;
                case 6:
                	System.out.print("Faça um programa que carregue uma matriz 4 X 3 com números inteiros e some cada uma das linhas, armazenando o resultado da soma em um vetor. A seguir, multiplique cada elemento da matriz pela soma da linha e mostre a matriz resultante. \n");
                	exercicio6();
                	break;
               case 7:
                	System.out.print("Faça um programa que carregue: \nUm vetor com 5 números inteiros; \nUm outro vetor com 10 números inteiros;\nUma matriz 4 X 3, também com números inteiros;\n \nCalcule e imprima:\n\n O maior elemento do primeiro vetor multiplicado pelo menor elemento do segundo vetor e o resultado desta multiplicação vai gerar uma segunda matriz, onde cada elemento da matriz digitada será somado ao resultado da multiplicação; \n A soma dos elementos pares de cada linha da matriz resultante;\n A quantidade de elementos entre 1 e 5 em cada coluna da matriz resultante.\n");
                	exercicio7();
                	break;
                case 8:
                	System.out.print(" Faça um programa que receba o estoque atual de 3 produtos que estão armazenados em 4 armazéns o coloque estes dados em uma matriz 5 x 3. Sendo que a última linha da matriz contém o custo de cada produto. Calcule e imprima: \n \n a quantidade de itens armazenados em cada armazém;\n •a quantidade de cada produto armazenado;\n •qual o armazém que possui maior estoque do produto 2;\n •qual o armazém que possui menor estoque, todos os produtos juntos;\n• qual o custo total de cada produto;\n•qual o custo total de cada armazém.\n \nDesconsiderar empates.\n");
                	exercicio8();
                	break;
                case 9:
                	System.out.print("Faça um programa que receba as vendas semanais (de um mês) de 5 vendedores de uma loja e armazene essas vendas em uma matriz. Calcule e imprima:\n  \n• total de vendas do mês de cada vendedor;\n • total de vendas de cada semana (todos os vendedores juntos); \n • total de vendas do mês.\n");
                	exercicio9();
                	break;
                case 10:
                    System.out.println("\nSaindo do programa...");
                    return; // Sai do método e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void exercicio1() {
        Random random =new Random();
    	int [][] m = new int[5][5];
    	int diagonalPrincipal;
    	
    	System.out.println("\nMatriz original:");
      
     	for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = random.nextInt(20)-10;
        		System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nDiagonal Principal: ");
		
    	for (int i = 0; i < 5; i++) {
        	System.out.print(m[i][i] +" ");
    	}
    	System.out.println();
        
        System.out.println("\nMatriz após multiplicação:");
    	for (int i = 0; i < 5; i++) {
        	diagonalPrincipal = m[i][i];
        	for (int j = 0; j < 5; j++) {
            	m[i][j] = diagonalPrincipal * m[i][j];
            	System.out.print(m[i][j] + " ");
        	}
        System.out.println();
    	}
    }

    public static void exercicio2() {
        
    }
    
    public static void exercicio3() {
        
    }
    
    public static void exercicio4() {
        
    }
    
    public static void exercicio5() {
        
    }
    
    public static void exercicio6() {
        
    }
    
    public static void exercicio7() {
        
    }
    
    public static void exercicio8() {
        
    }
    
    public static void exercicio9() {
        
    }
				}
