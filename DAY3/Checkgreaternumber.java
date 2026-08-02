package DAY3;
import java.util.Scanner;

public class Checkgreaternumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data1 = 0, data2 = 0 ;
        System.out.println("enter the data1 and data2");
        data1 = scan.nextInt();
        data2 = scan.nextInt();
        // System.out.println(Math.max(data1 , data2));
        // System.out.println((data1>data2)?data1:data2);
        int diff = data1-data2;
        int buffer = (diff>>31)&1;
        System.out.println("max "+(data1-diff*buffer));
        System.out.println("min "+(data2+diff*buffer));
        scan.close();
    }
}
