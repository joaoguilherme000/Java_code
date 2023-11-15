package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização dos dados dos voos
        int[] numerosVoos = {1, 2, 3};
        String[] origens = {"São Paulo", "Curitiba", "backrooms"};
        String[] destinos = {"Rio de janeiro", "Los angeles", "Acre"};
        int[] lugaresDisponiveis = {10, 15, 20, /*...*/};

        // Menu principal
        int escolha;
        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Consultar");
            System.out.println("2. Efetuar Reserva");
            System.out.println("3. Sair");
            System.out.print("\nEscolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    consultarMenu(scanner, numerosVoos, origens, destinos, lugaresDisponiveis);
                    break;
                case 2:
                    efetuarReserva(scanner, numerosVoos, lugaresDisponiveis);
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        } while (escolha != 3);

        scanner.close();
    }

    private static void consultarMenu(Scanner scanner, int[] numerosVoos, String[] origens, String[] destinos, int[] lugaresDisponiveis) {
        int escolhaConsulta;
        do {
            System.out.println("\nMenu Consultar:");
            System.out.println("1. Por número do vôo");
            System.out.println("2. Por origem");
            System.out.println("3. Por destino");
            System.out.println("4. Voltar ao menu principal");
            System.out.print("\nEscolha uma opção: ");
            escolhaConsulta = scanner.nextInt();

            switch (escolhaConsulta) {
                case 1:
                    consultarPorNumero(scanner, numerosVoos, origens, destinos, lugaresDisponiveis);
                    break;
                case 2:
                    consultarPorOrigem(scanner, numerosVoos, origens, destinos, lugaresDisponiveis);
                    break;
                case 3:
                    consultarPorDestino(scanner, numerosVoos, origens, destinos, lugaresDisponiveis);
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (escolhaConsulta != 4);
    }

    private static void consultarPorNumero(Scanner scanner, int[] numerosVoos, String[] origens, String[] destinos, int[] lugaresDisponiveis) {
        System.out.print("Digite o número do vôo: ");
        int numeroConsulta = scanner.nextInt();

        int index = encontrarIndicePorNumero(numeroConsulta, numerosVoos);

        if (index != -1) {
            System.out.println("Informações do vôo: \n");
            System.out.println("Número: " + numerosVoos[index]);
            System.out.println("Origem: " + origens[index]);
            System.out.println("Destino: " + destinos[index]);
            System.out.println("Lugares disponíveis: " + lugaresDisponiveis[index]);
        } else {
            System.out.println("\nVôo inexistente.");
        }
    }

    private static int encontrarIndicePorNumero(int numero, int[] numerosVoos) {
        for (int i = 0; i < numerosVoos.length; i++) {
            if (numerosVoos[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    private static void consultarPorOrigem(Scanner scanner, int[] numerosVoos, String[] origens, String[] destinos, int[] lugaresDisponiveis) {
        // Nem precisa mano
    }

    private static void consultarPorDestino(Scanner scanner, int[] numerosVoos, String[] origens, String[] destinos, int[] lugaresDisponiveis) {
        // Esse aqui também
    }

    private static void efetuarReserva(Scanner scanner, int[] numerosVoos, int[] lugaresDisponiveis) {
        System.out.print("Digite o número do vôo para efetuar a reserva: ");
        int numeroReserva = scanner.nextInt();

        int index = encontrarIndicePorNumero(numeroReserva, numerosVoos);

        if (index != -1) {
            if (lugaresDisponiveis[index] > 0) {
                System.out.println("Reserva confirmada. Lugares disponíveis restantes: " + (--lugaresDisponiveis[index]));
            } else {
                System.out.println("Vôo lotado. Não há lugares disponíveis.");
            }
        } else {
            System.out.println("Vôo inexistente.");
        }
    }
}
