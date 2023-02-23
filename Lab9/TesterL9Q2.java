/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l9;

/**
 *
 * @author aykay
 */
public class TesterL9Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Student s = new Student ("Shawn" , "Male" , "29/05/2003" , "C:/Users/aykay/Desktop/IDE/File/course.txt");
        System.out.println("Student's profile:");
        s.studentProfile();
        Lecturer l = new Lecturer ("Mr Chee" , "Male" , "12/04/1961" );
        System.out.println("");
        System.out.println("Lecturer's Profile:");
        l.LectureProfile();
    }
}
