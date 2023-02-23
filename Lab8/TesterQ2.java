/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author aykay
 */
public class TesterQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner =  new Scanner (System.in);
        String name, ICPassport ;
        Double  Deposit ;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your IC or Passport number: ");
        ICPassport = scanner.nextLine();
        System.out.println("Deposit to open account: RM");
       Deposit = scanner.nextDouble();
       BankAccount a = new BankAccount(name , ICPassport , Deposit);
       a.Details();
        
    }
}
