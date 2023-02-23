/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author aykay
 */
public class TesterQ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
        String name1 , name2 ;
        System.out.println("Enter Player 1 name: ");
        name1 = scanner.nextLine();
        System.out.println("Enter Player 2 name: ");
        name2=scanner.nextLine();
        Game g = new Game (name1, name2);
        int total1 = 0, total2 = 0 ;
        while (total1 <100 && total2<100){
        g.Roll();
        total1 = total1+ g.player1;
        if (total1 >100 )
            break;
        total2 = total2+ g.player2; 
        if (total2 >100)
            break;
    }
        if (total1 > total2)
            System.out.println("Player 1 has won with " + total1 +" points, beating Player 2 with only " + total2 +" points");
        if (total2 >total1)
            System.out.println("Player 2 has won with " + total2 +" points, beating Player 1 with only " + total1 +" points");
        
}
}
