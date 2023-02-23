/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab8;

/**
 *
 * @author aykay
 */
public class TesterQ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Number of note and coins: \n");
        money m = new money(50.39);
        m.Number();
        System.out.println("-------------------------------------");
        System.out.println("Number of note and coins: \n");
        money m1 = new money (10.23);
        m1.Number();
        m1.Addition(m.initialRounded, m1.initialRounded);
        m.Subtraction(m.initialRounded, m1.initialRounded);

    }
}
