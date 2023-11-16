import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Quiz de Matemática! Responda a 10 perguntas de matemática.");

        int pontuacao = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nPergunta " + i + ":");
            System.out.println(obterPerguntaMatematica(i));
            String respostaUsuario = scanner.nextLine();

            if (verificarRespostaMatematica(i, respostaUsuario)) {
                pontuacao++;
            }
        }

        System.out.println("\nPontuação final: " + pontuacao);
        exibirResultadoMatematica(pontuacao);

        scanner.close();
    }

    private static String obterPerguntaMatematica(int numeroPergunta) {
        switch (numeroPergunta) {
            case 1:
                return "Quanto é 2 + 2?";
            case 2:
                return "Qual é a raiz quadrada de 25?";
            case 3:
                return "Qual valor o valor x : x * x = 36?";
            case 4:
                return "y é equivale a um numero, qual: y + y + y = 21?";
            case 5:
                return "8?";
            case 6:
                return "9?";
            case 7:
                return "sem 0 o esquerda 010?";
            case 8:
                return "raiz quadrada de 121?";
            case 9:
                return "12?";
            case 10:
                return "13?";
            // Adicione mais perguntas conforme necessário
            default:
                return "Pergunta não disponível.";
        }
    }

    private static boolean verificarRespostaMatematica(int numeroPergunta, String respostaUsuario) {
        switch (numeroPergunta) {
            case 1:
                return respostaUsuario.equals("4");
            case 2:
                return respostaUsuario.equals("5");
            case 3:
                return respostaUsuario.equals("6");
            case 4:
                return respostaUsuario.equals("7");
            case 5:
                return respostaUsuario.equals("8");
            case 6:
                return respostaUsuario.equals("9");
            case 7:
                return respostaUsuario.equals("10");
            case 8:
                return respostaUsuario.equals("11");
            case 9:
                return respostaUsuario.equals("12");
            case 10:
                return respostaUsuario.equals("13");
            // Adicione mais verificações de respostas conforme necessário
            default:
                return false;
        }
    }

    private static void exibirResultadoMatematica(int pontuacao) {
        System.out.println("\nResultado:");

        if (pontuacao >= 1 && pontuacao <= 4) {
            System.out.println("Você não domina o assunto.");
        } else if (pontuacao >= 5 && pontuacao <= 6) {
            System.out.println("Conhecimento básico sobre o assunto.");
        } else if (pontuacao >= 7 && pontuacao <= 9) {
            System.out.println("Quase um mestre.");
        } else if (pontuacao == 10) {
            System.out.println("Parabéns! Você tem profundos conhecimentos sobre o assunto.");
        } else {
            System.out.println("Pontuação inválida. Verifique suas respostas.");
        }
    }
}
