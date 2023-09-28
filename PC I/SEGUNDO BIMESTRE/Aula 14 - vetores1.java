/*  1) Faça um programa que carregue um vetor com 10 números reais. Calcule e mostre a 
quantidade de números negativos e a soma dos números positivos deste vetor.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio2();
    }

    public static void exercicio1() {
        Scanner scanner = new Scanner(System.in);

        double[] meuVetor = new double[10];

        int negativo = 0;
        double positivo = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um numero real [" + (i + 1) + "] : ");
            meuVetor[i] = scanner.nextDouble();
        }
        
        System.out.println("\nNumeros no vetor:");
        for (int i = 0; i < 10; i++) {
            Double numero = meuVetor[i];
            if (numero >= 0) {
                System.out.println("\nElementos positivos [" + (i + 1) + "] " + numero);
                positivo += numero;

            } else if (numero < 0) {
                System.out.println("\nElementos negativos [" + (i + 1) + "] " + numero);
                negativo++;
            }
        }

        System.out.println("\nQuantidade de numeros negativos: "+ negativo);
        System.out.println("\nNumeros positivos somados: "+ positivo);
    }

    public static void exercicio2() {
        Scanner scanner = new Scanner(System.in);

        int[] meuVetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o numero #" + (i + 1) + ": ");
            meuVetor[i] = scanner.nextInt();
        }

        System.out.println("\nNumeros no vetor:");
        for (int i = 0; i < 5; i++) {
            int numero = meuVetor[i];
            if (numero >= 0) {
                System.out.println("\nElemento positivos [" + (i + 1) + "] " + numero);
            }
        }

    }

    public static void exercicio3() {
        Scanner scanner = new Scanner(System.in);
    }

    public static void exercicio4() {
        Scanner scanner = new Scanner(System.in);
    }

    public static void exercicio5() {
        Scanner scanner = new Scanner(System.in);
    }

    public static void exercicio6() {
        Scanner scanner = new Scanner(System.in);
    }

    public static void exercicio7() {
        Scanner scanner = new Scanner(System.in);
    }
}