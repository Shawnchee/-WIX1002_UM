/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l9;

/**
 *
 * @author aykay
 */
public class Shape {
    private String name ; 
    private double perimeter , area ; 
    
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter ;
    }
     public void setArea(double area) {
        this.area = area ;
}
     public double getPerimeter (){
         return this.perimeter ;
     }
      public double getArea (){
         return this.area ;
}
      public void display (String name){
          System.out.println("The name of this shape is: " + name);
          System.out.printf("The perimeter of this shape is: %.2f\n" , getPerimeter() );
          System.out.printf("The area of this shape is: %.2f\n" , getArea() );

          
      }
}
