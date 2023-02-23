
package lab8;

import java.util.Random; 
public class Number  {
    
    public Number() {
    Random random = new Random ();
    int [] numberA = new int [10];
        System.out.println("The generated numbers are: ");
    for (int i = 0 ; i <10 ; i++){
        numberA[ i] = random.nextInt(101);
        System.out.print (numberA[i]+"  ");
    }
        System.out.println("");
    Even(numberA);
    Prime(numberA);
    Max (numberA);
    Min (numberA);
    Average (numberA);
    PerfectSquare(numberA);
    
        System.out.println("-----------------------------------------------------------");
    
        
    }
    public Number(int b){
          Random random = new Random ();
          int [] numberB = new int [b];
          System.out.println("The generated numbers are: ");
             for (int i = 0 ; i <b ; i++){
                 numberB[ i] = random.nextInt(101);
                 System.out.print (numberB[i]+"  ");
        
    }
             System.out.println("");
              Even(numberB);
              Prime(numberB);
              Max (numberB);
              Min (numberB);
              Average (numberB);
              PerfectSquare(numberB);
    
        System.out.println("-----------------------------------------------------------");
    
    }

    public Number (int c,int  x){
         Random random = new Random ();
          int [] numberC = new int [c];
          System.out.println("The generated numbers are: ");
             for (int i = 0 ; i <c ; i++){
                 numberC[ i] = random.nextInt(x+1);
                 System.out.print (numberC[i]+"  ");
        
    }
             System.out.println("");
              Even(numberC);
              Prime(numberC);
              Max (numberC);
              Min (numberC);
              Average (numberC);
              PerfectSquare(numberC);
    
        System.out.println("-----------------------------------------------------------");
    }
    
    static void Even (int [ ] a) {
        System.out.print("The even numbers are:\n");
        for (int i  = 0 ; i < a.length ; i++){
            if (a[i] %2 ==0) {
                System.out.print(a[i] + "  " );
                
            }
            
        }
        System.out.println("");
       
      
    }
     static void Prime (int [ ] a) {
        System.out.print("The prime numbers are:\n");
         
        for (int i  = 0 ; i < a.length ; i++){
            int count=0;
            for (int j = 1 ; j<= a[i] ; j++){
            if (a[i] % j ==0) {
                count ++ ;
            }
                
            }
            if(count==2)
                System.out.print(a[i] + " ");
            
            }
         System.out.println("");
     }
     static void Max (int [ ] a) {
         int max = 0 ;
         for ( int i = 0 ; i < a.length ; i++){
             if (a[i] > max)
                 max = a[i];
         }
         System.out.println("Maximum number:\n" + max);
        
     }
     static void Min (int [ ] a) {
         int min = 100 ;
         for ( int i = 0 ; i < a.length ; i++){
             if (a[i] < min)
                 min = a[i];
         }
         System.out.println("Minimum number:\n" + min);
      
     }
     static void  Average (int [ ]a) {
         int sum = 0 ;
         for (int i = 0 ; i <a.length ; i ++){
             sum = sum + a[i];

         }
         double average = (double)sum / a.length ;
         System.out.println("Average:\n" + average);
      
     }
     static void PerfectSquare (int [ ] a){
         System.out.print("The perfect square number are:\n");
         for (int i = 0 ; i <a.length ; i++){
             for (int j = 1 ; j<=100 ; j++){
            if ( Math.sqrt(a[i]) == j)
                     System.out.print(a[i] + "  ");
         }
             
     }
         System.out.println("");
     }
}

  
