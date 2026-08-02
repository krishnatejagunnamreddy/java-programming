package DAY3;

import java.util.Scanner;

public class checkOddorEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("enter the number ");
        num = scan.nextInt();
        //find odd or even using bitwise operator & 1
        if((num&1)==0)System.out.println("Even");
        else System.out.println("Odd");
        //postive into negative or negative to postive
        int result = ~num + 1;
        System.out.println(result);
        scan.close();
    }
    }
