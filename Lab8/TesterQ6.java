/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab8;

/**
 *
 * @author aykay
 */
public class TesterQ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Burger a = new Burger("001", 50);
        Burger b = new Burger("002" , 100);
        Burger c = new Burger("003" , 150);
        a.sold(30);
        b.sold(30);
        c.sold(30);
        System.out.println("The total number of burger sold in stall "+ a.GetID() +" is " + a.number);
        System.out.println("The total number of burger sold in stall "+ b.GetID() +" is " + b.number);
        System.out.println("The total number of burger sold in stall "+ c.GetID() +" is " + c.number);
        System.out.println("----------------------------------------------------");
        System.out.println("The total number of burger sold in all stall is " + Burger.GetTotal());

        
    }
}
