


package l5;

/**
 *
 * @author aykay
 */
import java.util.Scanner;  
import java.util.Arrays ;
import java.util.Random ; 
public class L5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random ();
        System.out.print("Enter the number of employees:\t ");
        int employees = scanner.nextInt();

        int [][] workHours = new int[employees][7];
        int [] total = new int[employees];

        for(int i = 0; i<workHours.length; i++){
            for(int j = 0; j<workHours[i].length; j++){
                workHours [i][j] = random.nextInt(7) +1 ;
                total[i] = total [i] + workHours[i][j];
            }
        }

        System.out.println("The working hours and total hours of the employees: ");

 for(int z = 0; z< workHours.length; z++) {
            System.out.print(( z+ 1) + ". " + Arrays.toString(workHours[z]) + " Total : "+ total[z]);
            System.out.println();
    }
}}
