/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l6;

/**
 *
 * @author aykay
 */
import java.util.Scanner ;
import java.util.Random ; 
public class L6Q5 {

  
    
    public static void main(String args[]) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int num1 , num2, answer = 0;
    int score =0 ;
    int sum = 0 ;
    while (answer >=0){
           System.out.println("Enter negative number to quit: ");
            num1 = random.nextInt(13);
            num2 = random.nextInt(13);
            System.out.println(num1 + " x "+ num2 + " = " );
            answer = scanner.nextInt();
    
              score =  multiplication(num1,num2,answer);
              sum = sum + score ; 
          
    }
      System.out.println("Your Score is " + sum);
    }
    
    
    
    static int multiplication (int x, int y, int z){
        int count =0; 
        if (z == x*y){          //x*y = 0 , z =0
            count++;
            
        }   
        return count ; 
    }
       
        
   
}

