/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resp;
import java.util.Scanner;

/**
 *
 * @author jayane elias de farias
 */
public class Exercicio04 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá, digite um número de 1 a 12:");
        int Numero = scanner.nextInt();
        scanner.close();
        
        switch (Numero) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
                 case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
             case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;            
            default:
                 System.out.println ("Apenas existe 12 meses. escolha um deles.");
                break;
    }
    
    }
}
