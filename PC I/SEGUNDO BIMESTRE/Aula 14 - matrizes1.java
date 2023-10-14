
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
		int exe =0;
		
		System.out.println("\nEscolha um exercicio:");
		
        while(true){
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

    public static void exercicio10() {
		
    }

    public static void exercicio11() {
		
    }

    public static void exercicio12() {

    }

                      }
