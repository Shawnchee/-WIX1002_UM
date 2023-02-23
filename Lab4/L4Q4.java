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
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int year;
        int offSetDay = 0;
        int May = 0;
        System.out.print("Enter the year: ");
        year = scanner.nextInt();

        System.out.print("Enter the first day of the year (0 = Sunday, 1 = Monday, ... 6 = Saturday) :");
        day = scanner.nextInt();

        if((year%4==0 && !(year%100==0)) || year%400==0) {
            May = day + 2;
            May = May % 7;
        }
        else{
          May = day + 1;
            May = May & 7;
        }

        for(int offSet = 0; offSet<May; offSet++){
            System.out.print("\t");
        }

        offSetDay = May + 1;
        for(int i = 1; i<=31;i++){
            System.out.print(i +"\t");
            if(offSetDay%7 == 0) System.out.println("");

            offSetDay++;
        }

        System.out.println("\n\n\n");

        int dayOfAugust = May+1;
        offSetDay = 0;
        for(int offSet = 0; offSet<dayOfAugust; offSet++){
            System.out.print("\t");
        }

        offSetDay = dayOfAugust + 1;
        for(int i = 1; i<=31;i++){
            System.out.print(i +"\t");
              offSetDay++;
            if(offSetDay%7 == 0) System.out.println("");

           
        }
    }
}
        // TODO code application logic here
 