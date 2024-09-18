/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resp;
import java.util.Scanner;
/**
 *
 * @author Jayane Elias de Farias
 */
public class Pergunta_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um Número para calcular a sua Tabuada: ");
        int numero = scanner.nextInt();
         
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
         
        System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
       
    
   }
}
