/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l3q1;

/**
 *
 * @author aykay
 */
import java.util.Scanner;
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        double salesVolume , commission , commissionSales ;
        System.out.print("Enter sales volume:  ");
        salesVolume = sc.nextDouble();
        if (salesVolume<=100){
            commission = 0.05 ; 
            commissionSales = salesVolume * commission ;
        System.out.printf("The commission: %.2f\n" , commissionSales);}
        
        else if (salesVolume <=500){
            commission = 0.075 ; 
            commissionSales = salesVolume * commission ;
        System.out.printf("The commission: %.2f\n" , commissionSales);}
        
        else if (salesVolume <=1000){
            commission = 0.1; 
            commissionSales = salesVolume * commission ;
        System.out.printf("The commission: %.2f\n" , commissionSales);}
        
        else if (salesVolume>1000){
            commission = 0.125 ; 
            commissionSales = salesVolume * commission ;
        System.out.printf("The commission: %.2f\n" , commissionSales);}
       
    }
}
        
            
            
            
        
        
        
        // TODO code application logic here
  