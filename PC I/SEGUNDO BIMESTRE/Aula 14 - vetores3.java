/* 1 - Calcular a soma dos valores inteiros contidos em um vetor qualquer.

2 - Localizar, em um vetor qualquer de valores inteiros, um certo elemento deste, dado o seu valor.

3 - Inverter os elementos de um vetor de valores do tipo String: 
A)Criando uma cópia do vetor original.  
B)Mudando os elementos do vetor original. 

4 - Determinar a quantidade de vogais e de consoantes em um vetor de valores do tipo char

5-Faça um programa que carregue um vetor de seis elementos numéricos inteiros, calcule e mostre:
a. A quantidade de números pares;
b. Quais os números pares;
c. A quantidade de números ímpares;
d. Quais os números ímpares.

6 - Faça um programa que alimente um vetor, com um número de posições definidas pelo usuário.
Este vetor deverá armazenar um conjunto de nomes em diferentes posições.
Crie um mecanismo para alimentar elementos os vetor e pesquisar por um valor existente.
==== =MENU========
1)Cadastar nome
2)Pesquisar nome
3)Listar todos os nome
0) Sair do programa

7 -  Faça um programa  que dada uma sequência de n números, imprimi-la na ordem inversa à da leitura.

8 - Crie um questionario , utilizando um vetor do tipo char , armazene as respostas e ao
final mostre quantas respostas foram certas e quantas respostas foram erradas.
Obs : As perguntas serão criadas por você
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio2();
    }

    public static void exercicio1() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        double use = 0;

        for (int i = 0; i < 5; i ++){
            System.out.println("\nColoca o valor do [" + i+ "]");

            vetor[i] = scanner.nextInt();

            use += vetor[i];

            System.out.println("\nvalor no vetor: "+vetor[i]);

        }

        System.out.println("\nValor somado dos vetores: "+use);
     }

    public static void exercicio2() {
        double[] Vetor = new double[5];

        Vetor[0] = 50;
        Vetor[1] = 100;
        Vetor[2] = 150;
        Vetor[3] = 200;
        Vetor[4] = 250;

        System.out.println("\nValor especifico no vetor: "+Vetor[2]);
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

}