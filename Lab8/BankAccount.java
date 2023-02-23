/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author aykay
 */
import java.util.Scanner ;
public class BankAccount {
    Scanner scanner =  new Scanner (System.in);
    String name, ICPassport ; 
    double currentBalance =0, Deposit, Withdraw ; 
    
    public BankAccount(String name , String ICPassport , double Deposit){
        this.name = name ; 
        this.ICPassport = ICPassport ; 
        this.Deposit = Deposit ;
        currentBalance = currentBalance + Deposit ;
        System.out.println("Enter the amount to deposit: ");
        Deposit(scanner.nextDouble());
        System.out.println("Enter the amount to withdraw: ");
        double currentBalance =  Withdraw(scanner.nextDouble());
    }
         public  double Deposit (double a){
             System.out.println("You have deposited RM" + a );
             return currentBalance = currentBalance + a ;
         }
         public double Withdraw (double b){
        System.out.println("You have withdrawn RM"+b);
          return  currentBalance = currentBalance - b ;     
}
         public void Details (){
             System.out.println("+------------------------------------------------------+");
             System.out.println("Your Bank Name is: " + this.name);
             System.out.println("Your IC/Passport Number is: " + this.ICPassport);
             System.out.println("Your Initial Deposit Amount is: " + this.Deposit);
             System.out.println("Your Current Balance is: " + this.currentBalance );
         }
         
}
             
         
            
       
        




