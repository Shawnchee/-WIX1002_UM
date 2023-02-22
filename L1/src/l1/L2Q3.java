/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author aykay
 */

import java.util.Random ; 
/**
 * Test9
 */
public class L2Q3 {

    public static void main(String[] args) {
        Random shawn = new Random();
        int sum = 0,  number=0, numbertest;
        double average =0 ;
        for (int i=0;i<3;i++){
        number = shawn.nextInt(41) +10;
        System.out.println("Three generated numbers:"+number);
            sum = sum + number;
           
    }
           average = (double)sum/3;
           System.out.format("Sum of numbers: %d\n" ,sum); 
           System.out.format("Average: %.2f\n" , average); // %.2f for double(got decimal points)//
}
}