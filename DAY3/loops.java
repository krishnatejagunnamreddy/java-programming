package DAY3;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0 ,limit = 0 ,prev = Integer.MIN_VALUE;
        int prev1 = Integer.MIN_VALUE;
        System.out.println("Let us know the limit");
        limit = scan.nextInt();
        while(limit>0){
            System.out.println("enter the number:");
            number = scan.nextInt();
            // prev = Math.max(prev, number);
            if(prev<number){
                prev1=prev;
                prev=number;
            }
            if(prev1<number&&number>prev){
                prev1=number;
            }
            limit--;
        }
    System.out.println(prev+" is the largest number " );  
    System.out.println(prev1+" is the second largest number");
    scan.close();
    }

}
