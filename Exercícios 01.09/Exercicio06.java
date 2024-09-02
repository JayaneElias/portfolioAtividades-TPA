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
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua Idade para sabermos classificar você de acordo com ela:");
        int Idade = scanner.nextInt();
        
        if ( Idade >= 5 && Idade <= 7) 
        { System.out.println("Você é: Infantil A");  }
        else if ( Idade >= 8 && Idade <= 10 ) 
        { System.out.println("Você é: Infantil B");  }
        else if ( Idade >= 11 && Idade <= 13 )  
        { System.out.println("Você é: Juvenil A"); }
        else if ( Idade >= 14 && Idade <= 17 )  
        { System.out.println("Você é: Juvenil B"); }
        else if ( Idade > 18 )  
        { System.out.println("Você é: Senior"); }
    }
    
}
