/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaime
 */
public class Resp05 {
     public static void main(String[] args) {
        int[] numerosPares = new int[100];

        
        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = i * 2; //
        }

        
        System.out.println("Números pares armazenados no array:");
        for (int numero : numerosPares) {
            System.out.println(numero);
        }
    }
}
