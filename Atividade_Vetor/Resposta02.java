/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor_atividade;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author jaime
 */
public class Resposta02 {
    public static void main(String[] args) {
       
        String[] nomes = new String[15];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 15 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("\nNomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        scanner.close();
    }
}