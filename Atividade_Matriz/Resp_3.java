/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp_3 {
    public static void main(String[] args) {
        int[][] Matriz = new int[3][5];
        int[] ElementosVistos = new int[100]; 
        int Pares = 0, Impares = 0;
        boolean itensRepetidos = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Matriz[i][j] = (int) (Math.random() * 100);
                
                if (ElementosVistos[Matriz[i][j]] > 0) {
                    itensRepetidos = true;
                } else {
                    ElementosVistos[Matriz[i][j]]++; 
                }
                if (Matriz[i][j] % 2 == 0) {
                    Pares++; 
                } else {
                    Impares++; 
                }
            }
        }
        System.out.println("Essa é uma Matriz 3x5:");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 5; j++) {
                System.out.print(Matriz[i][j] + "\t"); 
            }
            System.out.println(); 
        }

        
        System.out.println("\nEstá á uma Matriz possui elementos repetidos? " + (itensRepetidos ? "Sim" : "Não"));
        System.out.println("Quantidade de Números pares: " + Pares); 
        System.out.println("Quantidade de Números impares: " + Impares); 
    }

}
