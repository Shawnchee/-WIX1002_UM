/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l9;

import java.util.Scanner;

/**
 *
 * @author aykay
 */
public class Rectangle extends Shape {
   private double length, width ;
    
    public void input(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the width of rectangle: ");
        width = scanner.nextDouble();
        System.out.println("Enter the length of rectangle: ");
        length = scanner.nextDouble();
    }
    public void calculation (){
        super.setPerimeter(2*(width+length));
        super.setArea(width*length);
        
}   
}
