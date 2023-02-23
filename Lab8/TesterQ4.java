/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab8;

/**
 *
 * @author aykay
 */
public class TesterQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Fraction f  = new Fraction();
       f.input();
       f.GCD(f.getNumerator(), f.getDenominator());
    }
}
