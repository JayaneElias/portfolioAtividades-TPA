/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp_4 {
    public static void main(String[] args) {
        double[][] Matriz = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Matriz[i][j] = Math.random() * 100; 
            }
        }

       
        System.out.println("Essa é a Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f\t", Matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nValores que são da Diagonal Principal/Primária:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", Matriz[i][i]);
        }

        System.out.println("\n\nValores que são da Diagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%.2f ", Matriz[i][3 - i]);
        }
    }
}
