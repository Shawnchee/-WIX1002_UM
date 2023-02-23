/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author aykay
 */
import java.util.Scanner ; 
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double P, D, R, Y, M ;
        System.out.println("Enter car price, down payment, interest rate(%), "
                + "loan duration (year)");
        P = sc.nextDouble();
        D = sc.nextDouble();       
        R = sc.nextDouble();
        Y = sc.nextDouble();
        
        M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.format("Monthly payment: %.2f" ,M);
        
              

        // TODO code application logic here
    }
}
