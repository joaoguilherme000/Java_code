xercicio7() {
    	
    }

    public static void exercicio8() {
    }

    public static void exercicio9() {
		
    }

    public static void exercicio10() {
		
    }

    public static void exercicio11() {
		
    }

    public static void exercicio12() {

    }
    }
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
            exe =1;
            while(exe < 13){
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
                    System.out.println("1 - Elaborar um algoritmo que le duas matrizes M(2,2) e N(2,2) e cria uma matriz que seja: a) o produto de M por N; b) a soma de M com N;  c) a diferenca de M com N;\n");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("2. Escrever um algoritmo que le uma matriz M(3,3) e a escreve. Troque, a seguir:  \na) a linha 0 com a linha 2 \nb) a coluna 0 com a coluna  1  \nEscreva a matriz assim modificada.\n");
                    exercicio2();
                    break;
                case 3:
                    System.out.println("3. Escrever um algoritmo que le uma matriz M(10,10) e a escreve. Troque, a seguir:  \na) a diagonal principal com a diagonal secundaria  \nb) a linha 5 com a coluna 10.\n  Escreva a matriz assim modificada. \n");
                    exercicio3();
                    break;
                case 4:
                    System.out.println("4.  Escrever um algoritmo que le uma matriz M(12,13) e divida todos os  13 elementos de cada uma das  12 linhas de M pelo maior elemento em modulo daquela linha. Escrever a matriz lida e a modificada.\n");
                    exercicio4();
                    break;
                case 5:
                    System.out.println("5. Escrever um algoritmo que le uma matriz M(5,5) e cria 2 vetores SL(5) e SC(5) que contenham, respectivamente, as somas das linhas e das colunas de M. Escrever a matriz e os vetores criados. \n");
                    exercicio5();
                    break;
                case 6:
                    System.out.println("6.  Escreva um algoritmo que le uma matriz M[5,5]. Substitua, a seguir, todos os valores negativos da matriz pelo seu modulo. Exemplo: substitua -2 por 2, -16 por 16, assim por diante. \n");
                    exercicio6();
                    break;
                case 7:
                    System.out.println("7. Escreva  um  algoritmo  que  le  uma  matriz  M[6,6].  A  seguir,  troque  os  elementos  da  primeira  coluna  com  os elementos  da  segunda coluna,  os  da terceira coluna  com a quarta  coluna  e  os  elementos da quinta coluna com os elementos da sexta coluna.\n");
                    exercicio7();
                    break;
                case 8:
                    System.out.println("8.  Repita o exercicio anterior, trocando os elementos das linhas, ao inves das colunas.\n");
                    exercicio8();
                    break;
                case 9:
                    System.out.println("9. Leia uma matriz M[5,5]. A seguir, ordene os elementos da matriz M e mostre como ficou a Matriz ordenada, linha por linha. \n");
                    exercicio9();
                    break;
                case 10:
                    System.out.println("10. Faça um algoritmo que calcule a m  dia dos elementos da diagonal principal de uma matriz 10 X 10 de numeros.  \n");
                    exercicio10();
                    break;
                case 11:
                    System.out.println("11.Faça um algoritmo que calcule a m  dia dos elementos da diagonal secundaria de uma matriz 10 X 10 de numeros.   \n");
                    exercicio11();
                    break;
                case 12:
                    System.out.println("12. Faça um algoritmo que gere a seguinte matriz: \n1 1 1 1 1 1 \n1 2 2 2 2 1 \n1 2 3 3 2 1 \n1 2 3 3 2 1 \n1 2 2 2 2 1 \n1 1 1 1 1 1 \n");
                    exercicio12();
                    break;
                case 13:
                    System.out.println("\nSaindo do programa...");
                    return; // Sai do método e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void exercicio1() {
        double [][] m = {{1, 2}, {4, 5}};  // Cria e inicializa uma matriz
        double [][] n = {{3,6}, {7,8}};
        double [][] resultado = new double [2][2];
        
        System.out.println("Matriz original: \n");
        
        for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 2; j++) {
        	System.out.print(m[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		System.out.println("\nMatriz2 original: \n");
		
		for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 2; j++) {
        	System.out.print(n[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		System.out.println("\nMatriz Resultado produto: \n");
		
		for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 2; j++) {
        	resultado[i][j] = m[i][j] * n[i][j];
        	System.out.println(m[i][j]+" * "+n[i][j]+ " = "+resultado[i][j]);
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		System.out.println("\nMatriz Resultado soma: \n");
		
		for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 2; j++) {
        	resultado[i][j] = m[i][j] + n[i][j];
        	System.out.println(m[i][j]+" + "+n[i][j]+ " = "+resultado[i][j]);
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		System.out.println("\nVetor Resultado diferença: \n");
		
		for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 2; j++) {
        	resultado[i][j] = m[i][j] - n[i][j];
        	System.out.println(m[i][j]+" - "+n[i][j]+ " = "+resultado[i][j]);
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
    }

    public static void exercicio2() {
        // Random random = new Random();
        
        int [][] m = {{1,9,1},{9,9,9},{3,3,3}};
        // int [][] n = new int[3][3];
        
        System.out.println("Matriz original: \n");
        
        for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j++) {
        	System.out.print(m[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		// Troca a linha 0 com a linha 2
		if(true){
		  int[] temp = m[0];
    		m[0] = m[2];
    		m[2] = temp;	
		}
		System.out.println("\nMatriz linha e coluna: \n");
    	
        for (int l = 0; l < 3; l++) {
        	int tempValue = m[l][0];
        	m[l][0] = m[l][1];
        	m[l][1] = tempValue;
    		for (int c = 0; c < 3; c++) {
        		System.out.print(m[l][c] + " ");
    		}
    		
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		/*
		for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j++) {
        	n[i][j] = random.nextInt(201);
    		}
		}
		
		System.out.println("Matriz original n: \n");
        
        for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j++) {
        	System.out.print(n[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		// Troca a linha 0 com a linha 2
    		int[] temp = n[0];
    		n[0] = n[2];
    		n[2] = temp;
    		
		System.out.println("\nMatriz linha e coluna n: \n");
    	
        for (int l = 0; l < 3; l++) {
        	int tempValue = n[l][0];
        	n[l][0] = n[l][1];
        	n[l][1] = tempValue;
    		for (int c = 0; c < 3; c++) {
        		System.out.print(n[l][c] + " ");
    		}
    		
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}*/
    }

    public static void exercicio3() {
         Random random =new Random();
         int [][] m = new int[10][10];
         
         for (int i = 0; i < 10; i++) {
    		for (int j = 0; j < 10; j++) {
        	m[i][j] = random.nextInt(3);
    		}
		}
        
        System.out.println("Matriz original: \n");
        
        for (int i = 0; i < 10; i++) {
    		for (int j = 0; j < 10; j++) {
        	System.out.print(m[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		System.out.println("\nDiagonal Principal: ");
		
    	for (int i = 0; i < 10; i++) {
        	System.out.print(m[i][i] +" ");
    	}
    	System.out.println();

    	System.out.println("\nDiagonal Secundária: ");
    	
    	for (int i = 0; i < 10; i++) {
        	System.out.print(m[i][10 - i - 1]+" ");
    	}
    	System.out.println();
    	
    	for (int i = 0; i < 10; i++) {
        	int temp = m[i][i];
        	m[i][i] = m[i][10 -i - 1];
        	m[i][10 -i - 1] = temp;
    	}
    	
    	System.out.println();
    	System.out.println("Matriz diagonal: \n");
        
        for (int i = 0; i < 10; i++) {
    		for (int j = 0; j < 10; j++) {
        	System.out.print(m[i][j] + " ");
    		}
    	System.out.println();
		}
		
		System.out.println("\nlinha 5: ");
		for (int i = 0; i < 10; i++) {
    		System.out.print(m[4][i] + " ");
		}
		
		System.out.println("\n\nColuna 10: ");
		for (int i = 0; i < 10; i++) {
    		System.out.print(m[i][9] + " ");
		}
		
		for (int i = 0; i < 10; i++) {
    		int temp = m[4][i];
    		m[4][i] = m[i][9];
    		m[i][9] = temp;
		}
		System.out.println();
		System.out.println("\nMatriz diagonal e linha 5 com coluna 10: \n");

		for (int i = 0; i < 10; i++) {
    		for (int j = 0; j < 10; j++) {
        		System.out.print(m[i][j] + " ");
   		 }
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		System.out.println();
    }

    public static void exercicio4() {
      Random random =new Random();
      int [][] m = new int[12][13];
      
      System.out.println("Matriz original: \n");
        
        for (int i = 0; i < 12; i++) {
    		for (int j = 0; j < 13; j++) {
    		m[i][j] = random.nextInt(3);
        	System.out.print(m[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
    }

    public static void exercicio5() {
		Random random =new Random();
    	int [][] m = new int[5][5];
    	int [] sl = new int [5];
    	int [] sc = new int [5];
      
      System.out.println("Matriz original: \n");
        
        for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
    		m[i][j] = random.nextInt(2);
        	System.out.print(m[i][j] + " ");
        	sl[i] += m[i][j];
        	sc[j] += m[i][j];
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		System.out.println("\nVetor SL\n");
		
		for (int i = 0; i < 5; i++) {
        	System.out.println(m[i][0] + " + " +m[i][1] + " + " +m[i][2] + " + " +m[i][3]+ " + " +m[i][4]  + " = "+ sl[i] + " ");
		}
		System.out.println();
		
		System.out.println("\nVetor SC\n");
		
		for (int i = 0; i < 5; i++) {
        	System.out.println(m[0][i] + " + " +m[1][i] + " + " +m[2][i] + " + " +m[3][i]+ " + " +m[4][i]  + " = "+ sc[i] + " ");
		}
		System.out.println();
    }

    public static void exercicio6() {
		Random random =new Random();
    	int [][] m = new int[5][5];
    	
    	System.out.println("Matriz original: \n");
        
        for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
    		m[i][j] = random.nextInt(11)-6;
        	System.out.print(m[i][j] + " ");
        	if(m[i][j] < 0){
        		m[i][j] = m[i][j] - m[i][j]  - m[i][j];
    		}
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		System.out.println("Matriz trocada: \n");
		for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
        	System.out.print(m[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
    }

    public static void exercicio7() {
    	Random random =new Random();
    	int [][] m = new int[6][6];
    	int [][] n = new int [6][6];
    	
    	System.out.println("Matriz original: \n");
        
        for (int i = 0; i < 6; i++) {
    		for (int j = 0; j < 6; j++) {
    			m[i][j] = random.nextInt(3);
        		System.out.print(m[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
		System.out.println("Matriz trocada: \n");
        
        for (int i = 0; i < 6; i++) {
        	n[i][0] = m[i][1];
        	n[i][1] = m[i][0];
        	n[i][2] = m[i][3];
        	n[i][3] = m[i][2];
        	n[i][4] = m[i][5];
        	n[i][5] = m[i][4];
    	
		}
		
		for (int i = 0; i < 6; i++) {
    		for (int j = 0; j < 6; j++) {
        		System.out.print(n[i][j] + " ");
    		}
    	System.out.println(); // Pular para a próxima linha após cada linha da matriz
		}
		
    }

    public static void exercicio8() {
    	
    }

    public static void exercicio9() {
		
    }

    public static void exercicio10() {
		
    }

    public static void exercicio11() {
		
    }

    public static void exercicio12() {

    }
			    }
