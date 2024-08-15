package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int i = 0, j = 0;

        exibirRecursivamente(matriz, i, j) {
            // Caso base: se [i] superar a quantidade de linhas e [j] superar a quantidade de colunas
            if(i > matriz.length && j > matriz[matriz.length].length) {
                return;
            }



            exibirRecursivamente(matriz, i, j+1);
        }
    }
}