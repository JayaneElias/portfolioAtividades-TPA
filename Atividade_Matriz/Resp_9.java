/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp_9 {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3]; // Matriz do tabuleiro
        inicializarTabuleiro(tabuleiro);

        Scanner scanner = new Scanner(System.in);
        char jogadorAtual = 'X';
        boolean vencedor = false;
        int jogadas = 0;

        System.out.println("Vamos Brincar! Hora do Jogo da Velha:");
        exibirTabuleiro(tabuleiro);

        while (!vencedor && jogadas < 9) {
            System.out.println("Vez do jogador " + jogadorAtual);
            int linha, coluna;

            do {
                System.out.print("Escolha uma linha (1 a 3): ");
                linha = scanner.nextInt() - 1;
                System.out.print("Escolha uma coluna (1 a 3): ");
                coluna = scanner.nextInt() - 1;
            } while (!jogadaValida(tabuleiro, linha, coluna));

            
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;
            exibirTabuleiro(tabuleiro);

         
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                vencedor = true;
                System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
            } else if (jogadas == 9) {
                System.out.println("Empate! O jogo terminou.");
            }

           
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

   
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

   
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---|---|---");
        }
    }

    
    public static boolean jogadaValida(char[][] tabuleiro, int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            System.out.println("Posição inválida. Escolha novamente.");
            return false;
        }
        if (tabuleiro[linha][coluna] != ' ') {
            System.out.println("Posição já ocupada. Escolha novamente.");
            return false;
        }
        return true;
    }

    
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
       
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }

        
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }

        return false;
    }
}
