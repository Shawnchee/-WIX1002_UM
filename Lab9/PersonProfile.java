/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l9;

/**
 *
 * @author aykay
 */
public class PersonProfile {
    private final String name, gender , DOB ;
    
    public PersonProfile(String name , String gender , String DOB){
        this.name = name ;
        this.gender = gender ; 
        this.DOB = DOB ; 
    }
    public void display(){
        System.out.printf("Name: %s | Gender: %s | DOB: %s|\n", name , gender, DOB);
    }
}
