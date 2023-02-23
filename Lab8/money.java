/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author aykay
 */
public class money {
   double amount ; 
   double initialRounded ;
    int RM100;
    int RM50;
    int RM10;
    int RM5;
    int RM1; 
    int cent50; 
    int cent20; 
    int cent10;
    int cent5;
    double remainder ; 
    double roundedRemainder ; 
    
    public money (double amount){
        
        double x =(amount*100)%10;
        if (x == 1 || x ==2){
            roundedRemainder = 0 ;
        }
        else if (x  >=3 &&  x <= 7 ){
            roundedRemainder = 5 ;
        }
        else if (x == 8 || x == 9) {
            roundedRemainder = 10 ;
        }
        this.amount = amount - (x/100)+ (roundedRemainder/100);
        initialRounded = this.amount ; 
        System.out.printf("Rounded off amount: %.2f\n",this.amount);
        this.amount =Math.round(this.amount*100.0)/100.0;
    }

        public void Number (){
        while(amount >=100){
            amount = amount - 100 ; 
            RM100++ ;
        }
        amount =Math.round(amount*100.0)/100.0;
       while (amount >=50 ){
            amount  = amount - 50 ; 
            RM50 ++ ;
        }
       amount =Math.round(amount*100.0)/100.0;
        while(amount >=10){
            amount  = amount -10;
            RM10 ++ ; 
        }
        amount =Math.round(amount*100.0)/100.0;
         while(amount >=5 ){
            amount  = amount - 5 ;
            RM5 ++ ;
         }
         amount =Math.round(amount*100.0)/100.0;
        while(amount >=1){
            amount  = amount - 1 ;
            RM1 ++ ;
         }
        amount =Math.round(amount*100.0)/100.0;
         while (amount >= 0.50 ){
             amount = amount - 0.50 ; 
             cent50 ++ ;
         }
         amount =Math.round(amount*100.0)/100.0;
        while (amount >= 0.20 ){
             amount = amount - 0.20 ; 
             cent20 ++ ;
         }
        amount =Math.round(amount*100.0)/100.0;
        while(amount >= 0.10){
             amount = amount - 0.10 ; 
             cent10 ++ ;
         }
         amount =Math.round(amount*100.0)/100.0;
         while (amount >=0.05 ){
             amount = amount - 0.05 ; 
             cent5 ++ ;
         }  

    
          System.out.println("Number of RM100 notes: " + RM100);
          System.out.println("Number of RM50 notes: " + RM50);
          System.out.println("Number of RM10 notes: " + RM10);
          System.out.println("Number of RM5 notes: " + RM5);
          System.out.println("Number of RM1 notes: " + RM1);
          System.out.println("Number of 50 cent: " + cent50);
          System.out.println("Number of 20 cent: " + cent20);
          System.out.println("Number of 10 cent: " + cent10);
          System.out.println("Number of 5 cent: " + cent5);
    }
    public void  Addition (double money1, double money2){
        double sum = money1 + money2 ;
        System.out.printf("The sum of the two amounts are: %.2f\n" , sum);
    }
     public void  Subtraction (double money1, double money2){
        double difference = money1 - money2 ;
        System.out.printf("The difference of the two amounts are: %.2f\n" ,difference);
}
}



