/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author aykay
 */
public class Burger {
    String ID ;
    int number ;
    static int total = 0 ;

    public Burger (String ID , int number) {
     this.ID = ID ; 
     this.number = number ;
     
 
}
    public void sold (int a){
    number = number+ a ;
    track(number) ;  
} 
    
    private int track(int x){
        total = total + x ;
        return total ; 
    }
    
    public String GetID(){
            return this.ID ; 
    }
    
    public static int GetTotal(){
        return  total ; 
    }
    
}
