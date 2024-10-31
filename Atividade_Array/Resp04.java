/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp04 {
     public static void main(String[] args) {
        int[] numeros = new int[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    // Troca de lugares
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        } 
        System.out.println("Números armazenados no array em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
