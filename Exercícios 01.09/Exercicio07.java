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
public class Exercicio07 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Você terá que digitar duas datas diferentes, vamos começar!!!");
     System.out.println("Digite o Dia dessa Primeira Data:");
     int Dia01 = scanner.nextInt();
     System.out.println("Digite o Mês dessa Primeira Data:");
     int Mês01 = scanner.nextInt();
     System.out.println("Digite o Ano dessa Primeira Data:");
     int Ano01 = scanner.nextInt();
     System.out.println("Digite o Dia dessa Segunda Data:");
     int Dia02 = scanner.nextInt();
     System.out.println("Digite o Mês dessa Segunda Data:");
     int Mês02 = scanner.nextInt();
     System.out.println("Digite o Ano dessa Segunda Data:");
     int Ano02 = scanner.nextInt();
     
     if (Ano01 < Ano02) 
     { System.out.println("Ordem Crescente: " + Dia01 + "/"+ Mês01 + "/" +  Ano01 + " a " + Dia02 + "/" + Mês02 + "/" + Ano02);   }
     else if (  Ano02 < Ano01 ) 
     { System.out.println("Ordem Crescente: " + Dia02 + "/"+ Mês02 + "/" +  Ano02 + " a " + Dia01 + "/" + Mês01 + "/" + Ano01);   }    
     else if (  Ano01 == Ano02 && Mês01 < Mês02 ) 
     { System.out.println("Ordem Crescente: " + Dia01 + "/"+ Mês01 + "/" +  Ano01 + " a " + Dia02 + "/" + Mês02 + "/" + Ano02);   }    
     else if (  Ano01 == Ano02 && Mês02 < Mês01 )   
     { System.out.println("Ordem Crescente: " + Dia02 + "/"+ Mês02 + "/" +  Ano02 + " a " + Dia01 + "/" + Mês01 + "/" + Ano01);   }       
     else if (  Ano01 == Ano02 && Mês01 == Mês02 && Dia01 < Dia02) 
     { System.out.println("Ordem Crescente: " + Dia01 + "/"+ Mês01 + "/" +  Ano01 + " a " + Dia02 + "/" + Mês02 + "/" + Ano02);   }       
     else if (  Ano01 == Ano02 && Mês01 == Mês02 && Dia02 < Dia01)   
     { System.out.println("Ordem Crescente: " + Dia02 + "/"+ Mês02 + "/" +  Ano02 + " a " + Dia01 + "/" + Mês01 + "/" + Ano01);   }   
     else if (  Ano01 == Ano02 && Mês01 == Mês02 && Dia01 == Dia02) 
     { System.out.println("Ambos são iguais: " + Dia01 + "/"+ Mês01 + "/" +  Ano01 + " e " + Dia02 + "/" + Mês02 + "/" + Ano02);   }       
    }
    
}
