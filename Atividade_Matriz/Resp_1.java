/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp_1 {
    public static void main(String[] args) {
        char[][] matriz = new char[4][5];
        int[][] MatrizNumeros = new int[3][4];
        double[][] MatrizDecimais = new double[3][3];
        
        char letra = 'a';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = letra;
                  if (letra == 'k') {
                letra++;
                  }
                    matriz[i][j] = letra;
                letra++;
            }
        }
        MatrizNumeros[0] = new int[] {19, 25, 100, 99}; 
        MatrizNumeros[1] = new int[] {10, 7, 25, 14}; 
        MatrizNumeros[2] = new int[] {35, 2, 47, 74};
        
       
        MatrizDecimais[0] = new double[] {1.9, 2.5, 10.0}; 
        MatrizDecimais[1] = new double[] {1.0, 7.8, 2.5};  
        MatrizDecimais[2] = new double[] {3.5, 2.2, 4.7}; 


       
        System.out.println("A)R:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
            }

        System.out.println("\nB)R:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(MatrizNumeros[i][j] + "\t");
            }
            System.out.println();
            }
     System.out.println("\nC)R:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(MatrizDecimais[i][j] + "\t");
            }
            System.out.println();
      }
   }
}

