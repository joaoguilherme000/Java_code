// Bubble Sort para ordenação crescente
        for (int i = 0; i < 20 - 1; i++) {
            for (int j = 0; j < 20 - 1 - i; j++) {
                if (junto[j] > junto[j + 1]) {
                    int temp = junto[j];
                    junto[j] = junto[j + 1];
                    junto[j + 1] = temp;
                }
            }
        }
