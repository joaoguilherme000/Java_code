package funcoes;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {
    public static double valor1 = 0;
    public static double valor2 = 0;
    public static double resultado = 0;
    public static int escolha = -1;
    public static Scanner scanner;

    public static void menu() {
        String a = JOptionPane.showInputDialog(null, "Escolha uma operacao: \n1. Soma \n2. Multiplicacao\n3. Divisao\n4. Diferenca");
        escolha = Integer.parseInt(a);
        System.out.print("Digite o numero da operacao desejada: ");
        do {

             if (escolha != 0) {
                String valor1Str = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
                valor1 = Double.parseDouble(valor1Str);
                String valor2Str = JOptionPane.showInputDialog(null, "Digite o segundo valor");
                valor2 = Double.parseDouble(valor2Str);
            }

            switch (escolha) {
                case 1:
                    soma();
                    break;
                case 2:
                    multiplicacao();
                    break;
                case 3:
                    divisao();
                    break;
                case 4:
                    diferenca();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo da calculadora.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida.");
            }
        } while (escolha != 0);

        scanner.close();
    }

    public static void soma() {
        resultado = valor1 + valor2;
        System.out.println("Resultado da Soma: " + resultado);
    }

    public static void multiplicacao() {
        resultado = valor1 * valor2;
        System.out.println("\nResultado da Multiplicacao: " + resultado);
    }

    public static void divisao() {
        if (valor2 != 0) {
            resultado = valor1 / valor2;
            System.out.println("Resultado da Divisao: " + resultado);
        } else {
            System.out.println("Nao e possivel dividir por zero.");
        }
    }

    public static void diferenca() {
        resultado = valor1 - valor2;
        System.out.println("Resultado da Diferenca: " + resultado);
    }
}
