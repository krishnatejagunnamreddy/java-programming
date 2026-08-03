package day4;

import java.util.Scanner;

public class Twistedprime {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
       int number = 0 , reversed =0,duplicate =0 ;
        System.out.println("Enter the number");
        number = get.nextInt();
        get.close();
        duplicate = number ;
        // if(number==2||number==3||number==5||number==7||number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0){
        //     System.out.println(number+" is prime");
        // }
        for(int div=2;div<number;div++){
            if(number%div==0){
                System.out.println(number+" is not prime");
                return ;}}
                while(duplicate!=0){
                    reversed = reversed*10 + duplicate%10;
                    duplicate/=10;
                    }
                for(int num=2;num<reversed;num++){
                    if(reversed%num==0){                           
                            System.out.println(number+" is not twisted prime");
                            return ;
                }
            }
        System.out.println(number+" is twisted prime");
    }
}

