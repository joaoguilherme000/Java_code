/* 13.  A conversão de graus Fahrenheit para centígrados é obtida por C = 5*(F-32)/9. Fazer um algoritmo que calcule e escreva uma tabela de graus centígrados em função de graus Fahrenheit, variando um a um de 50 a 150 graus Fahrenheit.  */

public class ConversaoFahrenheit {
    public static void main(String[] args) {
        System.out.println("Fahrenheit  |  Celsius");
        System.out.println("-----------------------");

        for (int fahrenheit = 50; fahrenheit <= 150; fahrenheit++) {
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.printf("%-10d |  %-10.2f%n", fahrenheit, celsius);
        }
    }
}


//-------------------------------------------------------------------------

/*14.  Entrar com um nome, idade e sexo de 20 pessoas. Imprimir o nome se a pessoa for do sexo masculino e tiver mais de 21 anos */

import java.util.Scanner;

public class VerificarIdadeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[20];
        int[] idades = new int[20];
        char[] sexos = new char[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
            
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idades[i] = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M para masculino, F para feminino):");
            sexos[i] = scanner.nextLine().charAt(0);
        }
        
        System.out.println("Pessoas do sexo masculino com mais de 21 anos:");
        for (int i = 0; i < 20; i++) {
            if (sexos[i] == 'M' && idades[i] > 21) {
                System.out.println(nomes[i]);
            }
        }
        
        scanner.close();
    }
}

// ------------------------------------------------------------------------

/*15.  Faça um algoritmo que receba 100 valores inteiros e positivos, e resolva as seguintes questões:  
(a)  Calcule a raiz quadrada dos valores menores ou iguais a 100. 
(b) Para todo valor maior que 100, verifique se o mesmo é par, caso seja, imprimir o valor e a mensagem “valor par”.
(c) Ao final, imprimir a quantidade de números pares maiores que 100.*/

import java.util.Scanner;

public class CalculoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[100];
        int contadorParesMaioresQue100 = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite um valor inteiro positivo: ");
            valores[i] = scanner.nextInt();

            if (valores[i] <= 100) {
                double raizQuadrada = Math.sqrt(valores[i]);
                System.out.printf("A raiz quadrada de %d é %.2f%n", valores[i], raizQuadrada);
            } else if (valores[i] % 2 == 0) {
                System.out.printf("%d é um valor par maior que 100.%n", valores[i]);
                contadorParesMaioresQue100++;
            }
        }

        System.out.printf("Quantidade de números pares maiores que 100: %d%n", contadorParesMaioresQue100);
        scanner.close();
    }
}

// ------------------------------------------------------------------

/*16. Entrar com sexo de várias pessoas e imprimir quantas pessoas são do sexo masculino. 
Estabeleça uma condição para saída do algoritmo.*/

import java.util.Scanner;

public class ContagemSexoMasculinoAmador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMasculino = 0;

        while (true) {
            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino, ou qualquer outra tecla para sair): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("M")) {
                contadorMasculino++;
                System.out.println("Pessoa registrada como masculino.");
            } else if (entrada.equalsIgnoreCase("F")) {
                System.out.println("Pessoa registrada como feminino.");
            } else {
                break; // Sai do loop se qualquer outra tecla for pressionada
            }
        }

        System.out.printf("Número de pessoas do sexo masculino: %d%n", contadorMasculino);
        scanner.close();
    }
}

// ------------------------------------------------------------------------

/*17.  Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e um país  
B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, calcular e imprimir o  
tempo necessário para que a população do país A ultrapasse a população do país B.*/

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        int populacaoA = 5000000;
        double taxaNatalidadeA = 0.03;

        int populacaoB = 7000000;
        double taxaNatalidadeB = 0.02;

        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaNatalidadeA);
            populacaoB += (int) (populacaoB * taxaNatalidadeB);
            anos++;
        }

        System.out.printf("Levará aproximadamente %d anos para a população do país A ultrapassar a população do país B.%n", anos);
    }
}

// ------------------------------------------------------------------------

/*18.  João tem 1,50 m de altura e cresce 2 cm por ano, enquanto Maria tem 1,10 m e cresce 3 cm por  
ano. Construir um algoritmo que calcule e imprima quantos anos serão necessários para que 
Maria seja maior que João. */


public class CrescimentoAltura {
    public static void main(String[] args) {
        double alturaJoao = 150; // altura em centímetros
        double alturaMaria = 110; // altura em centímetros
        int anos = 0;

        while (alturaMaria <= alturaJoao) {
            alturaJoao += 2; // João cresce 2 cm por ano
            alturaMaria += 3; // Maria cresce 3 cm por ano
            anos++;
        }

        System.out.printf("Serão necessários aproximadamente %d anos para que Maria seja mais alta que João.%n", anos);
    }
}
