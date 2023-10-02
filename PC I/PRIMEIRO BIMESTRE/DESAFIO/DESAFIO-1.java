/*1 - CRIE UM VETOR DE INTEIROS COM 10 POSIÇÕES E OS ORGANIZE 
DE FORMA CRESCENTE.*/

public class OrdenacaoVetor {
    public static void main(String[] args) {
        // Crie um vetor de inteiros com 10 posicoes
        int[] vetor = new int[10];
        
        // Preencha o vetor com valores inteiros (pode ser manualmente ou de outra forma)
        vetor[0] = 7;
        vetor[1] = 2;
        vetor[2] = 9;
        vetor[3] = 4;
        vetor[4] = 1;
        vetor[5] = 8;
        vetor[6] = 5;
        vetor[7] = 3;
        vetor[8] = 6;
        vetor[9] = 10;
        
        // Chame o metodo para ordenar o vetor de forma crescente
        ordenarVetorCrescente(vetor);
        
        // Exiba o vetor ordenado
        System.out.println("Vetor ordenado de forma crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    
    public static void ordenarVetorCrescente(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troque os elementos vetor[j] e vetor[j + 1]
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}

// O CODIGO DE CIMA O USUARIO NAO CONSEGUE COLOCAR OS NUMEROS E O DE BAIXO ELE CONSEGUE

import java.util.Scanner;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        // Crie um vetor de inteiros com 10 posicoes
        int[] vetor = new int[10];
        
        // Crie um objeto Scanner para ler os valores do usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicite ao usuario que insira 10 valores inteiros para preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posicao " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // Chama o metodo para ordenar o vetor de forma crescente
        ordenarVetorCrescente(vetor);
        
        // Exiba o vetor ordenado
        System.out.println("Vetor ordenado de forma crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        // Feche o Scanner
        scanner.close();
    }
    
    public static void ordenarVetorCrescente(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) { // Altere esta para decrescente ou crescente
                    // Troca os elementos do vetor[j] e vetor[j + 1]
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
// -----------------------------------------------------------------------------------

/*CRIE  2 VETORES DE INTEIROS , SENDO QUE UM ARMAZENE CINCO POSIÇÕES PARES 
E O OUTRO ARMAZENE 5 POSIÇÕES IMPARES  ,  E UM LOOP DE REPETIÇÃO  QUE SOLICITE
AO USUÁRIO 20 NUMEROS . QUANDO UM OU OS DOIS VETORES ENCHEREM MOSTRE A MENSAGEM
“VETOR CHEIO”*/

import java.util.Scanner;

public class VetorParesImpares {
    public static void main(String[] args) {
        // Crie dois vetores para armazenar numeros pares e impares
        int[] pares = new int[5];
        int[] impares = new int[5];
        
        // Crie um objeto Scanner para ler os numeros do usuario
        Scanner scanner = new Scanner(System.in);
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        // Solicite ao usuario 20 numeros
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o numero " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                // Numero par
                if (contadorPares < 5) {
                    pares[contadorPares] = numero;
                    contadorPares++;
                } else {
                    System.out.println("VETOR DE PARES CHEIO");
                }
            } else {
                // Numero impar
                if (contadorImpares < 5) {
                    impares[contadorImpares] = numero;
                    contadorImpares++;
                } else {
                    System.out.println("VETOR DE IMPARES CHEIO");
                }
            }
        }
        
        // Exiba os vetores de pares e impares
        System.out.println("Vetor de Pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        
        System.out.println("\nVetor de impares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}
