/*
Write a program that generates 10 non-duplicate random integers within the range
from 0 to 20.
 */
package l5;

/**
 *
 * @author aykay
 */
import java.util.Random;
import java.util.Arrays ; 
public class L5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Random random = new Random();
        int [] number  = new int [10];
       boolean[] repeat = new boolean[21];

        for(int i = 0 ; i<10;i++) {
            int rand = random.nextInt(21);

            if(!repeat[rand]){
            repeat[rand]=true;}

            else {
                do{
                rand = random.nextInt(21);


                }while(repeat[rand]);

                repeat[rand] = true;
            }

            number[i] = rand;
        }

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
            
                }
    }

