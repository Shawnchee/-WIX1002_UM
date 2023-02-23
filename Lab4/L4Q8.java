/*
Write a program that generates the first n prime number. n is an random integer
within 0 to 100
 */
package l4q1;

/**
 *
 * @author aykay
 */
import java.util.Random ; 
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int random_n = random.nextInt(101);
        System.out.println("n = " + random_n);
        int num;
        boolean prime;
        int count = 0, space =0;
         System.out.println("Prime number: ");
        for (num = 2;; num ++ ) {
            prime = true;
            for (int i = 1;; i++) {
                if (num%i == 0 && i != 1 && i!= num) {
                    prime = false;
                    break;
                }
                
                else if (i > num){
                    break;
                }
            }
            if (prime == true) {
                count ++;
                System.out.print(num +"\t");
                space ++;
                if(space%10==0)
                System.out.print("\n");
                
            }
            
            else if (count == random_n)
                break;


            }
    }
}
    

