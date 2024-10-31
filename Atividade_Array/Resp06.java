/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp06 {
    public static void main(String[] args) {
        int[] NumerosImpares = new int[100];

        for (int i = 0; i < NumerosImpares.length; i++) {
            NumerosImpares[i] = i * 2 + 1; 
        }

        
        System.out.println("Números ímpares armazenados no array:");
        for (int numero : NumerosImpares) {
            System.out.println(numero);
        }
    }
}
