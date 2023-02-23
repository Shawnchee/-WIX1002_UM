/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author aykay
 */

public class WeightCalculator {
    int age ; 
    double height , recommendWeight ;
    
    public void inputDetails () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        this.age = scanner.nextInt();
        System.out.println("Enter your height (cm): ");
        this.height = scanner.nextDouble();
    }
    public void recommendWeight (){
        this.recommendWeight = ((this.height - 100 + this.age/10)  *0.9 ) ;     
    }
        public void details () {
            System.out.println("+-----------------------------------------+");
            System.out.println("Your age is: " + this.age);
            System.out.println("Your height is " + this.height + " cm");
            System.out.println("Your recommended weight is: "+ this.recommendWeight + "kg");
        }
    
}
