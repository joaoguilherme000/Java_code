// Ordenar a matriz bidimensional (matriz) em ordem crescente

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                for (int k = 0; k < 5 - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
                        // Trocar os elementos se estiverem fora de ordem
                        int temp = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = temp;
                    }
                }
            }
        }
