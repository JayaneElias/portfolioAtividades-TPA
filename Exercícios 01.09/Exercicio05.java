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
public class Exercicio05 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual nota A?");
        double NotaA = scanner.nextDouble();
        System.out.println("Qual nota B?");
        double NotaB = scanner.nextDouble();
        System.out.println("Qual nota C?");
        double NotaC = scanner.nextDouble();
        System.out.println("Qual nota D? ");
        double NotaD = scanner.nextDouble();
        System.out.println("Qual nota E? ");
        double NotaE = scanner.nextDouble();
        
       if ( NotaA >= 9) 
       { System.out.println("Aprovado!!!"); }
       
       else { 
           if( NotaB >= 7 && NotaB < 9) 
           { System.out.println("Aprovado!!!"); }
           
       else { 
            if ( NotaC >= 5 && NotaB < 7) 
            { System.out.println("Aprovado!!!"); }
       else {
            if ( NotaD >= 2.5 && NotaD < 7) 
            { System.out.println("Reprovado"); }
       else {
            if ( NotaE < 2.5) { System.out.println("Reprovado!!!"); }
            }
            }
           }
       }
    }
    
}
