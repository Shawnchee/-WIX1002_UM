/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l7;

/**
 *
 * @author aykay
 */

import java.io.* ;
public class L7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     try{
          BufferedReader input = new BufferedReader (new FileReader("/C://Users//aykay//Desktop//IDE//File//counter.txt/")) ;
             String line ;
             int character = 0 ;
             int words=0 ;
             int numberlines =0 ;
             while ((line = input.readLine()) != null ){
                 character = character + line.length() ;
                 String [] sentence =  line.split(" ") ;
                 words=words  + sentence.length ;
                 numberlines ++ ;
             }
             input.close();
                 try {
                     PrintWriter output = new PrintWriter (new FileOutputStream("counterresult"));
                     output.println("Number of characters= " +character);
                     output.println("Number of words= " +words);
                     output.println("Number of lines= " +numberlines);
                     output.close();
                 }
                catch (FileNotFoundException e) {}
         }
     
      catch (FileNotFoundException e) {}
     catch (IOException e) {}
    
    }
}
