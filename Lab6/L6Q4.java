/*
Write a Java method that implements Euclidean Algorithm to return the greatest
common divisor of two positive integers. Then, write a program to get the GCD for
(24, 8) and (200, 625).

 */

package l6;

public class L6Q4 {
    
  
    public static void main(String args[]) {
        System.out.println("The greatest common divisor(GCD) of (24,8) is "+ GCD(24,8));
         System.out.println("The greatest common divisor(GCD) of (200,625) is "+ GCD(200,625));

    }
    static int GCD (int x, int y){
        int remainder = 1 ; 
        while (remainder!=0){
        remainder = x%y ; //200

        if (remainder ==0){
            break ; 
        }
        else if (remainder !=0){
            x =y ;
            y = remainder ; 
            
        }
        
        }
        return y ;
    }
}
     
    


