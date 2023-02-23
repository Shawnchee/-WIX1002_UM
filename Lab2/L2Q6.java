/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author aykay
 */
/*Write a program that calculates the energy needed to heat water.
Q = M * (final temperature – initial temperature) * 4184
M = Weight of water in kg
Q = Energy in joules
The temperature are in degree Celsius */
import java.util.Scanner ;
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        double weight , initialtemp, finaltemp, energy;
        System.out.println("Enter amount of water (gram): ");
        weight = sc.nextDouble();
        System.out.println("Enter the initial temperature (Fahrenheit): ");
        initialtemp = sc.nextDouble ();
        System.out.println("Enter the final temperature (Fahrenheit): ");
        finaltemp = sc.nextDouble ();
        energy = (weight/1000) * ((finaltemp-32)*5/9 - (initialtemp-32)*5/9) * 4184;
        System.out.format ("Energy needed: %e\n", energy);
        
      
        // TODO code application logic here
    }
}
