/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor_atividade;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Jayane Elias de Farias
 */
public class Resposta03 {
        public static void main(String[] args) {
        int[] numeros = new int[50];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); 
        }
        Arrays.sort(numeros);
        
        System.out.println("\nNúmeros gerados em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
