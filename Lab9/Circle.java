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
public class Circle extends Shape {
    private double diameter ; 
    
     public void input(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the diameter of circle: ");
        diameter = scanner.nextDouble();

    }
    public void calculation (){
        super.setPerimeter(Math.PI * diameter ); 
        super.setArea(Math.PI * (diameter/2));
        
        
        
       
    }
}
