/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.Random;

/**
 *
 * @author aykay
 */
public class Game {
    String name1, name2 ; 
    int player1 , player2 ;
   

    public Game (String name1, String name2){
        this.name1  = name1 ; 
        this.name2 = name2;
    }
    public void Roll (){
            Random random = new Random ();
            this.player1 = random.nextInt(6)+1;
            this.player2 = random.nextInt(6)+1;

    }
}
