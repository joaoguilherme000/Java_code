# Tutorial para matrizes em java

## 1. Declaração de uma Matriz: Para declarar uma matriz em Java, você especifica o tipo de dados que a matriz irá conter e o nome da matriz, seguido por colchetes duplos [][]. Por exemplo:
```
int[][] minhaMatriz; // Declara uma matriz de inteiros
```
## 2. Inicialização de uma Matriz: Assim como com arrays unidimensionais, você precisa inicializar uma matriz. Isso envolve especificar o número de linhas e colunas. Por exemplo:
```
minhaMatriz = new int[3][4]; // Cria uma matriz 3x4 de inteiros
```
## 3. Você pode inicializar uma matriz diretamente com valores também:
```
int[][] minhaMatriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Cria e inicializa uma matriz
```
## 4. Acesso a Elementos de uma Matriz: Os elementos de uma matriz são acessados por meio de índices, especificando primeiro a linha e depois a coluna. Por exemplo, 

minhaMatriz[0][1] acessaria o elemento na primeira linha e segunda coluna.

## 5.Tamanho de uma Matriz: Você pode obter o número de linhas e colunas de uma matriz usando as propriedades length. Por exemplo:
```
int linhas = minhaMatriz.length; // Obtém o número de linhas
int colunas = minhaMatriz[0].length; // Obtém o número de colunas (supondo que todas as linhas tenham o mesmo tamanho)
```
## 6.Iteração em uma Matriz: Você pode percorrer os elementos de uma matriz usando loops aninhados, como loops for. Por exemplo, para percorrer todos os elementos:

```
for (int i = 0; i < linhas; i++) {
    for (int j = 0; j < colunas; j++) {
        System.out.print(minhaMatriz[i][j] + " ");
    }
    System.out.println(); // Pular para a próxima linha após cada linha da matriz
}
```

Esses são os conceitos básicos sobre matrizes em Java.
