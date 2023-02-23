/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l9;

/**
 *
 * @author aykay
 */
public class TesterL9Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Rectangle r  = new Rectangle();
        Square s1 = new Square();
        Circle c = new Circle();
       r.input();
       r.calculation();
       r.display("Rectangle");
       System.out.println("");
       s1.input();
       s1.calculation();
       s1.display("Square");
        System.out.println("");
        c.input();
        c.calculation();
        c.display("Circle");
        

        
    }
}
