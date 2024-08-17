package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // (i, j) -> (linha, coluna)
        int i = 0, j = 0;

        exibirRecursivamente(matriz, i, j);
    }

    public static void exibirRecursivamente(int[][] matriz, int i, int j) {
        // Caso base: quando todas as linhas forem percorridas
        if (i >= matriz.length) {
            return;
        }

        // Exibe o elemento atual
        System.out.print(matriz[i][j] + " ");

        // Verifica se ainda não passou pelo último elemento da linha
        if(j < matriz[i].length - 1) {
            // Continua na mesma linha, avançando para a coluna seguinte
            exibirRecursivamente(matriz, i, j + 1);
        } else {
            // Avança para a linha seguinte e reinicia a coluna
            System.out.println();
            exibirRecursivamente(matriz, i + 1, 0);
        }
    }
}