/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor_atividade;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resposta04 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); 
        }
        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("\nNúmeros gerados em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}