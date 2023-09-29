/*  1) Faça um programa que carregue um vetor com 10 números reais. Calcule e mostre a 
quantidade de números negativos e a soma dos números positivos deste vetor.*/

/* 2) Faça um programa que leia um vetor de 5 posições de números inteiros e mostre 
somente os positivos. */

/* 3) Faça um programa que carregue um vetor com 7 números inteiros, calcule e mostre:
    a) os números múltiplos de 2
    b) os números múltiplos de 3
    c) os números múltiplos de 2 e de 3 */

/* 4) Faça um programa que receba a quantidade de peças vendidas por cada vendedor e 
armazene essas quantidades em um vetor. Receba também o preço da peça vendida de cada 
vendedor a armazene esses preços em outro vetor. Existem apenas 10 vendedores e cada 
vendedor pode vender apenas um tipo de peça, isto é, para cada vendedor existe apenas
um preço. Calcule e mostre a quantidade total de peças vendidas por todos vendedores e 
para cada vendedor calcular e mostrar o valor total da venda, isto é, a quantidade de 
peças * o preço da peça. */

/* 5) Faça um programa que leia dois vetores (A e B) de 5 posições de números inteiros. 
O programa deve, então, subtrair o primeiro elemento de A do último de B, acumulando 
o valor, subtrair o segundo elemento de A do penúltimo de B, acumulando o valor, 
e assim por diante. Mostre o resultado da soma de todas as subtrações. */

/* 6)  Faça um programa que receba o código e o preço de 5 produtos, calcule e mostre:
    a) a quantidade de produtos com preço inferior a R$ 50
    b) o código dos produtos com preço entre R$ 50 e R$ 100
    c) a média dos preços dos produtos com preço superior a R$ 100. */


/* 7) Faça um programa que receba o total das vendas de cada vendedor e armazene-as em um 
vetor. Receba também o percentual de comissão de cada vendedor a armazene-os em outro 
vetor. Receba os códigos destes vendedores e armazene-os em um terceiro vetor. 
Existem apenas 10 vendedores. Calcule e mostre:
    a) um relatório com os códigos dos vendedores e os valores a receber; 
    b) total das vendas de todos vendedores;
    c) maior valor a receber e o código de quem o receberá;
    d) menor valor a receber e o código de quem o receberá.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio6();
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
            System.out.print("Insira o numero [" + (i + 1) + "] :");
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

        int[] meuVetor = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Insira o numero [" + (i + 1) + "] :");
            meuVetor[i] = scanner.nextInt();
        }

        System.out.println("\nNumeros no vetor:");
        for (int i = 0; i < 7; i++) {
            int numero = meuVetor[i];
            int saida = 1;

            while(saida == 1){
                if (numero % 2 == 0) {
                    System.out.println("\nElemento multiplo de 2 [" + (i + 1) + "] " + numero);
                }   
                if (numero % 3 == 0) {
                    System.out.println("\nElemento multiplo de 3 [" + (i + 1) + "] " + numero);
                }
                if (numero % 3 == 0 && numero % 2 == 0) {
                    System.out.println("\nElemento multiplo de 2 e de 3 [" + (i + 1) + "] " + numero);
                }
            saida = 0;
            }
        }
    }

    public static void exercicio4() {
        System.out.println("Exercicio 4: ");
    }

    public static void exercicio5() {
        Scanner scanner = new Scanner(System.in);

        double[] meuVetor = new double[5];
        double[] meuVetor2 = new double[5];
        double[] resultado = new double[5];

        meuVetor[0] = 50;
        meuVetor[1] = 100;
        meuVetor[2] = 150;
        meuVetor[3] = 200;
        meuVetor[4] = 250;

        meuVetor2[0] = 25;
        meuVetor2[1] = 50;
        meuVetor2[2] = 75;
        meuVetor2[3] = 100;
        meuVetor2[4] = 125;

        for (int i = 0; i < 5; i++) {
            resultado[i] = meuVetor2[i] - meuVetor[i];
        }

        double soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += resultado[i];
        }

        System.out.println("Números no vetor resultado:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Resultado[" + i + "]: " + resultado[i]);
        }

        System.out.println("Soma dos resultados: " + soma);
    }

    public static void exercicio6() {
        Scanner scanner = new Scanner(System.in);

        double[] codigo = new double[5];
        double[] preco = new double[5];

        int produtoMenor = 0;

        double cont = 0;
        double use = 0;
        double maiorQueCem = 0;

        for(int i =0 ; i < 5 ; i ++){

            System.out.println("\ndigite o codigo do produto :");
            codigo[i] = scanner.nextDouble();

            System.out.println("\ndigite o preço do produto :");
            preco[i] = scanner.nextDouble();

            use = preco[i];
            
            if(use < 50){
                System.out.println("\nproduto menor que R$50 :" + use);
                produtoMenor ++;
            }else if (use > 50 && use < 100){

                System.out.println("\nproduto maior que R$50,\n\n codigo dele: " + codigo[i]);

            }else if (use > 100){
                cont ++;
                maiorQueCem += use;
            } else {
                System.out.println("\nErro");

            }
        }

        double divide = maiorQueCem / cont;

        if(cont >= 1){
            System.out.println("\nFeito : "+maiorQueCem + " / " + cont " = " + divide);
        }
        if(produtoMenor >= 1){
            System.out.println("\nQuantidade de produtos menor que R$ 50 : " + produtoMenor);
        }
    }

    public static void exercicio7() {
        Scanner scanner = new Scanner(System.in);
    }
}