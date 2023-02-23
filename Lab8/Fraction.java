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
public class Fraction {
    Scanner scanner = new Scanner(System.in);
    int numerator, denominator ; 
    
 
public void input(){
System.out.println("Enter numerator: ");
 setNumerator(scanner.nextInt());
 System.out.println("Enter denominator: ");
 setDenominator(scanner.nextInt());
}
public void setNumerator(int numerator){
    this.numerator = numerator ;
}

public void setDenominator(int denominator){
    this.denominator = denominator ;
}

public int getNumerator(){
    return this.numerator;
}

public int getDenominator(){
    return this.denominator;
}
 public void GCD (int numerator , int denominator){ 
     int temp ;
     while (denominator!= 0){
         temp = denominator ; 
         denominator = numerator % denominator ; 
         numerator = temp ; 
 }
     int GCD = numerator ;
     System.out.println("The fraction: " +getNumerator() +"/" +getDenominator());
     System.out.println("The fraction reduced to lowest terms is: " + (getNumerator()/GCD) +"/" +(getDenominator()/GCD) );

}
}
