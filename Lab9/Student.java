/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l9;

import java.util.Scanner;
import java.io.* ; 

/**
 *
 * @author aykay
 */
public class Student extends PersonProfile {
    String [] course  = new String [5];
    String [] code  = new String [5];
    int [] semester  = new int [5];
    int [] session  = new int [5];
    int [] mark  = new int [5];
    String file ; 
    
    public Student ( String name, String gender , String DOB, String file) {
        super(name, gender , DOB);
        this.file = file ;
        
        try {
             Scanner input = new Scanner (new FileInputStream(this.file));
             for (int i =  0 ;  input.hasNextLine() ; i++){
                     code [i] = input.nextLine() ;
                     course [i] = input.nextLine();
                     semester [i] = input.nextInt();
                     session [i] = input.nextInt();
                     mark[i] = input.nextInt();
                      if(input.hasNextLine()){
                        input.nextLine();
                    
                }

                }
          
             
             input.close();
             

             
        }
        catch (FileNotFoundException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public String getGrade(int mark){
        if (mark >= 85)
            return "A";
        else if (mark >=75)
            return "A-";
         else if (mark >=70)
            return "B+";
         else if (mark >=65)
            return "B";
         else if (mark >=60)
            return "B-";
         else if (mark >=55)
            return "C+";
         else if (mark >=50)
            return "C";
         else if (mark >=45)
            return "D";
         else if (mark >=35)
            return "E";
         else 
             return "F";
        
    }
    public void studentProfile (){ 
        super.display();
        System.out.println("+-------------------------------------------------------------------+");
        for (int i = 0 ; i <5 ; i++ ){
        System.out.printf("Course code: %s\nCourse name: %s\nSemester: %d\nSession: %d\nMark: %d\nGrade: %s\n" , code[i], course[i] , semester[i] ,session [i] , mark[i] ,getGrade(mark[i]) );
            System.out.println("-------------------------------------------------------------------------");
    }
}
}

