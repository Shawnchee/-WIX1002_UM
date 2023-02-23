/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l6;


 
public class L6Q6 {

   
    public static void main(String args[]) {
       int count1 = 0 ;
       int count2 = 0;
        System.out.println("First 20 palindromic prime are ");
        for (int i = 0 ; count1 <20 ; i++){
            if (Palindromic(i)){
                System.out.print(i+"\t");
            count1 ++ ; }
        }
        System.out.println("");
        System.out.println("First 20 emirp number are: ");
        for (int j = 0 ; count2 < 20 ; j++){
            if (Emirp(j)){
                System.out.print(j+"\t");
            count2 ++;}
        }
    }
    static boolean Palindromic (int x){
        int temp ;
        int count = 0 ;
        int remainder ; 
        int sum = 0 ;
        int reversed ; 
   
        for (int i =1; i <= x ; i ++){
            if (x % i ==0)
                count ++ ;
        }   
               temp = x ;
        while (x>0){
            remainder = x %10 ;
            sum = sum*10 + remainder ; 
            x = x/10 ; 
            
            
        }
        reversed = sum ; 
        if (temp == reversed && count==2)
            return true ;
        
        else 
            return false ;
        
    }
    
    static boolean Emirp (int y){
        int temp1 ;
        int temp2;
        int reversedcount = 0 ;
        int count = 0 ;
        int remainder ; 
        int sum = 0 ;
        int reversed ; 
        for (int i =1; i <= y ; i ++){
            if (y % i ==0)
                 count ++ ;
        }
        temp1 = y; 
        while (y>0){
            remainder = y %10 ;
            sum = sum*10 + remainder ; 
            y = y/10 ; 
            
        }
       
        reversed = sum ; 
        for (int i = 1 ; i <= reversed ; i++){
            if (reversed % i ==0)
                reversedcount ++ ; 
        }
        if (temp1 != reversed && count==2 && reversedcount == 2)
            return true ;
        else 
            return false ;
    }
}
