/*
 * Write a program to randomly generate N student scores (0-100). The program will
prompt the user to enter N students and store the score in an array. Then, the program
will display a list of score, the highest score, the lowest score and the average score.
 */
package l5;

/**
 *
 * @author aykay
 */
import java.util.Random ;
import java.util.Scanner ; 
import java.util.Arrays ; 
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random ();
        Scanner scanner  = new Scanner (System.in);
        int sum = 0 , highest = 0 , lowest = 100 ;
        double average ;
        System.out.print("Enter number of students:  ");
        int students = scanner.nextInt();
            int [] score = new int [students];
        
        for (int i = 0 ; i <students ; i++){
            score [i] = random.nextInt(101);
            
              sum = sum + score [i];
              if ( score [i] >  highest){
                  highest = score [i];
              }
              if ( score [ i ] < lowest){
                  lowest  = score [i];
            
              }
              
              

        }
        average = (double)sum / students ; 
          System.out.println("The list of scores are: " +Arrays.toString(score));
              System.out.println("The highest score is: " + highest);
              System.out.println("The lowest score is: " + lowest);
              System.out.printf("The average score is: %.2f\n " , average);
   

        // TODO code application logic here
    }
}
