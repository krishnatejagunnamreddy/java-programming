package day4;

import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int limit = 0; //char alpha = 'Z';
        /*System.out.println("enter the name");
        limit = scan.nextInt();
         for(int row = limit;row>0;row--){
            for(int space =row;space<limit;space++){
                System.out.print(" ");
            }
            for(int column =1;column<(row*2);column++){
                System.out.print("*");
                //alpha--;
            }
            System.out.println();
        }        
         for(int row = 2;row<=limit;row++){
            for(int space = limit ;space>row ;space--){
                System.out.print(" ");
            }
            for(int column =1;column<(row*2);column++){
                System.out.print("*");
                //alpha--;
            }
            System.out.println();
        }*/
       System.out.println("enter the name");
       String name = scan.nextLine();
       limit = name.length();
       for(int row = limit/2;row>0;row--){
            for(int space =row;space<=limit/2;space++){
                System.out.print(" ");
            }
            for(int column =0;column<=(row*2);column++){
                System.out.print(name.charAt(column));
                //alpha--;
            }
            System.out.println();
        }        
         for(int row = 1;row<=limit/2;row++){
            for(int space = limit/2 ;space>row ;space--){
                System.out.print(" ");
            }
            for(int column =1;column<=row*2;column++){
                System.out.print(name.charAt(column));
                //alpha--;
            }
            System.out.println();
        }
        scan.close();
    }
}
