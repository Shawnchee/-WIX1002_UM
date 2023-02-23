/*
Write a Java method that returns a triangular number. A triangular number is defined
as 1+2+3+…+ n. Then, write a Java program to use the method to display the first 20
triangular numbers.*/
package l6;

/**
 *
 * @author aykay
 */
public class L6Q1 {

    
    public static void main(String args[]) {
        for (int i = 1 ; i<=20 ; i++){
            System.out.println(triangle(i));
        }
    }
    
    static int triangle(int n){
        int sum = 0 ; 
        for (int i =1 ; i <= n ; i++){
            sum = sum + i ;
            
        }
        return sum ;
    }

}
