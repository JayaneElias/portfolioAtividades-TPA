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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual seu Peso? ");
        double  Peso = scanner.nextDouble();
        System.out.println("Qual sua Altura? ");
        double  Altura = scanner.nextDouble();
        
        double IMC = Peso / (Altura*Altura);
        System.out.println("IMC = " + IMC);
    
         if ( IMC <= 18 ) 
         {System.out.println("Você está em um Nível de Magreza"); }
        
        else if (IMC > 18.0 && IMC <= 24.9 )
        { System.out.println("Você está em um Nível Saudavel"); }
        
        else if (IMC >= 25.0 && IMC >= 29.9 ) 
        { System.out.println("Você está em um Nível de Sobrepeso"); }
         
        else if (IMC >= 30.0 ) 
        { System.out.println("Você está em um Nível de Obesidade"); }
}
}
    
        
  

