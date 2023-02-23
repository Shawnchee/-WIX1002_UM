/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l4q1;

/**
 *ma
 * @author aykay
 *
*/
import java.util.Scanner ; 
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double M,P,i,N,C,L,R, totalinterest=0 ; 
        System.out.println("Enter principal amount: ");
        P = scanner.nextDouble();
        System.out.println("Enter interest in %: ");
        i = scanner.nextDouble();
        System.out.println("Enter total number of month(s): ");
        N = scanner.nextDouble();
        String month = "Month";
        String monthlypayment = "Monthly Payment";
        String principal = "Principal";
        String interest = "Interest";
        String unpaid = "Unpaid Balance";
        String total = "Total Interest";
        
        
        
        System.out.printf ("%-15s%-20s%-15s%-15s%-20s%-15s\n",month,monthlypayment,principal,interest,unpaid,total);
        for (int n = 1 ; n <= N; n ++){


        M = (P*(i/(12*100)))/(1-(Math.pow((1+i/(12*100)),-N)));
        C = M*(Math.pow(1+(i/(12*100)), -(1+N-n)));
        L = M-C ;
        totalinterest = totalinterest + L;
        R = L/ (i/(12*100))-C ;
        System.out.printf ("%-23d%-15.2f%-15.2f%-18.2f%-23.2f%-15.2f\n",n,M,C,L,R,totalinterest);

            
        }
        

        // TODO code application logic here        System.out.println(22%1);

    }
}
