/*  1) Faça um programa que carregue um vetor com 10 números reais. Calcule e mostre a 
quantidade de números negativos e a soma dos números positivos deste vetor.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inserir();
    }

    public static void inserir() {
        Scanner scanner = new Scanner(System.in);

        double[] meuVetor = new double[10];

        int negativo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um numero real [" + (i + 1) + "] : ");
            meuVetor[i] = scanner.nextDouble();
        }

        System.out.println("\nNumeros no vetor:");
        for (int i = 0; i < 10; i++) {
            Double numero = meuVetor[i];
            if (numero >= 0) {
                System.out.println("\nElementos positivos [" + (i + 1) + "] " + numero);
            } else if (numero < 0) {
                System.out.println("\nElementos negativos [" + (i + 1) + "] " + numero);
                negativo++;
            }
        }

        System.out.println("Quantidade de numeros negativos: "negativo);

    }
}