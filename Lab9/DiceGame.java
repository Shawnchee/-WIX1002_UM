/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l9;

import java.util.Random;

/**
 *
 * @author aykay
 */
public class DiceGame {
    int  score  =0 , total1 = 0 , total2 =0 ;
    int dice1 , dice2 ;
        Random random = new Random();

    public int roll (){
        return random.nextInt(6)+1 ;
    }
    public void display (int total1, int total2 ){
        
        if (total1 > total2)
        System.out.println("Congratulations! Player 1 has won the game with: " + total1 + " points, beating Player 2 with only " +total2 + " points.");
        else if (total2 > total1)
        System.out.println("Congratulations! Player 2 has won the game with: " + total2 + " points, beating Player 1 with only " +total1 + " points.");
    }
}
