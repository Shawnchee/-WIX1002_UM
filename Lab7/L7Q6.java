/*
product.txt
SK020,Enfagrow A+,36,79
SK042,Ayamas Nuget Crispy,9.99
SK013,100 Plus,6.49
SK066,Ali Cafe,8.99
SK079,Dettol Natural,4.99
SK088,Jasmine Pearl,37.99
SK023,Johnson PH 5.5,5.99


order.txt
ORD001,SK079,20
ORD002,SK013,74
ORD003,SK088,27
ORD004,SK042,60
ORD005,SK066,79
 */
package l7;

import java.util.*;
import java.io.*;
public class L7Q6 {

    
    public static void main(String args[]) throws FileNotFoundException, IOException {
        Scanner input1 = new Scanner (new FileInputStream("/C://Users//aykay//Desktop//IDE//File//product.txt/"));
        Scanner input2 = new Scanner (new FileInputStream("/C://Users//aykay//Desktop//IDE//File//order.txt/"));
       String a = "ProductID";
       String b = "ProductName"; 
       String c = "Quantity";
       String d = "PricePerUnit";
       String e = "Total";
       String [] productID = new String [7];
        String [] productID2 = new String [5]; 
        String [] productName = new String [7];
        int [] orderQuantity = new int [5];
        double [] price = new double [7];
        int x = 0 ;
        while (input1.hasNextLine()){
            
           String line1 = input1.nextLine();
            String [] product  = line1.split(",");
            productID [x] = product [0] ;
            productName [x] = product [1];
            price [x] =Double.parseDouble(product[2]);
            x++ ;
        }
        input1.close();
        int y = 0 ; 
         while (input2.hasNextLine()){
             String line2 = input2.nextLine();
             String [] order = line2.split(",");
             productID2 [y] = order[1];
             orderQuantity [y] = Integer.parseInt(order[2]);
             y++;
         }
         input2.close();
         PrintWriter output = new PrintWriter (new FileOutputStream("C://Users//aykay//Desktop//IDE//File//Q7.txt/"));
         output.printf("%-28s%-30s%-13s%-29s%-15s\n" , a,b,c,d,e);
         for (int i = 0 ; i<5 ; i++){
             for(int j = 0 ; j <7 ; j++){
                 if (productID2[i].equalsIgnoreCase(productID[j])){
                     double total = price [j] * orderQuantity [i] ;
                     output.printf("%-12s\t%-31s\t%-15d%-30.2f%-5.2f\n" , productID2[i], productName[j] , 
                             orderQuantity[i], price[j], total);
                 }
             }
     
             
         }
         output.close();
    }
}
                    
  
