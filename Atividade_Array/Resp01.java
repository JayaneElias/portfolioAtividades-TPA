/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp01 {
       public static void main(String[] args) {
        // Criação do array para armazenar 10 nomes
        String[] nomes = new String[10];

        // Adicionando nomes ao array
        nomes[0] = "Jayane";
        nomes[1] = "João Inácio";
        nomes[2] = "Ana Julia";
        nomes[3] = "Isabella Cristina";
        nomes[4] = "Letícia";
        nomes[5] = "Alice";
        nomes[6] = "Francisca";
        nomes[7] = "Isabel";
        nomes[8] = "Nino";
        nomes[9] = "Malhado";
      
        

        // Ordenando os nomes em ordem alfabética usando Bubble Sort
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - 1 - i; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                    // Troca de lugares
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }

        // Exibindo os nomes em ordem alfabética
        System.out.println("Nomes Armazenados no Array em Ordem Alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
