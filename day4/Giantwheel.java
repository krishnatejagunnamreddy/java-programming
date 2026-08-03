package day4;

import java.util.Scanner;

public class Giantwheel {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        for (int cabin =5 ; cabin>1 ; cabin--){
            System.out.println("new cabin has arrived");
            for(int person = 0;person<4;){
                System.out.println("let us know age");
                int age = scan.nextInt();
                // person = (age>=18&&age<=60)?person+1:person;
                if(age>=18&&age<=60){
                    person++;
                    System.out.println("enjoy the ride");
                }
                else{
                    System.out.println("your safety is prior than ride");
                }
            }
        
        }
        scan.close();
        
    }
}
