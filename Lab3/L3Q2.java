/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l3q1;

/**
 *
 * @author aykay
 */
import java.util.Random;
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int number = random.nextInt(6);

        if (number == 0){
            System.out.println(number+" is zero");}
        else if (number == 1){
            System.out.println(number+" is one");}
        else if (number == 2){
            System.out.println(number+" is two");}
        else if (number == 3){
            System.out.println(number+" is three");}
        else if (number == 4){
            System.out.println(number+" is four");}
        else if (number == 5){
            System.out.println(number+" is five"); }   
            
        }
        
        // TODO code application logic here
    }

