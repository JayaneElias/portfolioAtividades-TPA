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
public class Exercicio01 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
          
      System.out.println("Informe a horário que começa o seu turno: ");
      int  HoraTurno = scanner.nextInt();
         
        if ( HoraTurno < 0 ||  HoraTurno >= 24) {
         System.out.println("Hora inválida. Deve estar entre 0 e 23.");
        } 
        else if (HoraTurno >= 5 &&  HoraTurno < 13) {
                System.out.println("Turno da Manhã");
            } 
        else if ( HoraTurno >= 13 &&  HoraTurno < 21) {
                System.out.println("Turno da Tarde");
            } 
        else {
                System.out.println("Turno da Noite");
            
               }
         }
    }


