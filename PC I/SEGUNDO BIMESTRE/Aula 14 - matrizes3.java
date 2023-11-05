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
                	System.out.print("6. Faça um programa que carregue uma matriz 4 X 3 com números inteiros e some cada uma das linhas, armazenando o resultado da soma em um vetor. A seguir, multiplique cada elemento da matriz pela soma da linha e mostre a matriz resultante. \n");
                	exercicio6();
                	break;
               case 7:
                	System.out.print("7. Faça um programa que carregue: \nUm vetor com 5 números inteiros; \nUm outro vetor com 10 números inteiros;\nUma matriz 4 X 3, também com números inteiros;\n \nCalcule e imprima:\n\n O maior elemento do primeiro vetor multiplicado pelo menor elemento do segundo vetor e o resultado desta multiplicação vai gerar uma segunda matriz, onde cada elemento da matriz digitada será somado ao resultado da multiplicação; \n A soma dos elementos pares de cada linha da matriz resultante;\n A quantidade de elementos entre 1 e 5 em cada coluna da matriz resultante.\n");
                	exercicio7();
                	break;
                case 8:
                	System.out.print(" 8. Faça um programa que receba o estoque atual de 3 produtos que estão armazenados em 4 armazéns o coloque estes dados em uma matriz 5 x 3. Sendo que a última linha da matriz contém o custo de cada produto. Calcule e imprima: \n \n a quantidade de itens armazenados em cada armazém;\n •a quantidade de cada produto armazenado;\n •qual o armazém que possui maior estoque do produto 2;\n •qual o armazém que possui menor estoque, todos os produtos juntos;\n• qual o custo total de cada produto;\n•qual o custo total de cada armazém.\n \nDesconsiderar empates.\n");
                	exercicio8();
                	break;
                case 9:
                	System.out.print("9. Faça um programa que receba as vendas semanais (de um mês) de 5 vendedores de uma loja e armazene essas vendas em uma matriz. Calcule e imprima:\n  \n• total de vendas do mês de cada vendedor;\n • total de vendas de cada semana (todos os vendedores juntos); \n • total de vendas do mês.\n");
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
        Random random =new Random();
    	int [][] m = new int[4][5];
    	double [][] impostos = new double [4][5];
    	int [] transporte = new int [4];
    	
    	// colocando os produtos
    	    	
    	for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = random.nextInt(200) +1;
        		System.out.printf("%3d ",m[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        
        // colocando os impostos
    	
    	for (int i = 0; i < 4; i++) {
    	      for (int j = 0; j < 5; j++) {
                if(m[i][j] <= 50){
    	       	impostos[i][j] = 0.05;
    	       }else if(m[i][j] >= 51 && m[i][j] <= 100){
    	       	impostos[i][j] = 0.10;
    	       }else  if(m[i][j] > 100){
    	       	impostos[i][j] = 0.15;
    	       }else {
    	       	impostos[i][j] = 666; // invocando o diabo
    	       }
        		System.out.printf("%.2f ",impostos[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        // colocando o transporte
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                transporte[i] += m[i][j] ;
            }
            System.out.print("Valor do transporte: R$"+transporte[i] + " ");
            System.out.println();
        }
        
        System.out.println();
        
        // Chama função buscarAleatorio
        buscarAleatorio(m, impostos, transporte, random);
        System.out.println();
    }
    
    public static void exercicio3() {
        Random random =new Random();
    	int [][] matriz1 = new int[3][5];
    	int [][] matriz2 = new int[3][5];
    	int [][] soma = new int [3][5];
    	int [] venda = new int [3];
    	
    	System.out.println(" Mês 1: ");
    	for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz1[i][j] = random.nextInt(200) +1;
        		System.out.printf("%3d ", matriz1[i][j]);
            }
            System.out.println("  Loja: "+ (i+1));
        }
        
        System.out.println("        +");
     
        System.out.println(" Mês 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz2[i][j] = random.nextInt(200) +1;
        		System.out.printf("%3d ",matriz2[i][j]);
            }
            System.out.println("  Loja: "+ (i+1));
        }
        
        System.out.println();
        
        System.out.println(" SOMA: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
        		System.out.printf("%3d ",soma[i][j]);
            }
            System.out.println("  Loja: "+ (i+1));
        }
        
        System.out.println();
        
        int maiorValor = soma[0][0]; // Inicializa com o primeiro valor da matriz

        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                if (soma[i][j] > maiorValor) {
                    maiorValor = soma[i][j];
                }
            }
        }

        System.out.println("O maior venda do bimestre: R$" + maiorValor);
        
        System.out.println("\nTotal de vendas das lojas: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                venda[i] += soma[i][j] ;
            }
            System.out.printf("R$ %3d ",venda[i]);
            System.out.println("  Loja: "+ (i+1));
        }
       
        int total = 0;
        
        System.out.println("\nTotal de todos os produtos: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                total += soma[i][j] ;
            }
        }
        System.out.println("R$" + total);
        
        System.out.println();
    }
    
    public static void exercicio4() {
    	Random random = new Random();
    	int[][] m = new int[4][7];
    	int[] linhaMaior = new int[4];


    	System.out.println(" Matriz: ");
    	for (int i = 0; i < 4; i++) {
        	linhaMaior[i] = m[i][0]; // Inicialize com o primeiro valor da linha
        	for (int j = 0; j < 7; j++) {
            	m[i][j] = random.nextInt(200) + 1;
            	System.out.printf("%3d ", m[i][j]);
        	}
        	System.out.println("  Linha: "+ (i+1));
    	}

    	System.out.println();
    	
    	int menorValor = m[0][0];
    
    	for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 7; j++) {
            	if (m[i][j] < menorValor) {
                	menorValor = m[i][j];
            	}
            	if (m[i][j] > linhaMaior[i]) {
                	linhaMaior[i] = m[i][j];
            	}
        	}
        	System.out.printf("Menor | Maior  " + "%3d | %d\n", menorValor,linhaMaior[i]);
        	menorValor = 999999;
    	}

    	System.out.println();

	}
    
    public static void exercicio5() {
    	Random random = new Random(); 
    	int[][] m = new int[5][3];
    	int [] provas = new int [3];
     	
    	System.out.println(" Prova: ");
		for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 3; j++) {
            	m[i][j] = random.nextInt(11);
    			System.out.printf("%3d", m[i][j]);
        	}
        	System.out.println("    Aluno: "+ (i+1));
    	}
    
    	int menorValor = m[0][0];
    	int prova = 0;
    
    	System.out.println("\nCada prova que cada aluno tirou a menor nota");
    
    	System.out.println();
		for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 3; j++) {
            	if (m[i][j] < menorValor) {
            		menorValor = m[i][j];
            		prova = j;
            	}
        	}
        	System.out.printf("Prova: " +(prova+1)+ "  Menor: "+ "%3d", menorValor);
        	System.out.println("    Aluno: "+ (i+1));
        	menorValor = 9999;
        	provas[prova]++; // Incrementa a contagem de alunos com nota baixa na prova correspondente.
    	}

    	System.out.println("\nQuantidade de alunos da prova 1: " + provas[0]);
    	System.out.println("Quantidade de alunos da prova 2: " + provas[1]);
    	System.out.println("Quantidade de alunos da prova 3: " + provas[2]);
	}

    
    public static void exercicio6() {
        Random random = new Random();
        int [][] m = new int [4][3];
        int [] soma = new int[4];
        
        System.out.println("\n Matriz: 1");
		for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 3; j++) {
            	m[i][j] = random.nextInt(3)+1;
    			System.out.printf("%3d", m[i][j]);
    			soma[i] += m[i][j];
        	}
        	System.out.println();
    	}
    	
    	System.out.println("\n Vetor Soma: ");
		for (int i = 0; i < 4; i++) {
		    System.out.printf(" %2d",soma[i]);
        	System.out.println();
    	}
    	
    	System.out.println("\n Resultado: ");
		for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 3; j++) {
            	m[i][j] *= soma[i];
    			System.out.printf("%3d", m[i][j]);
        	}
        	System.out.println();
    	}
    }
    
    public static void exercicio7() {
        Random random = new Random();
        int [] vetor = new int [5];
        int [] outroVetor = new int[10];
        int [][] m = new int [4][3];
        int valor = 0;
        int use = 0;
        
        System.out.println("\n Vetor: ");
		for (int i = 0; i < 4; i++) {
        	vetor[i] = random.nextInt(51)+1;
    		System.out.printf(" %2d", vetor[i]);
    		if (vetor[i] > valor) {
            	valor = vetor[i];
        	}
    	}
    	
    	System.out.println();
    	
    	System.out.printf(" \n Maior: "+ "%3d \n", valor);
    	use = valor;
    	valor = 999;
    	
    	System.out.println("\n Outro vetor: ");
		for (int i = 0; i < 4; i++) {
		    outroVetor[i] = random.nextInt(51)+1;
    		System.out.printf(" %2d", outroVetor[i]);
    		if (outroVetor[i] < valor) {
            	valor = outroVetor[i];
    		}
    	}
    	System.out.println();
    	
    	System.out.printf(" \n Menor: "+ "%3d", valor);
    	use *= valor;
    	
    	System.out.println();
    	
    	System.out.println("\n Matriz: ");
		for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 3; j++) {
            	m[i][j] = random.nextInt(3)+1;
    			System.out.printf("%3d", m[i][j]);
    			use += m[i][j];
        	}
        	System.out.println();
    	}
    	System.out.println();
    	
    	System.out.println(use);
    	
    	System.out.println("\n Resultado: ");
		for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 3; j++) {
				m[i][j] += use;
    			System.out.printf("%4d", m[i][j]);
        	}
        	System.out.println();
    	}
    	System.out.println();
    }
    
    public static void exercicio8() {
        Random random = new Random();
        int [][] m = new int [5][3];
        int [] quantidade = new int [4];
        int [] use = new int [4];
        int valor = 0;
        
        for (int j = 0; j < 3; j++) {
    		m[4][j] = 25 +(25 * j);
        }
        	
        System.out.println("\n Matriz: 1");
		for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 3; j++) {
            	m[i][j] = random.nextInt(3)+1;
            	quantidade[i] += m[i][j];
            	if(m[i][j] == 2){
        			use[i] += m[i][j];
        		}
        	}
    	}
    	
    	System.out.println();
    	
    	for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 3; j++){
        		System.out.printf("%4d", m[i][j]);
        	}
        	System.out.println();
    	}
    	System.out.println();
    	
    	System.out.println("Quantidade nos armarios");
    	
    	for (int j = 0; j < 4; j++){
        	System.out.printf("%4d \n", quantidade[j]);
        }
        System.out.println();
        
        System.out.println("Quantidade maior de produto 2 no maior");
        
        for (int i = 0; i < 4; i++) {
        	if (use[i] > valor) {
            	valor = i;
    		}
    	}
    	System.out.printf(" %3d \n", valor);
    	
    	System.out.println();
    }
    
    public static void exercicio9() {
        
    }
    
    public static void buscarAleatorio(int[][] m, double [][] impostos, int[] transporte, Random random) {
        int linhaAleatoria = random.nextInt(4);
        int colunaAleatoria = random.nextInt(5);
        int valorAleatorio = m[linhaAleatoria][colunaAleatoria];

        System.out.println("Numero do produto: " + (colunaAleatoria +1));
        System.out.println("Loja: " + (linhaAleatoria + 1));
        System.out.printf("Valor do Imposto: R$%d * %.2f = R$%.2f%n", valorAleatorio, impostos[linhaAleatoria][colunaAleatoria], m[linhaAleatoria][colunaAleatoria] * impostos[linhaAleatoria][colunaAleatoria]);
        System.out.println("Custo do transporte: R$"+transporte[linhaAleatoria]);
        System.out.println("Custo do produto: R$"+m[linhaAleatoria][colunaAleatoria]);
        System.out.println("Preço Final: R$"+(transporte[linhaAleatoria]+m[linhaAleatoria][colunaAleatoria]+ (m[linhaAleatoria][colunaAleatoria] * impostos[linhaAleatoria][colunaAleatoria])));
    }
    
			}
