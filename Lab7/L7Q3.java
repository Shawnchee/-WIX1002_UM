/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l7;

/**
 *
 * @author aykay
 */
import java.util.* ;
import java.io.*;
public class L7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner (new FileInputStream("C:/Users/aykay/Desktop/IDE/File/original.txt"));
          try {
              PrintWriter output = new PrintWriter (new FileOutputStream("reverse.txt"));
          
            while (input.hasNextLine()){
                String line = input.nextLine(); 
                for (int i = line.length() - 1 ; i >=0 ; i --){
                    
                    
                    
                    output.print(line.charAt(i));

                }
                output.println("");
            }
            
            
            input.close();
            output.close();
          }
          catch (IOException e) {}
        }
        catch (FileNotFoundException e) {}
    }
    
}
