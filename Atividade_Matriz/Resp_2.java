/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp_2 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int TotalImpar = 0;
        int[] TotalLinhas = new int[5];
        int[] TotalColunas = new int[5];
         
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 100); 
                if (matriz[i][j] % 2 != 0) {
                    TotalImpar += matriz[i][j];
                }
                TotalColunas[j] += matriz[i][j];
                TotalLinhas[i] += matriz[i][j];
            }
        }

        
        System.out.println("Algoritimo que preenche uma Matriz 5x5 de inteiros:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


        
        System.out.println("Soma dos numeros impares: " +    TotalImpar);
        System.out.println("Soma das colunas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Coluna " + i + ": " + TotalColunas[i]);
        }
        System.out.println("Soma das linhas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + i + ": " + TotalLinhas[i]);
        }
    }
}
