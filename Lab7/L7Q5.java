/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l7;

/**
 *
 * @author aykay
 */
import java.io.*;
public class L7Q5 {


    public static void main(String args[]) throws IOException, EOFException  {
        ObjectInputStream input = new ObjectInputStream (new FileInputStream("/C://Users//aykay//Desktop//IDE//File//person.dat/"));
        int total = input.readInt();
        System.out.println("Total: " +total);
      String [] name = new String [total] ; 
      int [] age = new int [total] ;
      char [ ] gender = new char [total];
      int tempint;
      char tempchar;
      String tempname;
       try
       {
           while (true){
               for (int i = 0 ; i < total ; i ++){
                   
             
                name [i] = input.readUTF(); 
                   age [i] = input.readInt();
                   gender [i] = input.readChar();         
                
               }
                for (int i = 0 ; i < total ; i ++){
                   for(int j = i+1 ; j<total ; j++){   
            if(name[i].compareTo(name[j])>0){
               tempname = name [i];
               name [i] = name[j];
               name [j] = tempname;
               tempint = age [ i];
               age [i] = age[j];
               age [j] = tempint;
               
               tempchar = gender[i];
               gender [i] = gender[j];
               gender [j] = tempchar ;
                         }
                   }
             
                 System.out.print(name[i] + "\t");
                 System.out.print(age[i] + "\t");
                 System.out.println(gender[i] + "\t"); 
                }
           }        
       }catch (EOFException e){}
        
       input.close();
       
    }
}
       
        
      
     
        
           
         

         
 