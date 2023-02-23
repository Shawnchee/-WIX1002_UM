/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package l4q1;

/**
 *
 * @author aykay
 */
import java.util.Scanner ;
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int integer ,result = 0 ; 
        System.out.print("Enter an integer: ");
        integer = scanner.nextInt();
        System.out.print("The sum of the following is: ");
         for(int i = 1 ; i<= integer ; i++){
             
             result = result + i ; }
        
            System.out.println(result);
          
    }
}
         
         
        // TODO code application logic here
    
    

