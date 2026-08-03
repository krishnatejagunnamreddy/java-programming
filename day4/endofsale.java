package day4;

import java.util.Scanner;

public class endofsale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double time = 21.00 ;
        int required = 0 , payable = 0 , invoice = 0 , amount = 50000 , stock = 20 ,total_paid=0 , ac_sold=0;
         while(required<=stock&&time<21.30){
            System.out.println("enter the required number of AC");
            required = scan.nextInt();
            System.out.println("Let us know amount ");
            payable = scan.nextInt();
            if(payable>=(amount*required)){
                System.err.println("payment done and here is your order");
                invoice++;
                
                total_paid+=(amount*required);
                ac_sold+=required;
            }
            else{
                System.out.println("payment declined due to amount insufficent to buy "+required);
            }
           time+=0.01 ;
            }
        
        if(stock<=0){
            System.out.println("out of stock ");
        }
        if(time>21.30){
            System.out.println("sale has end ");}
         System.out.println("total invoice has happend is "+invoice);
         System.out.println("total amount has recived is "+total_paid);
         System.out.println("Remaining stock "+(stock-ac_sold));
         scan.close();
    }
}
