/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Jayane Elias de Farias
 */
public class Resp_8 {
       public static void main(String[] args) {
        int [][] mat = {{1,42,23,14,51},{22,32,55,54,12}};
        int x,y;
        JOptionPane.showMessageDialog(null, "******** Exibindo apenas os elementos pares da matriz *******");
         for (x = 0; x < 2; x++)
          {
            for (y = 0; y < 5; y++)
              {
                 if(mat[x][y] % 2 ==0)
                  {
                    System.out.println(mat[x][y]+ " ");
                  } 
                 else
                  {
                    System.out.println(" - ");
                  }
            }
            System.out.print("\n");
        }
    }
}
