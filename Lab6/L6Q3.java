/*
. Write a Java method that accepts an array of 10 integers. The method should reverse
the integer in the array. Example, if the number is 1234, the number will change to
4321
 */
package l6;

/**
 *
 * @author aykay
 */
import java.util.Scanner ;
public class L6Q3 {

    
    public static void main(String args[]) {

     Scanner scanner = new Scanner(System.in);
     int [] ReversedNumbers = new int [10];
     int [] number = new int [10];
     System.out.println("Enter 10 integers: ");
     for (int i = 0 ; i <10 ; i++){
         number[i] = scanner.nextInt(); 
     }
     ReversedNumbers = reverse(number);
        for(int i =0 ; i <10 ; i++){
     System.out.print(ReversedNumbers[i]+"\t");
        }
    
}
    public static int [] reverse (int [] input){
        for (int i = 0; i <10 ; i++){
            int num = 0;
            while (input [i] !=0){
                int remainder = input[i] %10;
                num = (num * 10) + remainder ; 
                input [i] = input [i] /10 ;
                
            }
            input [i] = num ;
           
        }
        return input;
       
    }
}
