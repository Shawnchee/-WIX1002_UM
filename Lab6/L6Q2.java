/*Write a Java method multiPrint(int n, char c) that prints n copies of character c. Then,
write a Java program to use the method to display the triangles and diamonds.*/

package l6;

/**
 *
 * @author aykay
 */
public class L6Q2 {

    
    public static void main(String args[]) {
     multiPrint(4,' ');
     multiPrint(1,'x');
     System.out.println();
     multiPrint(3,' ');
     multiPrint(3,'x');  
     System.out.println();
     multiPrint(2,' ');
     multiPrint(5,'x');
     System.out.println();
     multiPrint(1,' ');
     multiPrint(7,'x');
     System.out.println();
     multiPrint(9,'x');
     System.out.println("\n");

     multiPrint(4,' ');
     multiPrint(1,'x');
     System.out.println();
     multiPrint(3,' ');
     multiPrint(3,'x');  
     System.out.println();
     multiPrint(2,' ');
     multiPrint(5,'x');
     System.out.println();
     multiPrint(1,' ');
     multiPrint(7,'x');
     System.out.println();
     multiPrint(9,'x');
     System.out.println();
     
     
     multiPrint(9,'x');
     System.out.println();
     multiPrint(1,' ');
     multiPrint(7,'x');  
     System.out.println();
     multiPrint(2,' ');
     multiPrint(5,'x');
     System.out.println();
     multiPrint(3,' ');
     multiPrint(3,'x');
     System.out.println();
     multiPrint(4,' ');
     multiPrint(1,'x');
     System.out.println();
    }
    static void multiPrint (int n, char c){
        for (int i =1 ; i <=n ; i ++){
            System.out.print(c);
    }
}
}