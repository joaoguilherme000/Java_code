package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while(true){
            System.out.println("\nEscolha um exercicio: \n 1 - exercicio 1 \n 2 - exercicio 2 \n 3 - exercicio 3\n 4 - exercicio 4\n 5 - exercicio 5\n 6 - exercicio 6\n 7 - exercicio 7\n 8 - exercicio 8 \n 9 - exercicio 9 \n 10 - exercicio 10 \n 11 - exercicio 11 \n 12 - exercicio 12 \n 13 - exercicio 13\n ou sair - 14");
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
                    System.out.println("1. Elaborar um algoritmo que lê um conjunto de 30 valores e os coloca em 2 vetores conforme forem pares ou ímpares. O tamanho do vetor é de 5 posições. Se algum vetor estiver cheio, escrevê-lo. Terminada a leitura escrever o conteúdo dos dois vetores. \n");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("2. Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos elementos de mesmo índice, colocando o resultado em um terceiro vetor. Mostre o vetor resultante. \n");
                    exercicio2();
                    break;
                case 3:
                    System.out.println("3. Escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros. a seguir, conte quantos valores pares existem no vetor. \n");
                    exercicio3();
                    break;
                case 4:
                    System.out.println("4.Escreva um algoritmo que leia um vetor de 100 posições e mostre-o ordenado em ordem crescente. \n");
                    exercicio4();
                    break;
                case 5:
                    System.out.println("5.Escreva um algoritmo que leia um vetor de 13 elementos inteiros, que é o Gabarito de um teste da loteria esportiva, de forma sequencial coloque armazenado os valores 1,2,3 . Crie um outro vetor de 13 posições que é o vetor do apostador , armazena as 13 respostas , informando ao usuario que somente serão digitados os numeros 1 , 2, 3 . Verifique se os numeros digitados pelo apostador conferem com os numeros ja armazenados , se sim , mostre a mensagem Você ganhou.  \n");
                    exercicio5();
                    break;
                case 6:
                    System.out.println("6. Escreva um algoritmo que leia um vetor de 20 posições e mostre- o. Em seguida, troque o primeiro elemento com o último, o segundo com o penúltimo, o terceiro com o antepenúltimo, e assim sucessivamente. Mostre o novo vetor depois da troca.  \n");
                    exercicio6();
                    break;
                case 7:
                    System.out.println("7. Escreva um algoritmo que leia um vetor de 50 posições de números inteiros e mostre somente os positivos. \n");
                    exercicio7();
                    break;
                case 8:
                    System.out.println("8. Escreva um algoritmo que leia um vetor de 80 elementos inteiros. Encontre e mostre o menor elemento e sua posição no vetor. \n");
                    exercicio8();
                    break;
                case 9:
                    System.out.println("9.Escreva um algoritmo que leia um vetor inteiro de 30 posições e crie um segundo vetor, substituindo os valores nulos por 1. Mostre os 2 vetores. \n");
                    exercicio9();
                    break;
                case 10:
                    System.out.println("10. Escreva um que leia um vetor G de 20 elementos caracter que representa o gabarito de uma prova. A seguir, para cada um dos 50 alunos da turma, leia o vetor de respostas (R) do aluno e conte o número de acertos. Mostre o nº de acertos do aluno e uma mensagem APROVADO, se a nota for maior ou igual a 6; e mostre uma mensagem de REPROVADO, caso contrário.  \n");
                    exercicio10();
                    break;
                case 11:
                    System.out.println("11. Escrever um algoritmo que gera os 10 primeiros números primos acima de 100 e os armazena em um vetor de X(10) escrevendo, no final, o vetor X. \n");
                    exercicio11();
                    break;
                case 12:
                    System.out.println("12. Escrever um algoritmo que le 2 vetores de tamanho 10 e os escreve. Crie, a seguir, um vetor de 20 posicoes que contenha os elementos dos outros 2 vetores em ordem crescente.   \n");
                    exercicio12();
                    break;
                case 13:
                    System.out.println("13. Escrever um algoritmo que le 2 vetores X(10) e Y(10) e os escreve. Crie, a seguir, um vetor Z que seja a) a uniao de X com Y; b) a diferenca entre X e Y; c) a soma entre X e Y; d) o produto entre X e Y;  \n");
                    exercicio13();
                    break;
                case 14:
                    System.out.println("\nSaindo do programa...");
                    return; // Sai do método e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void exercicio1() {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[5];
        int vetor2[] = new int[5];

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("\nDigite um valor ");

            int use = scanner.nextInt();

            if (use % 2 == 0) {
                if (contPar < 5) {
                    vetor[contPar] = use;
                    contPar++;
                } else {
                    System.out.println("\nVetor Par cheio");
                }
            } else if (use % 2 != 0) {
                if (contImpar < 5) {
                    vetor2[contImpar] = use;
                    contImpar++;
                } else {
                    System.out.println("\nVetor impar cheio");
                }
            } else {
                System.out.println("\nErro ");
            }
        }
        
		System.out.println("\n");
		
        for(int i=0; i < 5; i++){
            System.out.print(vetor[i]+ " ");
        }
        System.out.print("    Vetor par");
        System.out.println("\n");
        for(int i=0; i < 5; i++){
            System.out.print(vetor2[i]+ " ");
        }
        System.out.print("   Vetor impar");
    }

    public static void exercicio2() {
        double vetor[] = new double [10];
        double vetor2[] = new double [10];
        double vetorResultado[] = new double[10];

        System.out.println("\n\nVetor 1\n");
        for (int i = 0; i < 10; i++) {
            vetor[i] = i + 1; // valores de 1 a 10
            vetor2[i] = 2 * (i + 1); //  valores de 2 a 20
            System.out.print(vetor[i]+" ");
        }

		System.out.println("\n\nVetor 2\n");
		
		for(double a : vetor2){
			System.out.print(a+" ");
		}
		System.out.print("\n");
        for (int i = 0; i < 10; i++){
            vetorResultado[i] = vetor[i] * vetor2[i];
            System.out.println("\n Numero multiplicado #[" + i + "] :" +vetorResultado[i] );
        }
    }

    public static void exercicio3() {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[20];

        System.out.println("Coloque os numeros no vetor");

        for(int i=0; i < 20; i++){
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Numeros no vetor: ");
        for(int i=0; i < 20; i++){
            System.out.print(vetor[i]+ " ");
        }
        System.out.println("\n");
        
        System.out.println("Numeros pares: ");
        for(int i=0; i < 20; i++){
            if (vetor[i] %2 ==0){
                System.out.print(vetor[i]+ " ");
            }
        }
    }

    public static void exercicio4() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int vetor[] = new int[tamanho];

        System.out.println("Coloque os numeros no vetor");

        for(int i=0; i < tamanho; i++){
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Vetor antes da ordenação:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Bubble Sort para ordenação crescente
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor depois a ordenação em ordem crescente:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void exercicio5() {
		Scanner scanner = new Scanner(System.in);
		
		int[] loteria = {8,2,34,11,17,23,27,61,99,49,57,72,88};
		int[] aposta = new int[13];
		int cont =0;
		
		/*caso queira randomizar
		
		Random random = new Random();
    
    	int[] loteria = new int[13];
    	int[] aposta = new int[13];
    	int cont = 0;

    	System.out.println("Numeros sorteados\n");
    	for (int i = 0; i < 13; i++) {
        	loteria[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
        	System.out.print(loteria[i] + " ");
    	}*/
		
		
		System.out.println("Quais numeros você vai jogar?");
		for(int i=0; i < 13; i++){
            aposta[i] = scanner.nextInt();
            if(aposta[i] == loteria[i]){
            	cont++;
            }
        }
        
        if (cont == 13){
        	System.out.println("Você ganhou!!!\n");
        }else {
        	System.out.println("Você perdeu!!!\n");
        }
        
        System.out.println("Numeros sorteados\n");
        
        for(int a : loteria){
        	System.out.print(a+" ");
        }
    }

    public static void exercicio6() {
		int[] vetor = new int[20];
		
		for(int i =0; i < 20; i++){
		  vetor[i] = i *2+2;
		  System.out.print(vetor[i]+" ");
		}
		
		for (int i = 0; i < 20 / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[20 - 1 - i]; // a famosa triade
            vetor[20 - 1 - i] = temp;
        }

        // Imprimir o vetor invertido
        System.out.println("\n\nVetor invertido:\n");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void exercicio7() {
    	Random random = new Random();
		int[] vetor = new int[50];
		
		System.out.println("\nVetor normal: \n");
		
		for(int i =0; i < 50; i++){
		  vetor[i] = random.nextInt(201)-100;
		  System.out.print(vetor[i]+" ");
		}
		System.out.println("\n\nVetor positivos: \n");
		
		for(int i =0; i < 50; i++){
		  if (vetor[i]> -1){
		  	System.out.print(vetor[i]+" ");
		  }
		}
    }

    public static void exercicio8() {
		Random random = new Random();
		int[] vetor = new int[80];
		int menor = 0;
		int posMenor = 0;
		int posMaior = 0;
		int maior = 0;
		
		System.out.println("Vetor normal: \n");
		
		for(int i =0; i < 80; i++){
		  vetor[i] = random.nextInt(201)-100;
		  System.out.print(vetor[i]+" ");
		
			if (i == 0) {
	            menor = vetor[i];
	            maior = vetor[i];
	        } else {
	            if (vetor[i] < menor) {
	                menor = vetor[i];
	                posMenor = i;
	            }
	            if (vetor[i] > maior) {
	                maior = vetor[i];
	                posMaior = i;
	            }
	        }
  	  }
	
	    System.out.println("\n\nO menor numero: \n");
	    System.out.println(menor + " sua posicao " + posMenor);
	
	    System.out.println("\nO maior numero: \n");
	    System.out.println(maior + " sua posicao " + posMaior);
    }

    public static void exercicio9() {
		Random random = new Random();
		int[] vetor = new int[30];
		int[] substituido = new int[30];
		
		System.out.println("Vetor normal: \n");
		
		for(int i =0; i < 30; i++){
		  vetor[i] = random.nextInt(201)-100;
		  System.out.print(vetor[i]+" ");
		  if(vetor[i] == 0){
		  	substituido[i] = 1;
			}else{
				substituido[i] = vetor[i];
			}
		}
		System.out.println("\n\nVetor substituido: \n");
		for(int i =0; i < 30; i++){
		  System.out.print(substituido[i]+" ");
		}
    }

    public static void exercicio10() {
		Random random = new Random();

        // Defina o gabarito com as respostas corretas
        char[] gabarito = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B','C', 'D', 'A', 'B', 'C', 'D', 'A', 'B', 'C','A'};

        // Número de alunos
        int numAlunos = 50;

        for (int aluno = 1; aluno <= numAlunos; aluno++) {
            System.out.println("Respostas do aluno " + aluno + ":");
            char[] respostasAluno = new char[20];

            // Gera respostas aleatórias para o aluno
            for (int i = 0; i < 20; i++) {
                char respostaAleatoria = (char) (random.nextInt(4) + 'A'); // Gera 'A', 'B', 'C' ou 'D'
                respostasAluno[i] = respostaAleatoria;
                System.out.print("Questão " + (i + 1) + ": " + respostaAleatoria + "| ");
            }

            // Contagem de acertos
            int acertos = 0;
            for (int i = 0; i < 20; i++) {
                if (respostasAluno[i] == gabarito[i]) {
                    acertos++;
                }
            }

            // Verifica se o aluno foi aprovado ou reprovado
            if (acertos >= 6) {
                System.out.println("\nNúmero de acertos: " + acertos);
                System.out.println("APROVADO\n");
            } else {
                System.out.println("\nNúmero de acertos: " + acertos);
                System.out.println("REPROVADO\n");
            }
        }
    }

    public static void exercicio11() {
		int[] vetorX = new int[10]; // Vetor para armazenar os números primos
        int numero = 101; // Começamos em 101, o primeiro número primo acima de 100
        int encontrados = 0; // Contador de números primos encontrados

        while (encontrados < 10) {
            if (Primo(numero)) {
                vetorX[encontrados] = numero;
                encontrados++;
            }
            numero++;
        }

        // Mostrar o vetor com os números primos
        System.out.println("Os 10 primeiros números primos acima de 100:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetorX[i]);
        }
    }

    // Função para verificar se um número é primo
    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void exercicio12() {
		Random random = new Random();
		int[] x = new int[10];
		int[] y = new int[10];
		int[] junto = new int[20];
		
		System.out.println("Vetor x: \n");
		
		for(int i =0; i < 10; i++){
		  x[i] = random.nextInt(201)-100;
		  System.out.print(x[i]+" ");
		}
		
		System.out.println("\n\nVetor y: \n");
		
		for(int i =0; i < 10; i++){
		  y[i] = random.nextInt(201)-100;
		  System.out.print(y[i]+" ");
		}
		
		System.out.println("\n\nVetor junto: \n");
		
		for(int i =0; i < 10; i++){
		  junto[i] = x[i];
		  System.out.print(junto[i]+" ");
		}
		
		for (int i = 10; i < 20 ; i++){
			junto[i] = y[(i-10)];
			System.out.print(junto[i]+" ");
		}
		
		// Bubble Sort para ordenação crescente
        for (int i = 0; i < 20 - 1; i++) {
            for (int j = 0; j < 20 - 1 - i; j++) {
                if (junto[j] > junto[j + 1]) {
                    int temp = junto[j];
                    junto[j] = junto[j + 1];
                    junto[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nVetor ordenado: \n");
        
        for(int i =0; i < 20; i++){
		  System.out.print(junto[i]+" ");
		}
		
    }

    public static void exercicio13() {
		Random random = new Random();
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[20];
		
		System.out.println("Vetor x: \n");
		
		for(int i =0; i < 10; i++){
		  x[i] = random.nextInt(201)-100;
		  System.out.print(x[i]+" ");
		}
		
		System.out.println("\n\nVetor y: \n");
		
		for(int i =0; i < 10; i++){
		  y[i] = random.nextInt(201)-100;
		  System.out.print(y[i]+" ");
		}
		
		System.out.println("\n\nVetor junto: \n");
		
		for(int i =0; i < 10; i++){
		  z[i] = x[i];
		  System.out.print(z[i]+" ");
		}
		
		for (int i = 10; i < 20 ; i++){
			z[i] = y[i-10];
			System.out.print(z[i]+" ");
		}
		
		System.out.println("\n\nDiferença entre x e y: \n");
		
		for(int i =0; i < 10; i++){
		  z[i] = y[i] - x[i];
		  System.out.println(x[i]+" - "+y[i]+ " = "+z[i] );
		}
		
		System.out.println("\n\nSoma entre x e y: \n");
		
		for(int i =0; i < 10; i++){
		  z[i] = y[i] + x[i];
		  System.out.println(x[i]+" + "+y[i]+ " = "+z[i] );
		}
		
		System.out.println("\n\nProduto entre x e y: \n");
		
		for(int i =0; i < 10; i++){
		  z[i] = y[i] * x[i];
		  System.out.println(x[i]+" * "+y[i]+ " = "+z[i] );
		}
		
    }

}
