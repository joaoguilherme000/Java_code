package main;

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
3)Listar todos os nomes
0) Sair do programa

7 -  Faça um programa  que dada uma sequência de n números, imprimi-la na ordem inversa à da leitura.

8 - Crie um questionario , utilizando um vetor do tipo char , armazene as respostas e ao
final mostre quantas respostas foram certas e quantas respostas foram erradas.
Obs : As perguntas serão criadas por você
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while(true){
            System.out.println("\nEscolha um exercicio: \n 1 - exercicio 1 \n 2 - exercicio 2 \n 3 - exercicio 3\n 4 - exercicio 4\n 5 - exercicio 5\n 6 - exercicio 6\n 7 - exercicio 7\n 8 - exercicio 8 \n ou sair - 9");
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
                    System.out.println("Calcular a soma dos valores inteiros contidos em um vetor qualquer.\n");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("Localizar, em um vetor qualquer de valores inteiros, um certo elemento deste, dado o seu valor.\n");
                    exercicio2();
                    break;
                case 3:
                    System.out.println("Inverter os elementos de um vetor de valores do tipo String: \nA)Criando uma cópia do vetor original.\nB)Mudando os elementos do vetor original. \n");
                    exercicio3();
                    break;
                case 4:
                    System.out.println("Determinar a quantidade de vogais e de consoantes em um vetor de valores do tipo char");
                    exercicio4();
                    break;
                case 5:
                    System.out.println("Faça um programa que carregue um vetor de seis elementos numericos inteiros, calcule e mostre:\na. A quantidade de numeros pares;\nb. Quais os numeros pares;\nc. A quantidade de numeros impares;\nd. Quais os numeros impares.\n");
                    exercicio5();
                    break;
                case 6:
                    System.out.println("Faça um programa que alimente um vetor, com um número de posições definidas pelo usuário. \nEste vetor deverá armazenar um conjunto de nomes em diferentes posições. \nCrie um mecanismo para alimentar elementos os vetor e pesquisar por um valor existente. \n==== =MENU========\n1)Cadastar nome\n2)Pesquisar nome\n 3)Listar todos os nomes\n 0) Sair do programa\n");
                    exercicio6();
                    break;
                case 7:
                    System.out.println("Faça um programa  que dada uma sequencia de n números, imprimi-la na ordem inversa a da leitura.\n");
                    exercicio7();
                    break;
                case 8:
                    System.out.println("Crie um questionario , utilizando um vetor do tipo char , armazene as respostas e ao final mostre quantas respostas foram certas e quantas respostas foram erradas. Obs : As perguntas serao criadas por voce\n");
                    exercicio8();
                    break;
                case 9:
                    System.out.println("\nSaindo do programa...");
                    return; // Sai do método e encerra o programa
                default:
                        System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void exercicio1() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        double use = 0;

        for (int i = 0; i < 5; i ++){
            System.out.println("\nColoca o valor do [" + i+ "]");

            vetor[i] = scanner.nextInt();

            use += vetor[i];

        }
        for (int i = 0; i < 5; i ++){
            System.out.print(" + "+vetor[i]);
        }
        System.out.print(" =");

        System.out.println("\nValor somado dos vetores: "+use);
     }

    public static void exercicio2() {
        double[] Vetor = new double[5];

        Vetor[0] = 50;
        Vetor[1] = 100;
        Vetor[2] = 150;
        Vetor[3] = 200;
        Vetor[4] = 250;

        for (int i = 0; i < 5; i ++){
            System.out.print(Vetor[i]+ " | ");
        }

        System.out.println("\nValor especifico no vetor: "+Vetor[2]);
    }

    public static void exercicio3() {
        Scanner scanner = new Scanner(System.in);

        // Define um vetor
        int[] vetor = {1, 2, 3, 4, 5};

        // Mostra o vetor original
        System.out.println("Vetor original:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        int[] vetorInvertido = new int[5]; // Cria um novo vetor para armazenar o resultado
        
        for (int i = 0; i < 5; i++) {
            vetorInvertido[i] = vetor[5 - 1 - i]; // Copia os valores invertidos para o novo vetor
        }
        
        // Mostra o vetor invertido
        System.out.println("\nVetor invertido:");
        for (int valor : vetorInvertido) {
            System.out.print(valor + " ");
        }
        
    }

    public static void exercicio4() {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = new String[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("\nColoque o valor do [" + i + "]");
            vetor[i] = scanner.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            int vogais = 0;
            int consoantes = 0;

            for (int j = 0; j < vetor[i].length(); j++) {
                char caractere = vetor[i].charAt(j);
                if (Character.isLetter(caractere)) {
                    char letra = Character.toLowerCase(caractere);
                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        vogais++;
                    } else {
                        consoantes++;
                    }
                }
            }

            System.out.println("\nPara o valor [" + i + "]:");
            System.out.println("Quantidade de vogais: " + vogais);
            System.out.println("Quantidade de consoantes: " + consoantes);
        }

    }

    public static void exercicio5() {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[6];

        int cont = 0;
        int cont2 = 0;

        for (int i = 0; i < 6; i ++){
            System.out.println("\nColoca o valor do [" + i+ "]");

            vetor[i] = scanner.nextDouble();

            if (vetor[i] %2 == 0){   
                cont++;
            }

            if (vetor[i] %2 != 0){   
                cont2 ++;
            }

        }

        if(cont > 0 ){
            System.out.println("\nQuantidade de numeros pares: " + cont + "\n");
        }
        
        if(cont2 > 0 ){
            System.out.println("\nQuantidade de numeros impares: " + cont2 + "\n");
        }
        
        for (int i = 0; i < 6; i ++){
            if (vetor[i] %2 == 0){   
                System.out.print(vetor[i]+ " ");
            }
        }
        if(cont > 0){
            System.out.println("\n^ Numeros pares em cima ^ \n");
        }

        for (int i = 0; i < 6; i ++){
            if (vetor[i] %2 != 0){   
                System.out.print(vetor[i] + " ");
            }
        }

        if(cont2 > 0){
            System.out.println("\n^ Numeros impares em cima ^");
        }

    }

    public static void exercicio6() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;

        String[] vetor = null;
        int cont = 0;

        while (true) {
            System.out.println("\nSistema de cadastro \n 1 - Cadastrar nome \n 2 - Pesquisar nomes \n 3 - Mostrar todos os nomes \n 4 - Sair \n");
            int entrada = 0;
            boolean entradaValida = false; 

            while (!entradaValida) {
                try {
                    System.out.print("Escolha uma opcao: ");
                    entrada = scanner.nextInt();
                    scanner.nextLine();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Insira um número inteiro.\n");
                    scanner.nextLine();
                }
            }

            switch (entrada) {
                case 1:
                    do {
                        System.out.print("Insira o tamanho do vetor: ");
                        if (scanner.hasNextInt()) {
                            tamanho = scanner.nextInt();
                            scanner.nextLine();
                            if (tamanho <= 0) {
                                System.out.println("Tamanho inválido. O tamanho deve ser maior que zero.");
                            }
                        } else {
                            System.out.println("Invalido, deve ser um numero inteiro");
                            scanner.nextLine(); // pra nao dar erro
                            tamanho = 0;
                        }

                    } while (tamanho <= 0);

                    vetor = new String[tamanho];

                    for (int i = 0; i < tamanho; i++) {
                        if (vetor == null) {
                            vetor = new String[tamanho]; // Cria o vetor apenas se for a primeira vez
                        }
                        System.out.print("Insira o nome #" + (i + 1) + ": ");
                        vetor[i] = scanner.nextLine();
                    }
                    break;
                case 2:
                     if (vetor != null) {
                        System.out.print("Qual nome você deseja pesquisar? ");
                        String nomePesquisado = scanner.nextLine();
                        boolean encontrado = false;
                        System.out.print("\n");

                        for (String nome : vetor) {
                            if (nome != null && nome.equalsIgnoreCase(nomePesquisado)) {
                                encontrado = true;
                                cont ++;
                                System.out.println("Nome encontrado! no local #" + cont);
                            }else{
                                cont ++;
                                System.out.println("Nome não encontrado no local #"+ cont);
                            }
                        }
                        cont = 0;
                    } else {
                        System.out.println("O vetor está vazio. Cadastre nomes primeiro.");
                    }
                    break;
                case 3:
                    if (vetor != null){
                        System.out.println("\nNomes no vetor: \n");
                        for (int i = 0; i < tamanho; i ++){
                            System.out.print(vetor[i]+ "");
                            System.out.print(" | ");
                        }
                        System.out.println("\n");
                    }else {
                        System.out.println("\nNenhum nome cadastrado");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    return; // Sai do método e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void exercicio7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce deseja inserir no vetor? ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira o numero #" + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i]; // a famosa triade
            vetor[tamanho - 1 - i] = temp;
        }

        // Imprimir o vetor invertido
        System.out.println("Vetor invertido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void exercicio8() {
        final int numPerguntas = 3;
        char[] respostasCorretas = {'a', 'b', 'c'};
        char[] respostasUsuario = new char[numPerguntas];
        int certas = 0, erradas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pergunta 1: Qual a capital do Brasil?");
        System.out.println("a) Brasilia\nb) Rio de Janeiro\nc) Sao Paulo");
        respostasUsuario[0] = scanner.next().charAt(0);

        System.out.println("\nPergunta 2: Qual é o maior planeta do sistema solar?");
        System.out.println("a) Terra\nb) Marte\nc) Jupiter");
        respostasUsuario[1] = scanner.next().charAt(0);

        System.out.println("\nPergunta 3: Qual e o numero atomico do carbono?");
        System.out.println("a) 6\nb) 7\nc) 8");
        respostasUsuario[2] = scanner.next().charAt(0);

        for (int i = 0; i < numPerguntas; i++) {
            if (respostasUsuario[i] == respostasCorretas[i]) {
                certas++;
            } else {
                erradas++;
            }
        }

        System.out.println("Respostas Certas: " + certas);
        System.out.println("Respostas Erradas: " + erradas);
    }

}
