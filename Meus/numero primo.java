// Função para verificar se um número é primo
    public static boolean Primo(int numero) { // colocar a mesma variavel que vc quer testar
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
