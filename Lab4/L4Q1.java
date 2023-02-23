/*
 Write a program that accepts an integer from user. 
Then, display its entire factors in
increasing order.
 */

package l4q1;

/**
 *
 * @author aykay
 */
import java.util.Scanner ;
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int number;
      System.out.print("Enter an integer:  ");
      number = scanner.nextInt();
      System.out.print("The factors are: ");
      for (int i = 1; i <=number ; i ++){
          if (number == i) {
              System.out.println(i);
          }
          else if (number%i==0){
              System.out.print(i +" , " );
          }
        ;
        // TODO code application logic here
    }
    
    }
}
    
