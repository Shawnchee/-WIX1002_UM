/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aykay
 */
public class Lecturer extends PersonProfile {
    private String [] code = new String [4];
    private String [] course = new String [4];
    private int [] semester  = new int [4];
    private  int [] session  = new int [4];
    private double [] creditHour  = new double [4];
    private  int [] numStudents = new int [4];
    
    public Lecturer (String name ,String gender , String DOB ){
        super(name, gender, DOB);
        try {
            Scanner input = new Scanner (new FileInputStream("C:/Users/aykay/Desktop/IDE/File/lecturer.txt"));
            for (int i = 0 ; input.hasNextLine() ; i++){
                code [i] = input.nextLine();
                course [i] = input.nextLine();
                semester [i] = input.nextInt();
                session [i] = input.nextInt();
                creditHour[i] = input.nextDouble();
                numStudents [i] = input.nextInt();
                if (input.hasNextLine()){
                    input.nextLine();
                }
            }
            input.close();
        }
        catch (FileNotFoundException e ){
            System.out.println("Error: " + e.getMessage());
        }
        }
    public double getCredit (double creditHour,  int numStudents){
        if (numStudents >=150){
            return creditHour *3 ;
        }
        else if (numStudents >=100){
            return creditHour *2 ;
        }
        else if (numStudents >=50){
            return creditHour *1.5 ;
        }
        else 
            return creditHour ;
    }
    public void LectureProfile (){
        super.display();
        System.out.println("+-----------------------------------------------------------------+");
        for (int i=0  ; i < 4 ; i ++){
        System.out.printf("Course code: %s\nCourse name: %s\nSemester: %d\nSession: %d\nUpdated Credit Hour: %.1f\nNumber of Students: %d\n" ,code[i],course[i],semester[i],session[i],getCredit(creditHour[i], numStudents[i]),numStudents[i]);
            System.out.println("---------------------------------------------------------------------");
    }
}
}

