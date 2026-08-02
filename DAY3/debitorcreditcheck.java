package DAY3;
import java.util.Scanner;

public class debitorcreditcheck {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int balance = 0 ,limit = 0,prev=0;
        int debit_count = 0;
        System.out.println("lets  know how many transcation done");
        limit = scan.nextInt();
        while(limit>0){
            System.out.println("enter the balance after transcation :");
            balance = scan.nextInt();
            // prev = Math.max(prev, number);
            if(prev<balance){
                debit_count++;
                prev=balance;
            }
            else{
                prev=balance;
            }
            limit--;
        }
        System.out.println("curent balance "+(debit_count>3?(balance-25*(debit_count-3)):balance));
    scan.close();
    }
}

