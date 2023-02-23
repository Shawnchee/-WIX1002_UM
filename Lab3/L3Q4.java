/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l3q1;

/**
 *  
 *
 * @author aykay
 */
import java.util.Random ; 
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int player1score = 0 , player2score = 0;
        int p1dice1 , p1dice2, p2dice1 , p2dice2;
        p1dice1 = random.nextInt(6)+1;
        System.out.println("Player 1 rolled a " +p1dice1);
        p1dice2 = random.nextInt(6)+1;
        System.out.println("\nPlayer 1 rolled another " +p1dice2);
        player1score = p1dice1 + p1dice2;
        System.out.println("\nPlayer 1 score is " +player1score);

        
        p2dice1 = random.nextInt(6)+1;
        System.out.println("\nPlayer 2 rolled a " +p2dice1);
        p2dice2 = random.nextInt(6)+1;
        System.out.println("\nPlayer 2 rolled another " +p2dice2);
        player2score = p2dice1 + p2dice2;
        System.out.println("\nPlayer 2 score is " +player2score);
        
        if (player1score > player2score)
            System.out.println("\nPlayer 1 wins!");
        else if (player2score > player1score)
            System.out.println("\nPlayer 2 wins!");
        else 
            System.out.println("\nIts a tie!");
        
        

     
        
        
                
        // TODO code application logic here
    }
}
