/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resp;

/**
 *
 * @author Jayane Elias de Farias
 */
public class Pergunta_03 {
    public static void main(String[] args) {
       
        int Começo = 1000;
        int Final = 1250;
        int Valor = 0;
       
        for (int i =  Começo; i <= Final; i++) {
        Valor++;
        }
       
        System.out.println("Está é a quantidade de números entre " + Começo + " e " + Final + ": "  );
        for (int i = Começo; i <= Final; i++) {
        System.out.println(i);
        Valor++;
        }
        System.out.println("Quantidade de números entre " + Começo + " e " + Final + ": " + Valor);
    
  }
}
