/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner; 
 
public class L2Q1 {

    /**
     
     */
    
    public static void main(String args[]) {
         Scanner sc  = new Scanner (System.in);
         double temp, temp2;
         System.out.println("Enter temperature (Farenheit)= ");
         temp = sc.nextDouble();
         temp2 = (temp-32)/1.8;
         System.out.printf("Temperature (Celsius)= %.2f\n", temp2);
        // TODO code application logic here
    }
}

/*
*/