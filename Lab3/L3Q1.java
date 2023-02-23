/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l3q1;

/**
 *
 * @author aykay
 */
import java.util.Scanner ;
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          
        Scanner sc = new Scanner(System.in);
        double num1 , num2;
        double result ;
        char operand ;
        char plus = '+';
        char minus = '-';
        char multiply = '*' ;
        char divide = '/' ;
        char remainder = '%' ;
        
        System.out.println("Enter two integer number: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the operand(+,-,*,/,%): ");
        operand = sc.next().charAt(0);
      
        
        if (operand == plus ){
            result = num1 + num2;
            System.out.println(num1 + " + " +num2 + " = " +result);                  
        }
        else if (operand == minus ){
            result = num1 - num2;
            System.out.println(num1 + " - " +num2 + " = " +result);}
         
         else if (operand == multiply ){
            result = num1 * num2;
            System.out.println(num1 + " * " +num2 + " = " +result); }
        
         else if (operand == divide ){
            result = num1 / num2;
            System.out.println(num1 + " / " +num2 + " = " +result);   
         }
            else if (operand == remainder ){
            result = num1 % num2;
            System.out.println(num1 + " % " +num2 + " = " +result); }  
             
            else 
                System.out.println("Enter the correct operand.");
               
        
        

    
        
        // TODO code application logic here
    }
 
}

    

