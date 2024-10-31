/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jayane elias de farias
 */
public class Resp02 {
      public static void main(String[] args) {
        String[] nomes = new String[20];

    
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
        nomes[10] = "Maria Eduarda";
        nomes[11] = "Francisca";
        nomes[12] = "Jaime";
        nomes[13] = "Jucelia";
        nomes[14] = "Isael";
        nomes[15] = "Yanna";
        nomes[16] = "Wanda";
        nomes[17] = "Linda";
        nomes[18] = "Bruma";
        nomes[19] = "Viviane";

       
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - 1 - i; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) < 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }

     
        System.out.println("Nomes Armazenados no Array em Ordem Decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
