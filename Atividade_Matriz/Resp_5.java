/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp_5 {
    public static void main(String[] args) {
        final int NumLinhas = 4, NumColunas = 4;
        String[][] Matriz = new String[NumLinhas][NumColunas]; // Usar String para armazenar o símbolo '*'
        int Linha, Coluna;

         System.out.println("Atividade - Resposta:");
        
        System.out.println("\nA):");
        for (Linha = 0; Linha < NumLinhas; Linha++) {
            for (Coluna = 0; Coluna < NumColunas; Coluna++) {
                Matriz[Linha][Coluna] = "*";  // Preencher com '*'
            }
        }

        for (Linha = 0; Linha < NumLinhas; Linha++) {
            for (Coluna = 0; Coluna < NumColunas; Coluna++) {
                System.out.print(Matriz[Linha][Coluna] + " ");
            }
            System.out.println();
        }

        System.out.println("\nB):");
        for (Linha = 0; Linha < NumLinhas; Linha++) {
            for (Coluna = 0; Coluna < NumColunas; Coluna++) {
                if ((Linha == 1 || Linha == 2) && (Coluna == 1 || Coluna == 2)) {  // Coluna 2 e 3 nas linhas 2 (índice 1) e 3 (índice 2)
                    Matriz[Linha][Coluna] = " ";  // Deixar em branco
                } else {
                    Matriz[Linha][Coluna] = "*";  // Preencher com '*'
                }
            }
        }

        
        for (Linha = 0; Linha < NumLinhas; Linha++) {
            for (Coluna = 0; Coluna < NumColunas; Coluna++) {
                System.out.print(Matriz[Linha][Coluna] + " ");
            }
            System.out.println();
        }
        System.out.println("\nC):");
        for (Linha = 0; Linha < NumLinhas; Linha++) {
            for (Coluna = 0; Coluna < Linha + 1; Coluna++) { 
                Matriz[Linha][Coluna] = "*";
            }
            for (Coluna = Linha + 1; Coluna < NumColunas; Coluna++) { 
                Matriz[Linha][Coluna] = " ";
            }
        }

        for (Linha = 0; Linha < NumLinhas; Linha++) {
            for (Coluna = 0; Coluna < NumColunas; Coluna++) {
                System.out.print(Matriz[Linha][Coluna] + " ");
            }
            System.out.println();
        }
    }
}
