/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jayane elias de farias
 */
public class Resp07 {
    public static void main(String[] args) {
      
        String[] times = new String[20];

        times[0] = "Botafogo";
        times[1] = "Palmeiras";
        times[2] = "Fluminense";
        times[3] = "Grêmio";
        times[4] = "São Paulo";
        times[5] = "Internacional";
        times[6] = "Atlético Mineiro";
        times[7] = "Corinthians";
        times[8] = "Santos";
        times[9] = "Athletico Paranaense";
        times[10] = "Ceará";
        times[11] = "Bahia";
        times[12] = "Fortaleza";
        times[13] = "Vasco da Gama";
        times[14] = "Goiás";
        times[15] = "Bragantino";
        times[16] = "Cruzeiro";
        times[17] = "Atlético Goianiense";
        times[18] = "Coritiba";
        times[19] = "America Mineiro";

       
        System.out.println("Tabela de Classificação do Campeonato Brasileiro:");
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + "° " + times[i]);
        }
    }

}
