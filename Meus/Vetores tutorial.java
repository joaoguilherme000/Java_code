/*Uma declaração de vetor pode ser feito de varios jeitos*/

package main;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inserirNumerosEmVetor();
    }

    public static void vetor(){

        // Declare o vetor: Você deve declarar o vetor, especificando o tipo de elementos que ele conterá. Por exemplo, se você deseja criar um vetor de inteiros, você pode declará-lo da seguinte forma:

        int[] meuVetor;

        // Isso declara um vetor chamado meuVetor que pode armazenar inteiros.

        // Aloque memória para o vetor: Você precisa especificar o tamanho do vetor e alocar memória para ele. Por exemplo, para criar um vetor de tamanho 10, você pode fazer o seguinte:

        meuVetor = new int[10];

        // Agora, o vetor meuVetor tem espaço para armazenar 10 inteiros.

        // Inicialize o vetor (opcional): Você pode inicializar os elementos do vetor com valores iniciais se desejar. Por exemplo:

        meuVetor[0] = 1;
        meuVetor[1] = 2;
        meuVetor[2] = 3;

        System.out.println("Segundo elemento no vetor: " + meuVetor[1]);

        // E assim por diante...
        // Ou você pode inicializar o vetor durante a declaração:

        int[] meuVetor2 = {1, 2, 3, 4, 5};
        //Isso cria e inicializa o vetor com os valores especificados.
        System.out.println("Quarto elemento no vetor: " + meuVetor2[3]);
    }


    public static void ExemploDeVetor() {
            // Declarar e alocar memória para um vetor de inteiros com tamanho 5
            int[] meuVetor = new int[5];
            
            // Inicializar o vetor com valores
            meuVetor[0] = 10;
            meuVetor[1] = 20;
            meuVetor[2] = 30;
            meuVetor[3] = 40;
            meuVetor[4] = 50;
            
            // Acessar e imprimir os valores do vetor
            System.out.println("Elemento 0: " + meuVetor[0]);
            System.out.println("Elemento 1: " + meuVetor[1]);
            System.out.println("Elemento 2: " + meuVetor[2]);
            System.out.println("Elemento 3: " + meuVetor[3]);
            System.out.println("Elemento 4: " + meuVetor[4]);
    }

    public static void inserirEpositivoNegativo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce deseja inserir no vetor? ");
        int tamanhoDoVetor = scanner.nextInt();

        int[] meuVetor = new int[tamanhoDoVetor];

        for (int i = 0; i < tamanhoDoVetor; i++) {
            System.out.print("Insira o numero #" + (i + 1) + ": ");
            meuVetor[i] = scanner.nextInt();
        }

        System.out.println("\nNumeros no vetor:");
        for (int i = 0; i < tamanhoDoVetor; i++) {
            int numero = meuVetor[i];
            if (numero >= 0) {
                System.out.println("\nElementos positivos [" + (i + 1) + "] " + numero);
            } else if (numero < 0) {
                System.out.println("\nElementos negativos [" + (i + 1) + "] " + numero);
            }
        }

    }

    public static void vetorOrdemCrescente() {
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
}