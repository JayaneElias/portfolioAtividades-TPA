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
public class Pergunta_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o Valor Inicial: ");
        int ValorInicial = scanner.nextInt();
        System.out.println("Informe o Valor Final: ");
        int ValorFinal = scanner.nextInt();
        scanner.close();
         
       int SomaValor = 0;
        
       for (int i = ValorInicial; i <= ValorFinal; i++) 
            if (i % 2 != 0) {
                SomaValor += i;
      }
     System.out.println("A soma dos números ímpares entre " + ValorInicial + " e " + ValorFinal + " é: " + SomaValor);
       
    }
      
    }

