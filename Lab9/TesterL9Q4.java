/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l9;

/**
 *
 * @author aykay
 */
public class TesterL9Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Dice1 d1 = new Dice1();
        int player1=0 , player2 =0; 
        System.out.println("First Dice Game");
        System.out.println("-----------------------------------"); 
        while (true){
        player1 =  d1.rollDice("Player1", player1);
        if (player1 >=100) break;
        player2 =   d1.rollDice("Player2" , player2);
        if (player2 >= 100) break ;
            System.out.println("----------------------------------------");
        }
        d1.display(player1, player2);
        System.out.println("");
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("");
        System.out.println("Second Dice Game");
        System.out.println("--------------------------------------------");
        
        Dice2 d2 = new Dice2();
        player1 = 0  ;
        player2 = 0 ;
        while(true){
            player1 = d2.rollDice("Player1", player1);
            if (player1 == 100) break ;
            player2 = d2.rollDice("Player2", player2);
            if (player2 ==100) break ;
            System.out.println("------------------------------------------------");
        }
        d2.display(player1, player2);
        
        
        
    }
}
