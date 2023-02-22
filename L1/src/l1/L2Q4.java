/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author aykay
 */
import java.util.Scanner ;
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int TotalSeconds , seconds, hours , minutes ;
        System.out.println ("Enter the number of seconds: ");
        TotalSeconds = sc.nextInt();
        seconds = TotalSeconds%60 ;
        hours = TotalSeconds/60;
        minutes = hours%60;
        hours = hours/60 ; 
        
        System.out.format("%d seconds is %d hours, %d minutes and %d seconds",TotalSeconds,hours,minutes,seconds);
        
        
        /* int hour = total / 3600 ;
        int minute (total %3600) /60 ;
        int second = total %60 ;
        end 
        */
        
        
        // TODO code application logic here
    }
}
