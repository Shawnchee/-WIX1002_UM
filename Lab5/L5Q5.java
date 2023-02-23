/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package l5;

/**
 *
 * @author aykay
 */
import java.util.Scanner ; 
import java.util.Arrays ;
public class L5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[20];
        int count = 0, first = 0, last = 0, middle = 0, num = 0;

        for(int z = 0; z<numbers.length; z++){
            numbers[z] = (int)(Math.random() * 101);
        }

        System.out.println("A list of 20 random integer within 0 to 100");
        System.out.println(Arrays.toString(numbers));

        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                if(numbers[j] > numbers[i]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Array in descending order");
        System.out.println(Arrays.toString(numbers));

        System.out.print("Enter a number to be search: ");
        num = scanner.nextInt();

        for(int i = 0; i < numbers.length; i++){
            
            if(numbers[i] == num){
                System.out.println(num + " found");
                System.out.println("Linear search - " + (count) + " loop(s)");
                break;
   
            }
            count++;
        }
int low = 0;
            int high = numbers.length - 1;
            int mid;
           int  c = 0;
            
            while (low <= high){
                mid = (low + high) / 2;
                if (num == numbers[mid]){
                    System.out.println(num + " found");
                    System.out.println("Binary Search - " + c + " loop(s)");
                    System.out.println("Number found at index : " + mid);
                    break;
                }
                else if (num  < numbers[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
                
                c++;
            }
                
        }
        }
    

      /*  first = 0;
        last = numbers.length-1;
        middle = (first + last)/2;
        count = 0;

        while(first<=last){
         count++ ;

            // Array order is descending, thus this will be greater
            // if is ascending, it will be smaller than
            if(numbers[middle] > num) {
                first = middle - 1;
            }

            else if(numbers[middle] == num) {
                System.out.println(num + " found ");
                System.out.println("Binary search - " + count + " loops(s)");
                System.out.println("number found at index: " + middle);
                break;
            }

            else{
                last = middle +1;
            }

            middle = (first+last)/2;
        }
       

    }
}
  
/*while (low<=high){
                   middle=(low+high)/2;
                   loop=loop+1;
                   if(search==num2[middle]){
                       System.out.println(search+" found");    
                       break;
                   }
                   else if(search<num2[middle])
                       low=middle+1;
                   
                   else
                       high=middle-1;
               }
               System.out.println("Binary seacrh -"+loop+" loop(s)");
    }
}
*/