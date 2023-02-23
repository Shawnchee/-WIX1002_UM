/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l9;

/**
 *
 * @author aykay
 */
public class Dice2 extends DiceGame {
    
    
    public int rollDice (String player , int total){
        
        dice1 = super.roll() ;
        System.out.println(player +" has rolled " +dice1);
        System.out.println("");
        total += dice1 ;
        dice2 = 0 ;
        while (dice1 == 6) {
            dice2 = super.roll() ;
            System.out.println("Since " +player +" has rolled 6, he can roll again, he has rolled " + dice2);
            System.out.println("");
            if (dice2==6) {
                System.out.println(player +" has rolled" +dice2 + " again, so it will not count");
                System.out.println("");
                break ; }
            
            else total += dice2 ;
            break ; 
        }
        if (total >100){
            System.out.println("Since "+ player+" has rolled over 100,which is " + total +" ,the previous score which is " + (dice1+dice2) + " does not count.");
            System.out.println("");
            total -= (dice1 + dice2);
        }
        System.out.println("");
        return total ; 
    }
}