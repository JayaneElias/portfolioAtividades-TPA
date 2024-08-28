/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resp.Ativ;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class DadosPrimitivos {
    public static void main(String[] args) {
        //Captura de valores
        try(//Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in)){
            
        //Pedidndo para o usuário digitar o nome
        System.out.println("Por favor digite seu nome: ");
            
        //Lendo o nome fornecido pelo usuário
        var nome = scanner.next() + scanner.nextLine();
        
        //Pedidndo para o usuário digitar o nome
        System.out.println("Por favor digite sua idade: ");
        
        //Lendo a idade fornecido pelo usuário
        int idade = scanner.nextInt();
            
        //Pedidndo para o usuário digitar o sexo
        System.out.println("Por favor digite seu sexo: "); 
        
        //Lendo o sexo fornecido pelo usuário
        var sexo = scanner.next() + scanner.nextLine();
        
        //Pedidndo para o usuário digitar o endereço
        System.out.println("Por favor digite seu endereço: "); 
        
        //Lendo o endereço fornecido pelo usuário
        var endereco = scanner.next() + scanner.nextLine();
        
        //Pedidndo para o usuário digitar a altura
        System.out.println("Por favor digite sua altura: "); 
                   
        //Lendo o altura fornecido pelo usuário
        double altura = scanner.nextDouble();
        
        //Pedidndo para o usuário digitar as observações
        System.out.println("Por favor digite as observações: "); 
        
        //Lendo as observações fornecido pelo usuário
        var observações =  scanner.next() + scanner.nextLine();
        
        //Pedidndo para o usuário digitar o pese
        System.out.println("Por favor digite seu peso: "); 
         
        //Lendo o peso fornecido pelo usuário
        double peso = scanner.nextDouble();
        
        //Calcule o imc
       double imc = peso /altura * altura;
       
        //Mostre para o usuário o nome
        System.out.println("Nome:" + nome);
        
        //Mostre para o usuário a idade
        System.out.println("Idade" + idade);
        
        //Confere e mostre qual o sexo (F ou M) armazenado na variável sexo
        if(sexo == "M") {
            System.out.println("Sexo: Maculino");
        }else{
            System.out.println("Sexo: Feminino");
        }
        
        
          //Mostre para o usuário seu endereço
        System.out.println("Endereço:" + endereco);
        
        //Mostre a altura
        System.out.println("Altura:" + altura);
        
        //Mostre o Peso
        System.out.println("Peso:" + peso);
        
        //Mostre o IMC
        System.out.println("IMC:" + imc);
        
        
        
        
        }
                
    }
}
