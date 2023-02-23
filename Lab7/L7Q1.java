    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l7;

/**
 *
 * @author aykay
 */
import java.util.Scanner ; 
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class L7Q1 {

   
    
    public static void main(String args[]) {
          Scanner scanner = new Scanner (System.in);
       try {
           ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
           output.writeUTF("Programming I");
           output.writeUTF("Data Structure");
           output.writeUTF("Operating System");
           output.writeUTF("Computing Mathematics I");

            output.close();
       } catch (IOException e) {}
       
    

     try{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("coursename.dat"));
        System.out.println("Enter the course code: ");
        String course = scanner.next();
        String a = input.readUTF();
         String b = input.readUTF();
          String c = input.readUTF();
           String d = input.readUTF();
           
           if (course.equals("WXES1116")){
               System.out.println(a);
           }
           else if (course.equals("WXES1115")){
               System.out.println(b);}
               else if (course.equals("WXES1110")){
               System.out.println(c);}
               else if (course.equals("WXES1112")){
               System.out.println(d);}
           
      
     }
     catch (FileNotFoundException e ){}
     catch (IOException e ){}
}
}
