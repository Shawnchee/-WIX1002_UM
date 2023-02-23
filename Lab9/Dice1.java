/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l9;



/**
 *
 * @author aykay
 */
public class Dice1 extends DiceGame {
    int diceEqual1, diceEqual2;
    
    public int rollDice(String player, int total){
            
             System.out.println(player + " score:");
             
             dice1 =super.roll() ;
             dice2 = super.roll() ;
             System.out.println("Dice 1: " + dice1 + " | Dice 2: " + dice2);
             total = total + (dice1 + dice2 );
             while (true){
             if (total >=100) break; 
             else if (dice1 == dice2){
             System.out.println("You have rolled equally, you may roll again");
             diceEqual1 =super.roll() ;
             diceEqual2 = super.roll() ;

             total = total + (diceEqual1 +diceEqual2);
             System.out.println("You have rolled: " +diceEqual1 +" and " + diceEqual2);
             break ;
             
            }
             else break ;
             
       //  System.out.println("");
        // System.out.println(player +": " + total);
       //  System.out.println("------------------------------------------------");


}
             System.out.println("");
             return total ; 
    }
}
