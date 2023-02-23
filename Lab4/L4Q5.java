/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l4q1;

/**
 *
 * @author aykay
 */
import java.util.Random ; 
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int player1dice  , player2dice  , player1 = 0, player2=0 ;
       
        while (player1 <= 100 && player2 <=100){
            player1dice = random.nextInt(6)+1;
            System.out.println ("Player 1 rolled a " +player1dice);
            player1 = player1 + player1dice ;
            if (player1dice ==6){
                player1dice = random.nextInt(6)+1;
            System.out.println ("Player 1 rolled a 6,he can roll another time which is " +player1dice);
                player1 = player1 + player1dice ;
                
             if (player1 > 100){
            System.out.println("Player 1 wins with a total of "+player1+" points");
             break;}}
            player2dice = random.nextInt(6)+1;
            System.out.println ("Player 2 rolled a " +player2dice);
            player2 = player2 + player2dice ;
            if (player2dice==6){
                player2dice = random.nextInt(6)+1;
                System.out.println ("Player 2 rolled a 6,he can roll another time which is " +player2dice);
                player2 = player2 + player2dice ;
                if (player2 >100){
            System.out.println("Player 2 wins with a total of "+player2+" points");
            break ;}}
            
        }
       
        }
        // TODO code application logic here
    }

