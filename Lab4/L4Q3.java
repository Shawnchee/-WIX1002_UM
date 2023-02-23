/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l4q1;

/**
 *
 * @author aykay
 */
import java.util.Scanner;
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int score  , minimum, maximum;
        double average =0 , standard =0, scoresq=0, sum=0, counter =0;
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a score [negative score to quit]:   ");
        score = scanner.nextInt();
        sum = score ;
        counter ++;
        scoresq = score*score ; 
        minimum = score ;
        maximum = score ;
         while (score>=0){
             System.out.print("Enter a score [negative score to quit]:   ");
             score = scanner.nextInt(); 
             if (score >0){
             counter ++ ;
             sum = sum + score ; 
             scoresq= scoresq + Math.pow(score,2);}
             if (score < minimum && score>0){
                 minimum = score ; }
             else if (score > maximum && score >0){
                 maximum = score ;}
             average = sum / counter ;
             standard = Math.sqrt ((scoresq-((Math.pow(sum, 2)/counter)))/(counter-1));
         }
            
         
                 
                
                 System.out.println("Minimum score: " + minimum);
                  System.out.println("Maxiumum score: " + maximum);
                   System.out.println("Average score: " + average);
                    System.out.format("Standard deviation: %.2f\n " , standard);
              
             
         
             
    }
}
         
    
 
    