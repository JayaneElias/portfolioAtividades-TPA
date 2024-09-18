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
public class Pergunta_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        System.out.println("Informe o Valor Inicial: ");
        int ValorInicial = scanner.nextInt();
        System.out.println("Informe o Valor Final: ");
        int ValorFinal = scanner.nextInt();
        scanner.close();
        
      
         if (ValorInicial > ValorFinal) {
            System.out.println("O valor inicial deve ser menor ou igual ao valor final.");
        } 
         else {
            System.out.println("Números pares no intervalo de " + ValorInicial + " a " + ValorFinal + " em ordem decrescente:");
            if (ValorFinal % 2 != 0) { ValorFinal--;
            }
            if (ValorInicial % 2 != 0) { ValorInicial++; 
            }
            for (int i = ValorFinal; i >= ValorInicial; i -= 2) {
                System.out.println(i);
            }
        }
    }
}
    
