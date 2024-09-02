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
public class Exercicio03 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
      System.out.println("Olá, seja Bem-Vindo(a) ao McDonald's!");
      System.out.println("Essas são as nossas opções no cardapio de hoje:");
        
        System.out.println("1. Big Mac");
        
        System.out.println("2. McChicken");
        
        System.out.println("3. Quarter Pounder");
        
        System.out.println("4. McNuggets");
        
        System.out.println("5. McFlurry");
        
        System.out.print("Digite o número da opção desejada: ");
        int Opções = scanner.nextInt();
        scanner.close();
        
        switch (Opções) {
            case 1:
                System.out.println("Você escolheu um delicioso: Big Mac");
                break;
            case 2:
                System.out.println("Você escolheu um gorduroso: McChicken");
                break;
            case 3:
                System.out.println("Você escolheu um saboroso: Quarter Pounder");
                break;
                 case 4:
                System.out.println("Você escolheu um maravilhoso: McNuggets");
                break;
            case 5:
                System.out.println("Você escolheu um fabuloso: McFlurry");
                break;
            default:
                System.out.println("Tal Opção não está no cardapio. Escolha um número entre 1 e 5. Não o " + Opções);
                break;
        }
    }
}
    