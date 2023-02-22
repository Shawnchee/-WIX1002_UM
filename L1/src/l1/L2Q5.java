/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author aykay
 */
import java.util.Random ;
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random ();
        int number, sum =0;
        number = random.nextInt(10001); // (max - min +1) +min//
        
        System.out.println("The number: " +number);
       while (number>0){
            sum = sum + number%10 ;
            number = number / 10 ;
           
        }
        System.out.println("Sum of digits: "+sum);
// TODO code application logic here
    }
}
