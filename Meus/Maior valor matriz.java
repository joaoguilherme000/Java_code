public class EncontrarMaiorValor {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 2, 9},
            {1, 15, 6},
            {3, 8, 4}
        };

        int maiorValor = matriz[0][0]; // Inicializa com o primeiro valor da matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor na matriz é: " + maiorValor);
    }
}
