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
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x , y, radius  ;
        System.out.println("Enter radius= ");
        radius = sc.nextInt();
        while (radius<=0){ 
            System.out.println("Please enter a positive radius");  
            radius = sc.nextInt( );
            if (radius >0)
            break ; }
        if (radius > 0 ){
        System.out.println("Enter x-coordinate: ");
        x = sc.nextInt();
        System.out.println("Enter y-coordinate: ");
        y = sc.nextInt();
        System.out.println("Your coordinate is : ("+x+","+y+")");
        
        if ((x>=0 && x <= radius) || (x<0 && x>=(-radius))){
            if ((y >=0 && y<=radius) || (y<0 && y>=(-radius))){
            System.out.println("The point is inside the circle.");}
            else if (y >=0 && y > radius || y<0 && y< (-radius))
            System.out.println("The point is outside the circle");}
            
        
        else if ((x>=0 && x > radius) || (x<0 && x<(-radius))){
            if ((y >=0 && y>radius) || (y<0 && y<(-radius))){
            System.out.println("The point is outside the circle.");}
            else if (y>=0 && y<=radius || y<0 && y>(-radius))
            System.out.println("The point is inside the circle");
        }
        }
        
        
            
            

        
        
        // TODO code application logic here
    }
}
