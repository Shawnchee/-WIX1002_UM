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
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        float a,b,c,d,e,f,x,y;
        System.out.println ("Based on equation,");
        System.out.println("Enter value a: ");    
        a = sc.nextFloat();
        System.out.println("Enter value b: ");  
        b = sc.nextFloat();
        System.out.println("Enter value c: ");  
        c = sc.nextFloat();
        System.out.println("Enter value d: ");  
        d = sc.nextFloat();
        System.out.println("Enter value e: ");  
        e = sc.nextFloat();
        System.out.println("Enter value f: ");  
        f = sc.nextFloat();
        x = (e*d-b*f)/(a*d/b*c);
        y = (a*f-e*c)/(a*d/b*c);
        
        boolean zero = (a*d-b*c==0);
        if (zero)
            System.out.println("The equation has no solution.");
        else 
            System.out.println("x: "+ x + "\ny: "+y);
        // TODO code application logic here;
                
    }
}
