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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe em centimetros a Variável A:");
        double VariavelA = scanner.nextDouble();
        
        System.out.println("Informe em centimetros a Variável B:");
        double VariavelB = scanner.nextDouble();
        
        System.out.println("Informe em centimetros a Variável C:");
        double VariavelC = scanner.nextDouble();
        
        if ( VariavelA == VariavelB || VariavelA == VariavelC || VariavelB == VariavelC) 
        { System.out.println("Esse é um Triângulo: Isósceles"); }
        
        else if ( VariavelA == VariavelB && VariavelC == VariavelB && VariavelA == VariavelC) 
        { System.out.println("Esse é um Triângulo: Equilatero"); }
        
        else if ( VariavelA != VariavelB && VariavelB != VariavelC && VariavelA != VariavelC) 
        { System.out.println("Esse é um  Triângulo: Escaleno"); }
        
        else { System.out.println("Não é um Triângulo!!!"); }
    }
    
}
